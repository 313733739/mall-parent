package com.marshal.sellergoods.service;
import com.marshal.pojo.TbSpecificationOption;
import com.marshal.util.ResponseData;

import java.util.List;

public interface SpecificationOptionService {
	public List<TbSpecificationOption> findAll();

	public ResponseData query(TbSpecificationOption condition, int pageNum, int pageSize);

	public TbSpecificationOption queryById(Long id);

	public List<TbSpecificationOption> queryBySpecId(Long id);

	public void save(TbSpecificationOption tbSpecificationOption);

	public void delete(Long[] ids);
}
