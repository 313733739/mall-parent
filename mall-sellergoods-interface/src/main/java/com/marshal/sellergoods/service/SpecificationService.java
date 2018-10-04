package com.marshal.sellergoods.service;


import com.marshal.pojo.TbSpecification;
import com.marshal.pojoext.Specification;
import com.marshal.util.ResponseData;
import java.util.List;
import java.util.Map;

public interface SpecificationService {
	public List<TbSpecification> findAll();

	List<Map> getOptionList();

	public ResponseData query(TbSpecification condition,int pageNum,int pageSize);

	public TbSpecification queryById(Long id);

	public void save(Specification Specification);

	public void delete(Long[] ids);
}
