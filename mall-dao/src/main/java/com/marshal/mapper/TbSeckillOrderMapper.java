package com.marshal.mapper;

import com.marshal.pojo.TbSeckillOrder;
import com.marshal.pojo.TbSeckillOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSeckillOrderMapper {
    long countByExample(TbSeckillOrderExample example);

    int deleteByExample(TbSeckillOrderExample example);

    int insert(TbSeckillOrder record);

    int insertSelective(TbSeckillOrder record);

    List<TbSeckillOrder> selectByExample(TbSeckillOrderExample example);

    int updateByExampleSelective(@Param("record") TbSeckillOrder record, @Param("example") TbSeckillOrderExample example);

    int updateByExample(@Param("record") TbSeckillOrder record, @Param("example") TbSeckillOrderExample example);
}