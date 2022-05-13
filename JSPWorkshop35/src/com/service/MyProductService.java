package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MyProductDAO;
import com.dto.MyProductDTO;

public class MyProductService {
	private MyProductDAO dao;

	public MyProductService() {
		dao = new MyProductDAO();
	}
	
	public List<MyProductDTO> select() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<MyProductDTO> list = null;
		
		try {
			list = dao.select(session);
		} finally {
			session.close();
		}
		return list;
	}
	
	public int delete(String id) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int num = 0;
		
		try {
			num = dao.delete(session, id);
			session.commit();
		} finally {
			session.close();
		}
		return num;
	}
}
