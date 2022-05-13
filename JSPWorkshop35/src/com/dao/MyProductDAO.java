package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.MyProductDTO;

public class MyProductDAO {

	public MyProductDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<MyProductDTO> select(SqlSession session) {

		List<MyProductDTO> list = session.selectList("com.dto.selectAll");
		return list;

	}

	public int delete(SqlSession session, String id) {
		// TODO Auto-generated method stub
		int num  = session.delete("com.dto.deleteByProdId", id);
		return num;
	}

}
