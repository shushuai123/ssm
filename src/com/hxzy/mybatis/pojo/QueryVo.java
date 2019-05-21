package com.hxzy.mybatis.pojo;

import java.io.Serializable;
import java.util.List;

public class QueryVo implements Serializable{

	
	private User user;
	
	private List<Integer> list;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	
	
	
	
}
