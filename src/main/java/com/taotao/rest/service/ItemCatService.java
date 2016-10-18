package com.taotao.rest.service;

import com.taotao.common.pojo.ItemCatResult;



public interface ItemCatService {
	/**
	 * 查询叶子节点
	 * @param parentId
	 * @return
	 */
	public ItemCatResult getItemCatList();
	
	

}
