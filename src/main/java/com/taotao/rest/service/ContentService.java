package com.taotao.rest.service;

import java.util.List;

import com.taotao.pojo.TbContent;

public interface ContentService {
	/**
	 * 根据分类id获取内容列表
	 * @param categoryId
	 * @return
	 */
	public List<TbContent> getContentList(Long categoryId);
}
