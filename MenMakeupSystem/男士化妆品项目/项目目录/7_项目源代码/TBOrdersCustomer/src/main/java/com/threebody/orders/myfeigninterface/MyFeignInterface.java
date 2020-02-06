package com.threebody.orders.myfeigninterface;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.threebody.orders.entity.Goods;
import com.threebody.orders.entity.UserOrders;
import com.threebody.orders.feigninterfaceimpl.MyHystrixFeignImpl;
//填入的是你要链接的服务提供者的id,fallback是断路器的回调方法
@FeignClient(value="eureka-client-provider-orders",fallback =MyHystrixFeignImpl.class)
public interface MyFeignInterface {
	/**
	 * 获取所有用户订单信息
	 * @return
	 */
	@GetMapping("/selectOrdersAll")
	public List<Map<String,Object>> selectOrdersAll();
	
	/**
	 * 通过用户编号获取用户订单信息
	 * @return
	 */
	@GetMapping("/selectOrderByUserId")
	public PageInfo<Map<String,Object>> selectOrderByUserId(
			@RequestParam("pageSize") int pageSize,@RequestParam("pageNum") int pageNum,
			@RequestParam("sort") String sort,@RequestParam("order")String order,
			@RequestParam("userid") Integer userid,@RequestParam("orderid") String orderid);
	
	/**
	 * 通过订单编号获取订单信息
	 * @return
	 */
	@GetMapping("/selectOrderByOrderId")
	public PageInfo<Map<String,Object>> selectOrderByOrderId(
			@RequestParam("pageSize") int pageSize,@RequestParam("pageNum") int pageNum,
			@RequestParam("sort") String sort,@RequestParam("order")String order,
			@RequestParam("orderid") String orderid);
	
	/**
	 * 通过商家编号和订单便函查询userorders、orderitems、users获取本店铺的所有用户订单信息
	 * @return
	 */
	@GetMapping("/selectOrderByAdminId")
	PageInfo<Map<String,Object>> selectOrderByAdminId(
			@RequestParam("pageSize") int pageSize,@RequestParam("pageNum") int pageNum,
			@RequestParam("sort") String sort,@RequestParam("order")String order,
			@RequestParam("adminid") Integer adminid,@RequestParam("orderid") String orderid);
	
	/**
	 * 通过订单的编号查询订单的详情信息
	 * @param orderid
	 * @return
	 */
	@GetMapping("/selectOrderItemByOrderId")
	public List<Map<String,Object>> selectOrderItemByOrderId(@RequestParam("orderid") String orderid);
	
	/**
	 * 通过订单编号选择性修改用户订单信息(如：订单的支付状态)
	 * @return
	 */
	@PutMapping("/updateOrders")
	public boolean updateOrdersByExampleSelective(@RequestBody UserOrders userOrders);
	
	/**
	 * userorders添加用户订单信息，orderitems添加订单详情信息（用于用户的结算场景等）
	 * @return
	 */
	@PostMapping("/insertOrders")
	public String insertOrdersSelective(@RequestParam("userid") Integer userid,@RequestParam("useraddr") String useraddr,@RequestBody List<Goods> goodsList);
	
	/**
	 * 批量删除userorders、orderitems信息
	 * @return
	 */
	@DeleteMapping("/deleteOrders")
	public boolean deleteOrders(@RequestBody List<UserOrders> orderList);
	
}
