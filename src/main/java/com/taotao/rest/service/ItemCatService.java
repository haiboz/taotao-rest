package com.taotao.rest.service;

import java.util.List;

import com.taotao.rest.pojo.ItemCatResult;


public interface ItemCatService {
	/**
	 * 查询叶子节点
	 * @param parentId
	 * @return
	 */
	public ItemCatResult getItemCatList();
	
	

}
