package com.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {
	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleMyBatisDAO();
	}

	public List<Dept> selectAll() {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return list;
	}

	public Dept selectByDeptno() {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSqlSession();
		Dept d = null;
		try {
			d = dao.selectByDeptno(session);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return d;
	}

	public List<Dept> selectAll2() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll2(session);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return list;
	}

	public List<Dept> multiSelectMap(Map map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.multiSelectMap(session, map);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return list;
	}

}	// end class
