package com.marshal.sellergoods.service;


import com.marshal.pojo.TbItemCat;
import com.marshal.util.ResponseData;
import java.util.List;

public interface ItemCatService {
	public List<TbItemCat> findAll();

	public ResponseData query(TbItemCat condition,int pageNum,int pageSize);

	public TbItemCat queryById(Long id);

	public void save(TbItemCat tbItemCat);

	public void delete(Long[] ids);
}
