package com.threebody.shoppingcart.myfeigninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.threebody.shoppingcart.entity.Admins;
import com.threebody.shoppingcart.entity.Delivery;
import com.threebody.shoppingcart.entity.Goods;
import com.threebody.shoppingcart.entity.JsonResult;
import com.threebody.shoppingcart.entity.ShoppingCart;
import com.threebody.shoppingcart.feigninterfaceimpl.MyHystrixFeignImpl;
//填入的是你要链接的服务提供者的id,fallback是断路器的回调方法
@FeignClient(value="EUREKA-CLIENT-PROVIDER-SHOPPINGCART",fallback =MyHystrixFeignImpl.class)
public interface MyFeignInterface {

	/**
	 * 	查询用户购物车所有商品
	 * @param Integer
	 * @return List<Map<String,Object>>
	 */
	@GetMapping("/selectSCByUserid")
	public List<Map<String,Object>> selectSCByUserid(@RequestParam("userId") Integer userId);
	
	/**
	 * 修改购物车中商品的数量
	 * @param ShoppingCart
	 * @param ShoppingCart
	 * @return boolean
	 */
	@PutMapping("/updateSCWithGoodsNum")
	public boolean updateSCWithGoodsNum(@RequestBody ShoppingCart shoppingCart);
	
	/**
	 * 将商品添加到购物车
	 * @param ShoppingCart
	 * @return boolean
	 */
	@PostMapping("/insertShoppingCarSelective")
	public  boolean insertShoppingCarSelective(@RequestBody  ShoppingCart shoppingCart );
	
	
	/**
	 * 批量删除ShoppingCar信息
	 * @param   List<ShoppingCart>
	 * @return boolean
	 */
	@DeleteMapping("/deleteShoppingCar")
	public boolean deleteShoppingCar(List<ShoppingCart> shoppingcart);
	
	
}
