package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		// TODO Auto-generated method stub
		List<Dept> list = session.selectList("selectAll");
		return list;
	}

	public Dept selectByDeptno(SqlSession session) {
		// TODO Auto-generated method stub
		Dept d = session.selectOne("selectByDeptno");
		return d;
	}

	public List<Dept> selectAll2(SqlSession session) {
		List<Dept> list = session.selectList("selectAll2");
		return list;
	}

	public List<Dept> multiSelectMap(SqlSession session, Map map) {
		List<Dept> list = session.selectList("multiSelectMap", map);
		return list;
	}

}	// end class
