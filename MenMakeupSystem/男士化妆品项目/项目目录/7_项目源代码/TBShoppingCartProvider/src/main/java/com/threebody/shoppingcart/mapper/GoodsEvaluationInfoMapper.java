package com.threebody.shoppingcart.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface GoodsEvaluationInfoMapper {

	List<Map<String,Object>> selectGoodsEvaluationInfo(@Param("goodsId")Integer goodsId );
}
