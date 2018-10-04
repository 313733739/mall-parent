package com.marshal.mapper;

import com.marshal.pojo.TbContent;

import java.util.List;

public interface TbContentMapper {
    List<TbContent> selectByCondition(TbContent condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    TbContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKey(TbContent record);
}