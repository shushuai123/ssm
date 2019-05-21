package com.hxzy.mybatis.mapper;

import java.util.List;

import com.hxzy.mybatis.pojo.QueryVo;
import com.hxzy.mybatis.pojo.User;

public interface UserMapper {
	
	public List<User> findUserByQueryVo(QueryVo o);

	
	public Integer countUser();
	
	public List<User> selectUserBySexAndUserName(User u);
	
	public List<User> selectUserByIds(List i);
}
