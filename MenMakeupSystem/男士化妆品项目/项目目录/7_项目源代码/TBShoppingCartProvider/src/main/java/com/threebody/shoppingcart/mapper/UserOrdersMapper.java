package com.threebody.shoppingcart.mapper;

import com.threebody.shoppingcart.entity.UserOrders;
import com.threebody.shoppingcart.entity.UserOrdersExample;
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