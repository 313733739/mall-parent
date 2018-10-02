package com.marshal.mapper;

import com.marshal.pojo.TbAreas;
import com.marshal.pojo.TbAreasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAreasMapper {
    long countByExample(TbAreasExample example);

    int deleteByExample(TbAreasExample example);

    int insert(TbAreas record);

    int insertSelective(TbAreas record);

    List<TbAreas> selectByExample(TbAreasExample example);

    int updateByExampleSelective(@Param("record") TbAreas record, @Param("example") TbAreasExample example);

    int updateByExample(@Param("record") TbAreas record, @Param("example") TbAreasExample example);
}