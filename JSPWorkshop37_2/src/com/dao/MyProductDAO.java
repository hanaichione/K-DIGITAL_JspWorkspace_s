package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.MyProductDTO;

public class MyProductDAO {

	public List<MyProductDTO> select(SqlSession session) {
		List<MyProductDTO> list = session.selectList("selectAll");
		return list;
	}

	public int deleteProduct(SqlSession session, String prodId) {
		int n = session.delete("dleteByprodId", prodId);
		return n;
	}

	public int deleteAll(SqlSession session, List<String> list) {
		int n = session.delete("deleteAll", list);
		return n;
	}

	public int updateProduct(SqlSession session, HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		int n = session.update("updateProduct", map);
		return n;
	}
	
	

}
