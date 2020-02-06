package com.threebody.shoppingcart.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.threebody.shoppingcart.entity.Admins;
import com.threebody.shoppingcart.entity.Delivery;
import com.threebody.shoppingcart.entity.Goods;
import com.threebody.shoppingcart.entity.JsonResult;
import com.threebody.shoppingcart.entity.ShoppingCart;
import com.threebody.shoppingcart.myfeigninterface.MyFeignInterface;

@RestController
@CrossOrigin   //表明接受跨域请求
public class MyController {
	@Resource
	private MyFeignInterface myFeignInterface;
	

	/**
	 * 	查询用户购物车所有商品
	 * @param Integer
	 * @return JsonResult(List<Mapper<String,Object>>)
	 */
	@GetMapping("/selectSCByUserid")
	public JsonResult<Map<String,Object>> selectSCByUserid(@RequestParam("userId") Integer userId){
		return new JsonResult<Map<String,Object>>(myFeignInterface.selectSCByUserid(userId));
	}
	
	/**
	 * 修改购物车中商品的数量
	 * @param ShoppingCart
	 * @param ShoppingCart
	 * @return JsonResult<ShoppingCart>(String)
	 */
	@PutMapping("/updateSCWithGoodsNum")
	public JsonResult<ShoppingCart> updateSCWithGoodsNum(@RequestBody ShoppingCart shoppingcart  ) {
		String message;
		if(myFeignInterface.updateSCWithGoodsNum(shoppingcart)) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<ShoppingCart>(message);
	}
	
	/**
	 * 将商品添加到购物车
	 * @param ShoppingCart
	 * @return JsonResult<ShoppingCart>(String)
	 */
	@PostMapping("/insertShoppingCarSelective")
	public  JsonResult<ShoppingCart> insertShoppingCarSelective(@RequestBody  ShoppingCart shoppingCart ) {
		String message;
		if(myFeignInterface.insertShoppingCarSelective(shoppingCart)) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<ShoppingCart>(message);
	}
	
	
	/**
	 * 批量删除ShoppingCar信息
	 * @param   List<ShoppingCart>
	 * @return JsonResult<ShoppingCart>(String)
	 */
	@DeleteMapping("/deleteShoppingCar")
	public JsonResult<ShoppingCart> deleteShoppingCar(@RequestBody List<ShoppingCart> shoppingcart) {
		String message;
		if(myFeignInterface.deleteShoppingCar(shoppingcart)) {
			message="success";
		}else {
			message="failed";
		}
		return new JsonResult<ShoppingCart>(message);
	}
	
	
}
