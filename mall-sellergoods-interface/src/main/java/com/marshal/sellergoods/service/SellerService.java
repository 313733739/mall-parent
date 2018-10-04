package com.marshal.sellergoods.service;


import com.marshal.pojo.TbSeller;
import com.marshal.util.ResponseData;
import java.util.List;

public interface SellerService {
	public List<TbSeller> findAll();

	public ResponseData query(TbSeller condition,int pageNum,int pageSize);

	public TbSeller queryById(String id);

	public void save(TbSeller tbSeller);

	public void delete(String[] ids);
}
