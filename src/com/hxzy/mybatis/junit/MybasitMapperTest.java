package com.hxzy.mybatis.junit;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.hxzy.mybatis.mapper.UserMapper;
import com.hxzy.mybatis.pojo.QueryVo;
import com.hxzy.mybatis.pojo.User;

public class MybasitMapperTest {
	@Test
	public void test() throws IOException {
		InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sq=  new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession= sq.openSession();
		UserMapper um= sqlSession.getMapper(UserMapper.class);
		QueryVo vo = new QueryVo();
		User u = new User();
		u.setUsername("五");
		vo.setUser(u);
		List<User> users = um.findUserByQueryVo(vo);
		
		for (User user : users) {
			System.out.println(user.getBirthday());
		}
		
		
	}
	
	@Test
	public void test1() throws IOException {
		InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sq=  new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession= sq.openSession();
		UserMapper um= sqlSession.getMapper(UserMapper.class);
		 Integer i = um.countUser();
		 System.out.println(i);
		
		
	}
	@Test
	public void test3() throws IOException {
		InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sq=  new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession= sq.openSession();
		UserMapper um= sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setSex("男");
		user.setUsername("赌神");
		List<User> users =um.selectUserBySexAndUserName(user);
		for (User user2 : users) {
			System.out.println(user2);
		}
		
	}
	
	
	@Test
	public void test4() throws IOException {
		InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
		SqlSessionFactory sq=  new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession= sq.openSession();
		UserMapper um= sqlSession.getMapper(UserMapper.class);
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(2);
		ids.add(4);
		List<User> users=um.selectUserByIds(ids);
		for (User user : users) {
			System.out.println(user);
			
		}
		
	}
	

}
