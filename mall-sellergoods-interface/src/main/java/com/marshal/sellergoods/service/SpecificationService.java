package com.marshal.sellergoods.service;


import com.marshal.pojo.TbSpecification;
import com.marshal.pojoext.Specification;
import com.marshal.util.ResponseData;
import java.util.List;

public interface SpecificationService {
	public List<TbSpecification> findAll();

	public ResponseData query(TbSpecification condition,int pageNum,int pageSize);

	public TbSpecification queryById(Long id);

	public void save(Specification Specification);

	public void delete(Long[] ids);
}
