package com.threebody.goods.mapper;

import com.threebody.goods.entity.UserOrders;
import com.threebody.goods.entity.UserOrdersExample;
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