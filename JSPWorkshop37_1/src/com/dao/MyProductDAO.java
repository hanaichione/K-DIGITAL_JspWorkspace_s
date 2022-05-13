package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.MyProductDTO;

public class MyProductDAO {

	public List<MyProductDTO> select(SqlSession session) {
		List<MyProductDTO> list = session.selectList("com.dto.selectAll");
		return list;
	}

	public int delete(SqlSession session, String prodId) {
		int num = session.delete("com.dto.deleteBYProdId", prodId);
		return num;
	}

	public int deleteAll(SqlSession session, List<String> list) {
		int num = session.delete("com.dto.deleteAll", list);
		return num;
	}

	public int updateProduct(SqlSession session, HashMap<String, Object> map) {
		int num = session.update("com.dto.updateProduct", map);
		return num;
	}

}
