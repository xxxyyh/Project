package com.threebody.useraddress.mapper;

import com.threebody.useraddress.entity.UserOrders;
import com.threebody.useraddress.entity.UserOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOrdersMapper {
    int countByExample(UserOrdersExample example);

    int deleteByExample(UserOrdersExample example);

    int insert(UserOrders record);

    int insertSelective(UserOrders record);

    List<UserOrders> selectByExample(UserOrdersExample example);

    int updateByExampleSelective(@Param("record") UserOrders record, @Param("example") UserOrdersExample example);

    int updateByExample(@Param("record") UserOrders record, @Param("example") UserOrdersExample example);
}