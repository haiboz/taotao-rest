package com.taotao.rest.pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 自定义数据格式
 * @author 浮生若梦
 * 2016年10月14日 下午10:20:42
 */
public class ItemCat {
	@JsonProperty("u")
	private String url;
	
	@JsonProperty("n")
	private String name;
	
	@JsonProperty("i")
	private List<?> item;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<?> getItem() {
		return item;
	}

	public void setItem(List<?> item) {
		this.item = item;
	}
	
	
	
}
