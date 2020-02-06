package com.threebody.users.mapper;

import com.threebody.users.entity.GoodsFunction;
import com.threebody.users.entity.GoodsFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsFunctionMapper {
    int countByExample(GoodsFunctionExample example);

    int deleteByExample(GoodsFunctionExample example);

    int deleteByPrimaryKey(Integer gfid);

    int insert(GoodsFunction record);

    int insertSelective(GoodsFunction record);

    List<GoodsFunction> selectByExample(GoodsFunctionExample example);

    GoodsFunction selectByPrimaryKey(Integer gfid);

    int updateByExampleSelective(@Param("record") GoodsFunction record, @Param("example") GoodsFunctionExample example);

    int updateByExample(@Param("record") GoodsFunction record, @Param("example") GoodsFunctionExample example);

    int updateByPrimaryKeySelective(GoodsFunction record);

    int updateByPrimaryKey(GoodsFunction record);
}