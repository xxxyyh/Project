package com.threebody.orders.entity;

import java.util.List;


import com.github.pagehelper.PageInfo;

//前后端交互统一数据接口
public class JsonResult<T> {
	
	public static final int SUCCESS = 0;

	private int state;
	private String message = "";
	private T data;
	private List<T> datas;
	private  Integer currentid;
	private PageInfo<T> pagedatas;


	//正常响应，返回是一个简单消息
	public JsonResult(String message) {
		this.state = SUCCESS;
		this.message = message;
	}
	
	//正常响应，返回对象
	public JsonResult(T data) {
		this.state = SUCCESS;
		this.data = data;
	}
	
	//正常响应，返回集合
	public JsonResult(List<T> datas) {
		this.state = SUCCESS;
		this.datas = datas;
	}

	//正常响应，返回集合
	public JsonResult(List<T> datas,Integer currentid) {
		this.state = SUCCESS;
		this.datas = datas;
		this.currentid=currentid;
	}

	
	//正常响应，返回分页
	public JsonResult(PageInfo<T> pagedatas) {
		this.state = SUCCESS;
		this.pagedatas = pagedatas;
	}
	
	//异常情况,返回错误消息
	public JsonResult(int state,String message) {
		this.state = state;
		this.message = message;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	public PageInfo<T> getPagedatas() {
		return pagedatas;
	}

	public void setPagedatas(PageInfo<T> pagedatas) {
		this.pagedatas = pagedatas;
	}

	public Integer getCurrentid() {
		return currentid;
	}

	public void setCurrentid(Integer currentid) {
		this.currentid = currentid;
	}

}
