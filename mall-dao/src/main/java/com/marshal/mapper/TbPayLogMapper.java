package com.marshal.mapper;

import com.marshal.pojo.TbPayLog;

import java.util.List;

public interface TbPayLogMapper {
    List<TbPayLog> selectByCondition(TbPayLog condition);

    int deleteByPrimaryKey(String outTradeNo);

    int insert(TbPayLog record);

    int insertSelective(TbPayLog record);

    TbPayLog selectByPrimaryKey(String outTradeNo);

    int updateByPrimaryKeySelective(TbPayLog record);

    int updateByPrimaryKey(TbPayLog record);
}