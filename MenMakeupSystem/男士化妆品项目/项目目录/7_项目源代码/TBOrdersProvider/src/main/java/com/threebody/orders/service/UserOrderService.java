package com.threebody.orders.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import com.threebody.orders.entity.DeliveryExample;
import com.threebody.orders.entity.GoodsPhoto;
import com.threebody.orders.entity.GoodsPhotoExample;
import com.threebody.orders.entity.OrderItems;
import com.threebody.orders.entity.UserOrders;
import com.threebody.orders.mapper.DeliveryMapper;
import com.threebody.orders.mapper.GoodsPhotoMapper;
import com.threebody.orders.mapper.OrderInfoMapper;
import com.threebody.orders.mapper.OrderItemsMapper;
import com.threebody.orders.mapper.UserOrdersMapper;



@Service
@CacheConfig(cacheNames="orderService")
public class UserOrderService {
	@Autowired
	private UserOrdersMapper userOrdersMapper;
	@Autowired
	private OrderInfoMapper orderInfoMapper;
	@Autowired
	private OrderItemsMapper orderItemsMapper;
	@Autowired
	private GoodsPhotoMapper goodsPhotoMapper;
	@Autowired
	private DeliveryMapper deliveryMapper;
	
	/**
	 * 获取所有用户订单信息
	 * @return
	 */
	public List<Map<String,Object>> selectOrdersAll(){
		return orderInfoMapper.selectOrdersAll();
	}
	
	/**
	 * 通过用户编号获取用户订单信息
	 * @return
	 */
	public List<Map<String,Object>> selectOrderByUserId(Integer userid){
		return orderInfoMapper.selectOrderByUserId(userid);
	}
	
	/**
	 * 通过订单编号获取订单信息
	 * @return
	 */
	public List<Map<String,Object>> selectOrderByOrderId(String orderid){
		return orderInfoMapper.selectOrderByOrderId(orderid);
	}
	
	/**
	 * 通过商家编号和订单便函查询userorders、orderitems、users获取本店铺的所有用户订单信息
	 * @return
	 */
	public List<Map<String,Object>> selectOrderByAdminId(Integer adminid,String orderid){
		List<Map<String,Object>> orderItemList = orderInfoMapper.selectOrderByAdminId(adminid, orderid);
		GoodsPhotoExample ge = new GoodsPhotoExample();
		DeliveryExample de = new DeliveryExample();
		for(int i = 0;i<orderItemList.size();i++) {
			Map<String,Object> order = new HashMap<String,Object>();
			order = orderItemList.get(i);
			//查找商品的图片路径，并添加到结果中
			ge.createCriteria().andGoodsidEqualTo((Integer)order.get("goodsid"));
			GoodsPhoto goodsPhoto =  goodsPhotoMapper.selectByExample(ge).get(0);
			order.put("gphotocode", goodsPhoto.getGphotocode());
			//查找商品的是否已经发货，并添加到结果中
			de.createCriteria().andOrdersidEqualTo((String)order.get("orderid"));
			if(deliveryMapper.selectByExample(de).size()>0) {
				order.put("isdelivery", "已发货");
			}else {
				order.put("isdelivery", "未发货");
			}
			orderItemList.set(i, order);
		}
		return orderItemList;
	}
	
	/**
	 * 通过订单的编号查询订单的详情信息
	 * @param orderid
	 * @return
	 */
	public List<Map<String,Object>> selectOrderItemByOrderId(String orderid){
		List<Map<String,Object>> orderItemList = orderInfoMapper.selectOrderItemByOrderId(orderid);
		GoodsPhotoExample ge = new GoodsPhotoExample();
		for(int i = 0;i<orderItemList.size();i++) {
			Map<String,Object> order = new HashMap<String,Object>();
			order = orderItemList.get(i);
			ge.createCriteria().andGoodsidEqualTo((Integer)order.get("goodsid"));
			GoodsPhoto goodsPhoto =  goodsPhotoMapper.selectByExample(ge).get(0);
			order.put("gphotocode", goodsPhoto.getGphotocode());
			orderItemList.set(i, order);
		}
		return orderItemList;
	}
	
	
	/**
	 * 通过订单编号选择性修改用户订单信息(如：订单的支付状态)
	 * @return
	 */
	public boolean updateOrdersByExampleSelective(UserOrders userOrders){
		return userOrdersMapper.updateByPrimaryKeySelective(userOrders)>0;
	}
	
	/**
	 * userorders添加用户订单信息，orderitems添加订单详情信息（用于用户的结算场景等）
	 * @return
	 */
	public boolean insertOrdersSelective(UserOrders userOrders,List<OrderItems> orderItemsList){
		int row1 = userOrdersMapper.insertSelective(userOrders);
		int row2 = 0;
		for(OrderItems oi:orderItemsList) {
			row2 = orderItemsMapper.insertSelective(oi)>0?row2+1:row2;
		}
		if(row1>0 && row2==orderItemsList.size()) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 批量删除userorders、orderitems信息
	 * @return
	 */
	public boolean deleteOrders(List<UserOrders> orderIdList){
		int row2 = 0;
		for(UserOrders order:orderIdList) {
			row2 = userOrdersMapper.deleteByPrimaryKey(order.getOrdersid());
		}
		if(row2==orderIdList.size()) {
			return true;
		}else {
			return false;
		}
	}
}
