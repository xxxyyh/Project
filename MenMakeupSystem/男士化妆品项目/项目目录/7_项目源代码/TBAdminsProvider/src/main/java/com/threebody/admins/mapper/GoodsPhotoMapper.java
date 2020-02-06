package com.threebody.admins.mapper;

import com.threebody.admins.entity.GoodsPhoto;
import com.threebody.admins.entity.GoodsPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsPhotoMapper {
    int countByExample(GoodsPhotoExample example);

    int deleteByExample(GoodsPhotoExample example);

    int insert(GoodsPhoto record);

    int insertSelective(GoodsPhoto record);

    List<GoodsPhoto> selectByExample(GoodsPhotoExample example);

    int updateByExampleSelective(@Param("record") GoodsPhoto record, @Param("example") GoodsPhotoExample example);

    int updateByExample(@Param("record") GoodsPhoto record, @Param("example") GoodsPhotoExample example);
}