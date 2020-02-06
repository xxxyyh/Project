package com.threebody.orders.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.threebody.orders.config.CreateOrderId;
import com.threebody.orders.entity.Goods;
import com.threebody.orders.entity.OrderItems;
import com.threebody.orders.entity.UserOrders;
import com.threebody.orders.service.UserOrderService;

@RestController
public class UserOrdersController {
	
	@Autowired
	private UserOrderService userOrderService;
	
	/**
	 * 获取所有用户订单信息
	 * @return
	 */
	@GetMapping("/selectOrdersAll")
	public List<Map<String,Object>> selectOrdersAll(){
		return userOrderService.selectOrdersAll();
	}
	
	/**
	 * 通过用户编号获取用户订单信息
	 * @return
	 */
	@GetMapping("/selectOrderByUserId")
	public PageInfo<Map<String,Object>> selectOrderByUserId(
			@RequestParam("pageSize") int pageSize,@RequestParam("pageNum") int pageNum,
			@RequestParam("sort") String sort,@RequestParam("order")String order,
			@RequestParam("userid") Integer userid,@RequestParam("orderid") String orderid){
		System.out.println("userid-->"+userid);
		System.out.println("orderid-->"+orderid);
		PageHelper.startPage(pageNum,pageSize,sort+" "+order);
		if(orderid != "") {
			return new PageInfo<Map<String, Object>>(userOrderService.selectOrderByOrderId(orderid));
		}else {
			return new PageInfo<Map<String, Object>>(userOrderService.selectOrderByUserId(userid));			
		}
	}
	
	/**
	 * 通过订单编号获取订单信息
	 * @return
	 */
	@GetMapping("/selectOrderByOrderId")
	public PageInfo<Map<String,Object>> selectOrderByOrderId(
			@RequestParam("pageSize") int pageSize,@RequestParam("pageNum") int pageNum,
			@RequestParam("sort") String sort,@RequestParam("order")String order,
			@RequestParam("orderid") String orderid){
		PageHelper.startPage(pageNum,pageSize,sort+" "+order);
		return new PageInfo<Map<String, Object>>(userOrderService.selectOrderByOrderId(orderid));
	}
	
	/**
	 * 通过商家编号和订单便函查询userorders、orderitems、users获取本店铺的所有用户订单信息
	 * @return
	 */
	@GetMapping("/selectOrderByAdminId")
	public PageInfo<Map<String,Object>> selectOrderByAdminId(
			@RequestParam("pageSize") int pageSize,@RequestParam("pageNum") int pageNum,
			@RequestParam("sort") String sort,@RequestParam("order")String order,
			@RequestParam("adminid") Integer adminid,@RequestParam("orderid") String orderid){
		PageHelper.startPage(pageNum,pageSize,sort+" "+order);
		return new PageInfo<Map<String, Object>>(userOrderService.selectOrderByAdminId(adminid, orderid));
	}
	
	/**
	 * 通过订单的编号查询订单的详情信息
	 * @param orderid
	 * @return
	 */
	@GetMapping("/selectOrderItemByOrderId")
	public List<Map<String,Object>> selectOrderItemByOrderId(@RequestParam("orderid") String orderid){
		
		return userOrderService.selectOrderItemByOrderId(orderid);
	}
	
	/**
	 * 通过订单编号选择性修改用户订单信息(如：订单的支付状态)
	 * @return
	 */
	@PutMapping("/updateOrders")
	public boolean updateOrdersByExampleSelective(@RequestBody UserOrders userOrders){
		return userOrderService.updateOrdersByExampleSelective(userOrders);
	}
	
	/**
	 * userorders添加用户订单信息，orderitems添加订单详情信息（用于用户的结算场景等）
	 * @return
	 */
	@PostMapping("/insertOrders")
	public String insertOrdersSelective(@RequestParam("userid") Integer userid,@RequestParam("useraddr") String useraddr,@RequestBody List<Goods> goodsList){
		UserOrders userOrders = new UserOrders();
		//生成用户订单编号
		String orderid = CreateOrderId.getOrderId();
		userOrders.setOrdersid(orderid);
		userOrders.setUserid(userid);
		userOrders.setUseraddr(useraddr);
		List<OrderItems> orderList = new ArrayList<OrderItems>();
		for(Goods goods:goodsList) {
			OrderItems orderItems = new OrderItems();
			orderItems.setGoodid(goods.getGoodsid());
			orderItems.setOrdersid(orderid);
			orderItems.setItemsnum(goods.getGoodsstock());
			orderList.add(orderItems);
		}
		if(userOrderService.insertOrdersSelective(userOrders, orderList)) {
			return orderid;
		}else {
			return "error";
		}
	}
	
	/**
	 * 批量删除userorders、orderitems信息
	 * @return
	 */
	@DeleteMapping("/deleteOrders")
	public boolean deleteOrders(@RequestBody List<UserOrders> orderList){
		return userOrderService.deleteOrders(orderList);
	}
}
