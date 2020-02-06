package com.threebody.orders.feigninterfaceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.github.pagehelper.PageInfo;
import com.threebody.orders.entity.Goods;
import com.threebody.orders.entity.UserOrders;
import com.threebody.orders.myfeigninterface.MyFeignInterface;
@Component
public class MyHystrixFeignImpl implements MyFeignInterface {

	@Override
	public List<Map<String, Object>> selectOrdersAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Map<String, Object>> selectOrderByUserId(int pageSize, int pageNum, String sort, String order,
			Integer userid, String orderid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Map<String, Object>> selectOrderByOrderId(int pageSize, int pageNum, String sort, String order,
			String orderid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Map<String, Object>> selectOrderByAdminId(int pageSize, int pageNum, String sort, String order,
			Integer adminid, String orderid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> selectOrderItemByOrderId(String orderid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOrdersByExampleSelective(UserOrders userOrders) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String insertOrdersSelective(Integer userid, String useraddr, List<Goods> goodsList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteOrders(List<UserOrders> orderList) {
		// TODO Auto-generated method stub
		return false;
	}

}
