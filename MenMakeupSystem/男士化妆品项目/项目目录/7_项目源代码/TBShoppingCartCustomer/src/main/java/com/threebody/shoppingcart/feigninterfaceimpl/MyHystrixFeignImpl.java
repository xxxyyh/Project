package com.threebody.shoppingcart.feigninterfaceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.threebody.shoppingcart.entity.Admins;
import com.threebody.shoppingcart.entity.Delivery;
import com.threebody.shoppingcart.entity.Goods;
import com.threebody.shoppingcart.entity.JsonResult;
import com.threebody.shoppingcart.entity.ShoppingCart;
import com.threebody.shoppingcart.myfeigninterface.MyFeignInterface;
@Component
public class MyHystrixFeignImpl implements MyFeignInterface {

	@Override
	public List<Map<String, Object>> selectSCByUserid(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean insertShoppingCarSelective(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteShoppingCar(List<ShoppingCart> shoppingcart) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean updateSCWithGoodsNum(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
