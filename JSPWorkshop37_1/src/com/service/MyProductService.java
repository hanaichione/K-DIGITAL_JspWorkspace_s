package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MyProductDAO;
import com.dto.MyProductDTO;

public class MyProductService {
	
	MyProductDAO dao = new MyProductDAO();
	
	public List<MyProductDTO> select() {
		List<MyProductDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			list = dao.select(session);
		} finally {
			session.close();
		}
		return list;
	}
	
	public int delete(String prodId) {
		int num = 0;
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			num = dao.delete(session, prodId);
			session.commit();
		} finally {
			session.close();
		}
		return num;
	}
	
	public int deleteAll(List<String> list) {
		int num = 0;
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			num = dao.deleteAll(session, list);
			session.commit();
		} finally {
			session.close();
		}
		return num;
	}
	public int updateProduct(HashMap<String, Object> map) {
		int num = 0;
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			num = dao.updateProduct(session, map);
			session.commit();
		} finally {
			session.close();
		}
		return num;
	}
}
