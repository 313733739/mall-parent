package com.marshal.mapper;

import com.marshal.pojo.TbBrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbBrandMapper {
    List<TbBrand> selectByCondition(TbBrand condition);

    int deleteByPrimaryKey(Long id);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);

    TbBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);
}