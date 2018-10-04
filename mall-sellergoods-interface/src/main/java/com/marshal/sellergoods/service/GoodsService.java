package com.marshal.sellergoods.service;


import com.marshal.pojo.TbGoods;
import com.marshal.util.ResponseData;
import java.util.List;

public interface GoodsService {
	public List<TbGoods> findAll();

	public ResponseData query(TbGoods condition,int pageNum,int pageSize);

	public TbGoods queryById(Long id);

	public void save(TbGoods tbGoods);

	public void delete(Long[] ids);
}
