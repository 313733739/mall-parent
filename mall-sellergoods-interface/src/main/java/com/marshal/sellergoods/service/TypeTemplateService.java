package com.marshal.sellergoods.service;


import com.marshal.pojo.TbTypeTemplate;
import com.marshal.util.ResponseData;
import java.util.List;

public interface TypeTemplateService {
	public List<TbTypeTemplate> findAll();

	public ResponseData query(TbTypeTemplate condition,int pageNum,int pageSize);

	public TbTypeTemplate queryById(Long id);

	public void save(TbTypeTemplate tbTypeTemplate);

	public void delete(Long[] ids);
}
