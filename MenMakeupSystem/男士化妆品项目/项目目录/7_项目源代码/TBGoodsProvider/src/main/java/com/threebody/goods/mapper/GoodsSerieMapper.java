package com.threebody.goods.mapper;

import com.threebody.goods.entity.GoodsSerie;
import com.threebody.goods.entity.GoodsSerieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSerieMapper {
    int countByExample(GoodsSerieExample example);

    int deleteByExample(GoodsSerieExample example);

    int deleteByPrimaryKey(Integer gsid);

    int insert(GoodsSerie record);

    int insertSelective(GoodsSerie record);

    List<GoodsSerie> selectByExample(GoodsSerieExample example);

    GoodsSerie selectByPrimaryKey(Integer gsid);

    int updateByExampleSelective(@Param("record") GoodsSerie record, @Param("example") GoodsSerieExample example);

    int updateByExample(@Param("record") GoodsSerie record, @Param("example") GoodsSerieExample example);

    int updateByPrimaryKeySelective(GoodsSerie record);

    int updateByPrimaryKey(GoodsSerie record);
}