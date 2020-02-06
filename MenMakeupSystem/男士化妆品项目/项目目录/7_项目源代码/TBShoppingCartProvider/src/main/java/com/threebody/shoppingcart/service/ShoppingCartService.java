package com.threebody.shoppingcart.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import com.threebody.shoppingcart.entity.GoodsPhoto;
import com.threebody.shoppingcart.entity.GoodsPhotoExample;
import com.threebody.shoppingcart.entity.ShoppingCart;
import com.threebody.shoppingcart.entity.ShoppingCartExample;
import com.threebody.shoppingcart.mapper.GoodsPhotoMapper;
import com.threebody.shoppingcart.mapper.ShoppingCartInfoMapper;
import com.threebody.shoppingcart.mapper.ShoppingCartMapper;

@Service
@CacheConfig(cacheNames="shoppingcartService")
public class ShoppingCartService {
		@Autowired
		private ShoppingCartMapper shoppingCartMapper;
		
		@Autowired
		private ShoppingCartInfoMapper shoppingCartInfoMapper;
		
	
	 @Autowired private GoodsPhotoMapper goodsPhotoMapper;
	 

		/**
		 * 查询用户购物车所有商品
		 * @param Integer
		 * @return  List<Map<String,Object>>
		 */
		public List<Map<String,Object>> selectSCByUserid(Integer userId){
			return shoppingCartInfoMapper.selectShoppingCartInfo(userId);
		}
		
		/**
		 * 查找购物车里商品的照片
		 * @param GoodsPhotoExample
		 * @return  List<GoodsPhoto>
		 */
		public List<GoodsPhoto> selectShoppingCartPhoto(GoodsPhotoExample goodsPhotoExample){
			return  goodsPhotoMapper.selectByExample(goodsPhotoExample);
		}
		
		//以上两个方法配合使用
		
		
		
		/**
		 * 修改购物车中商品的数量
		 * @param ShoppingCart
		 * @return boolean
		 */
		public boolean updateSCWithGoodsNum(ShoppingCart shoppingCart) {
			return shoppingCartMapper.updateByPrimaryKeySelective(shoppingCart)>0?true:false;
		}
		
		
		/**
		 * 将商品添加到购物车
		 * @param ShoppingCart
		 * @return boolean
		 */
		public  boolean insertShoppingCarSelective	(ShoppingCart shoppingCart ) {
			return shoppingCartMapper.insertSelective(shoppingCart)>0?true:false;
		}
		
		
		
		/**
		 * 批量删除ShoppingCar信息
		 * @param List<ShoppingCart>
		 * @return  boolean
		 */
		public boolean deleteShoppingCar(List<ShoppingCart> shoppingcart) {
			int count=0;
			for(ShoppingCart s:shoppingcart) {
				count+= shoppingCartMapper.deleteByPrimaryKey(s.getShopcartid())>0?1:0;
			}
		/*
		 * for(ShoppingCart sp : shoppingcart) { ShoppingCartExample se=new
		 * ShoppingCartExample();
		 * se.createCriteria().andGoodsidEqualTo(sp.getGoodsid()).andUseridEqualTo(sp.
		 * getUserid()); count=count+shoppingCartMapper.deleteByExample(se); }
		 */
			return count==shoppingcart.size()?true:false;
		}
		
		public List<ShoppingCart> selectByExample(ShoppingCartExample shoppingCartExample){
			return shoppingCartMapper.selectByExample(shoppingCartExample);
		}
		
	
	
	
	
	
	
	
	
}
