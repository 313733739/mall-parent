package com.marshal.mapper;

import com.marshal.pojo.TbSeckillGoods;

import java.util.List;

public interface TbSeckillGoodsMapper {
    List<TbSeckillGoods> selectByCondition(TbSeckillGoods condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillGoods record);

    int insertSelective(TbSeckillGoods record);

    TbSeckillGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSeckillGoods record);

    int updateByPrimaryKey(TbSeckillGoods record);
}