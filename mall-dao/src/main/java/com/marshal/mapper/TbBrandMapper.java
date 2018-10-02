package com.marshal.mapper;

import com.marshal.pojo.TbBrand;
import com.marshal.pojo.TbBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBrandMapper {
    long countByExample(TbBrandExample example);

    int deleteByExample(TbBrandExample example);

    int insert(TbBrand record);

    int insertSelective(TbBrand record);

    List<TbBrand> selectByExample(TbBrandExample example);

    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);
}