package com.threebody.admins.mapper;

import com.threebody.admins.entity.Admins;
import com.threebody.admins.entity.AdminsExample;
import com.threebody.admins.entity.UserCollection;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminsMapper {
    int countByExample(AdminsExample example);

    int deleteByExample(AdminsExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(Admins record);

    int insertSelective(Admins record);

    List<Admins> selectByExample(AdminsExample example);

    Admins selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") Admins record, @Param("example") AdminsExample example);

    int updateByExample(@Param("record") Admins record, @Param("example") AdminsExample example);

    int updateByPrimaryKeySelective(Admins record);

    int updateByPrimaryKey(Admins record);
    
    Map<String,Object> selectGoodsWithAdmin(@Param("goodsId")  Integer goodsId );
    
    List<Map<String,Object>> selectGoodsPhotos(@Param("goodsId")  Integer goodsId);
    
    
    //以下三个是用户收藏表的增删查改
    UserCollection selectCollection(UserCollection userCollection);
    
    int deleteCollection(UserCollection userCollection);
    
    int insertCollcetion(UserCollection userCollection);
    
    List<Map<String,Object>> selectSalesAmount();
    
}