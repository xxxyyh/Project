package com.threebody.shoppingcart.controller;

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

import com.threebody.shoppingcart.entity.GoodsPhoto;
import com.threebody.shoppingcart.entity.GoodsPhotoExample;
import com.threebody.shoppingcart.entity.ShoppingCart;
import com.threebody.shoppingcart.entity.ShoppingCartExample;
import com.threebody.shoppingcart.service.ShoppingCartService;

@RestController
public class ShoppingCartController {

	
	@Autowired 
	private ShoppingCartService shoppingCartService;
	
	
	/**
	 * 	查询用户购物车所有商品
	 * @param Integer
	 * @return List<Map<String,Object>>
	 */
	@GetMapping("/selectSCByUserid")
	public List<Map<String,Object>> selectSCByUserid(@RequestParam("userId") Integer userId){
		//先查找当前用户的购物车
		List<Map<String,Object>> goodsListNoPhotos= shoppingCartService.selectSCByUserid(userId);
		//再查找购物车里面的商品id,返回ids
		List<Integer> ids=new ArrayList<Integer>();
		for(Map<String,Object> gh:goodsListNoPhotos) {
			ids.add((Integer)gh.get("goodsid"));
		}
		int i=0;
		//最后根据商品id查找图片集,并且以map的形式放入List<Map>
		for(Map<String,Object> gh:goodsListNoPhotos) {
			GoodsPhotoExample goodsPhotoExample=new GoodsPhotoExample();
			goodsPhotoExample.createCriteria().andGoodsidEqualTo(ids.get(i));
			List<GoodsPhoto> phs= shoppingCartService.selectShoppingCartPhoto(goodsPhotoExample);
			List<String> p=new ArrayList<String>();
			for(GoodsPhoto  ph:phs) {
				p.add(ph.getGphotocode());
			}
			gh.put("gphotocode",p);
			i+=1;
		}
		return goodsListNoPhotos;
	}
	
	
	/**
	 * 修改购物车中商品的数量
	 * @param ShoppingCart
	 * @param ShoppingCart
	 * @return boolean
	 */
	@PutMapping("/updateSCWithGoodsNum")
	public boolean updateSCWithGoodsNum(@RequestBody ShoppingCart shoppingCart) {
		return shoppingCartService.updateSCWithGoodsNum(shoppingCart );
	}
	
	
	
	/**
	 * 将商品添加到购物车
	 * @param ShoppingCart
	 * @return boolean
	 */
	@PostMapping("/insertShoppingCarSelective")
	public  boolean insertShoppingCarSelective(@RequestBody  ShoppingCart shoppingCart ) {
		ShoppingCartExample shoppingCartExample=new ShoppingCartExample();
		shoppingCartExample.createCriteria()
		.andGoodsidEqualTo(shoppingCart.getGoodsid())
		.andUseridEqualTo(shoppingCart.getUserid());
		List<ShoppingCart> st=shoppingCartService.selectByExample(shoppingCartExample);
		
		
		//查看商品是否已经存在购物车，存在的话在基础的数量上增加，不存在则直接添加到购物车
		if(st.size()>0) {
			Integer shopcartid=st.get(0).getShopcartid();
			Integer oldnum=st.get(0).getGoodsnum();
			Integer newnum=shoppingCart.getGoodsnum();
			shoppingCart.setGoodsnum(oldnum+newnum);
			shoppingCart.setShopcartid(shopcartid);
			 return shoppingCartService.updateSCWithGoodsNum(shoppingCart);
		}else {
			return  shoppingCartService.insertShoppingCarSelective(shoppingCart);
		}

	}
	
	
	/**
	 * 批量删除ShoppingCar信息
	 * @param   List<ShoppingCart>
	 * @return boolean
	 */
	@DeleteMapping("/deleteShoppingCar")
	public boolean deleteShoppingCar(@RequestBody List<ShoppingCart> shoppingcart) {
		return shoppingCartService.deleteShoppingCar(shoppingcart);
	}
	
	
	
	
}
