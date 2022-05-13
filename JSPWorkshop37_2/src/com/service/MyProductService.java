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
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<MyProductDTO> list = null;
		try {
			list = dao.select(session);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
		return list;
	}

	public int deleteProduct(String prodId) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n = 0;
		try {
			n = dao.deleteProduct(session, prodId);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
		return n;
	}

	public int deleteAllProduct(List<String> list) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n = 0;
		try {
			n = dao.deleteAll(session, list);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
		return n;
	}

	public int updateProduct(HashMap<String, Object> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n = 0;
		try {
			n = dao.updateProduct(session, map);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
		return n;
	}
	
}
