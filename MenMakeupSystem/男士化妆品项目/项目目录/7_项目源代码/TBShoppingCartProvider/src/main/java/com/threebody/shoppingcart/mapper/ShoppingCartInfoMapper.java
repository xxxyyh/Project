package com.threebody.shoppingcart.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ShoppingCartInfoMapper {
	
	
	  List<Map<String,Object>> selectShoppingCartInfo(@Param("userId") Integer userId);
	  List<Map<String,Object>> selectShoppingCartPhoto(@Param("goodsId") Integer goodsId);

}
