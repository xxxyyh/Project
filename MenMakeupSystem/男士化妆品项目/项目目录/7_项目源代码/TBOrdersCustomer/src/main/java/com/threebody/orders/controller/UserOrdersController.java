package com.threebody.orders.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.threebody.orders.entity.Goods;
import com.threebody.orders.entity.JsonResult;
import com.threebody.orders.entity.UserOrders;
import com.threebody.orders.myfeigninterface.MyFeignInterface;

@RestController
@CrossOrigin
public class UserOrdersController {
	@Resource
	private MyFeignInterface myFeignInterface;

	/**
	 * 获取所有用户订单信息
	 * @return
	 */
	@GetMapping("/selectOrdersAll")
	public JsonResult<Map<String,Object>> selectOrdersAll(int pageSize,int pageNum,String sort,
			String order){
		return new JsonResult<Map<String,Object>>(new PageInfo<Map<String,Object>>(myFeignInterface.selectOrdersAll()));
	}
	
	/**
	 * 通过用户编号获取用户订单信息
	 * @return
	 */
	@GetMapping("/selectOrderByUserId")
	public JsonResult<Map<String,Object>> selectOrderByUserId(int pageSize,int pageNum,String sort,
			String order,Integer userid,String orderid){
		System.out.println("userid-->"+userid);
		System.out.println("orderid-->"+orderid);
		return new JsonResult<Map<String,Object>>(myFeignInterface.selectOrderByUserId(pageSize,pageNum,sort,order,userid,orderid));
	}
	
	/**
	 * 通过订单编号获取订单信息
	 * @return
	 */
	@GetMapping("/selectOrderByOrderId")
	public JsonResult<Map<String,Object>> selectOrderByOrderId(int pageSize,int pageNum,String sort,
			String order,String orderid){
		return new JsonResult<Map<String,Object>>(myFeignInterface.selectOrderByOrderId(pageSize,pageNum,sort,order,orderid));
	}
	
	/**
	 * 通过商家编号和订单便函查询userorders、orderitems、users获取本店铺的所有用户订单信息
	 * @return
	 */
	@GetMapping("/selectOrderByAdminId")
	public JsonResult<Map<String,Object>> selectOrderByAdminId(int pageSize,int pageNum,String sort,
			String order,Integer adminid,String orderid){
		return new JsonResult<Map<String,Object>>(myFeignInterface.selectOrderByAdminId(pageSize,pageNum,sort,order,adminid,orderid));
	}
	
	/**
	 * 通过订单的编号查询订单的详情信息
	 * @param orderid
	 * @return
	 */
	@GetMapping("/selectOrderItemByOrderId")
	public JsonResult<Map<String,Object>> selectOrderItemByOrderId(@RequestParam("orderid") String orderid){
		return new JsonResult<Map<String,Object>>(myFeignInterface.selectOrderItemByOrderId(orderid));
	}
	
	/**
	 * 通过订单编号选择性修改用户订单信息(如：订单的支付状态)
	 * @return
	 */
	@PutMapping("/updateOrders")
	public JsonResult<Boolean> updateOrdersByExampleSelective(@RequestBody UserOrders userOrders){
		return new JsonResult<>(myFeignInterface.updateOrdersByExampleSelective(userOrders));
	}
	
	/**
	 * userorders添加用户订单信息，orderitems添加订单详情信息（用于用户的结算场景等）
	 * @return
	 */
	@PostMapping("/insertOrders")
	public JsonResult<String> insertOrdersSelective(@RequestParam("userid") Integer userid,@RequestParam("useraddr") String useraddr,@RequestBody List<Goods> goodsList){
		return new JsonResult<>(myFeignInterface.insertOrdersSelective(userid, useraddr, goodsList));
	}
	
	/**
	 * 批量删除userorders、orderitems信息
	 * @return
	 */
	@DeleteMapping("/deleteOrders")
	public JsonResult<Boolean> deleteOrders(@RequestBody List<UserOrders> orderList){
		return new JsonResult<>(myFeignInterface.deleteOrders(orderList));
	}

}
