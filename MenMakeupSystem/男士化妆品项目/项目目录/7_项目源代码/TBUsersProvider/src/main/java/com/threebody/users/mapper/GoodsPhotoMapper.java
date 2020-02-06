package com.threebody.users.mapper;

import com.threebody.users.entity.GoodsPhoto;
import com.threebody.users.entity.GoodsPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPhotoMapper {
    int countByExample(GoodsPhotoExample example);

    int deleteByExample(GoodsPhotoExample example);

    int deleteByPrimaryKey(Integer goodsphotoid);

    int insert(GoodsPhoto record);

    int insertSelective(GoodsPhoto record);

    List<GoodsPhoto> selectByExample(GoodsPhotoExample example);

    GoodsPhoto selectByPrimaryKey(Integer goodsphotoid);

    int updateByExampleSelective(@Param("record") GoodsPhoto record, @Param("example") GoodsPhotoExample example);

    int updateByExample(@Param("record") GoodsPhoto record, @Param("example") GoodsPhotoExample example);

    int updateByPrimaryKeySelective(GoodsPhoto record);

    int updateByPrimaryKey(GoodsPhoto record);
}