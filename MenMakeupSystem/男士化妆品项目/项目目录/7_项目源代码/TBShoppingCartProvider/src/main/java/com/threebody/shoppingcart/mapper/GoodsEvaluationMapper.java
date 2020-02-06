package com.threebody.shoppingcart.mapper;

import com.threebody.shoppingcart.entity.GoodsEvaluation;
import com.threebody.shoppingcart.entity.GoodsEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsEvaluationMapper {
    int countByExample(GoodsEvaluationExample example);

    int deleteByExample(GoodsEvaluationExample example);

    int deleteByPrimaryKey(Integer gevaid);

    int insert(GoodsEvaluation record);

    int insertSelective(GoodsEvaluation record);

    List<GoodsEvaluation> selectByExample(GoodsEvaluationExample example);

    GoodsEvaluation selectByPrimaryKey(Integer gevaid);

    int updateByExampleSelective(@Param("record") GoodsEvaluation record, @Param("example") GoodsEvaluationExample example);

    int updateByExample(@Param("record") GoodsEvaluation record, @Param("example") GoodsEvaluationExample example);

    int updateByPrimaryKeySelective(GoodsEvaluation record);

    int updateByPrimaryKey(GoodsEvaluation record);
}