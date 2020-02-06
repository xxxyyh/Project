package com.threebody.useraddress.feigninterfaceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.threebody.useraddress.entity.Goods;
import com.threebody.useraddress.entity.JsonResult;
import com.threebody.useraddress.entity.UserAddress;
import com.threebody.useraddress.myfeigninterface.MyFeignInterface;
@Component
public class MyHystrixFeignImpl implements MyFeignInterface {

	

	@Override
	public Boolean getUaFromProvider(UserAddress userAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAddress> getUaFromProvider2(Integer useraddressid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public Boolean getUaFromProvider4(UserAddress userAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserAddress> getUaFromProvider5(Integer userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getUaFromProvider3(List<Integer> useraddressid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
