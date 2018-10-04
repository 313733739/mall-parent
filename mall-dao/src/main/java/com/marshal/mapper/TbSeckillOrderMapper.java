package com.marshal.mapper;

import com.marshal.pojo.TbSeckillOrder;

import java.util.List;

public interface TbSeckillOrderMapper {
    List<TbSeckillOrder> selectByCondition(TbSeckillOrder condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillOrder record);

    int insertSelective(TbSeckillOrder record);

    TbSeckillOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSeckillOrder record);

    int updateByPrimaryKey(TbSeckillOrder record);
}