package com.threebody.orders.mapper;

import java.util.List;
import java.util.Map;

public interface OrderInfoMapper {

	/**
	 * 查询userorders、orderitems、users获取所有用户订单信息
	 * @return
	 */
	List<Map<String,Object>> selectOrdersAll();
	
	/**
	 * 通过用户编号查询userorders、orderitems、users获取所有用户订单信息
	 * @return
	 */
	List<Map<String,Object>> selectOrderByUserId(Integer userid);
	
	/**
	 * 通过用户编号查询userorders、orderitems、users获取所有用户订单信息
	 * @return
	 */
	List<Map<String,Object>> selectOrderByOrderId(String orderid);
	
	/**
	 * 通过商家编号和订单便函查询userorders、orderitems、users获取本店铺的所有用户订单信息
	 * @return
	 */
	List<Map<String,Object>> selectOrderByAdminId(Integer adminid,String orderid);
	
	/**
	 * 通过订单的编号查询订单的详情信息
	 * @param orderid
	 * @return
	 */
	List<Map<String,Object>> selectOrderItemByOrderId(String orderid);
	
	
}
