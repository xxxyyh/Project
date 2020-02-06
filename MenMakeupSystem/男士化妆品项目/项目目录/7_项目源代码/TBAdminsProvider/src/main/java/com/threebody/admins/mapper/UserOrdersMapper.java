package com.threebody.admins.mapper;

import com.threebody.admins.entity.UserOrders;
import com.threebody.admins.entity.UserOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOrdersMapper {
    int countByExample(UserOrdersExample example);

    int deleteByExample(UserOrdersExample example);

    int deleteByPrimaryKey(String ordersid);

    int insert(UserOrders record);

    int insertSelective(UserOrders record);

    List<UserOrders> selectByExample(UserOrdersExample example);

    UserOrders selectByPrimaryKey(String ordersid);

    int updateByExampleSelective(@Param("record") UserOrders record, @Param("example") UserOrdersExample example);

    int updateByExample(@Param("record") UserOrders record, @Param("example") UserOrdersExample example);

    int updateByPrimaryKeySelective(UserOrders record);

    int updateByPrimaryKey(UserOrders record);
}