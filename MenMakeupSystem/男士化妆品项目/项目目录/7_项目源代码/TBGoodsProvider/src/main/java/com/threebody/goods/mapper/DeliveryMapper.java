package com.threebody.goods.mapper;

import com.threebody.goods.entity.Delivery;
import com.threebody.goods.entity.DeliveryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryMapper {
    int countByExample(DeliveryExample example);

    int deleteByExample(DeliveryExample example);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    List<Delivery> selectByExample(DeliveryExample example);

    int updateByExampleSelective(@Param("record") Delivery record, @Param("example") DeliveryExample example);

    int updateByExample(@Param("record") Delivery record, @Param("example") DeliveryExample example);
}