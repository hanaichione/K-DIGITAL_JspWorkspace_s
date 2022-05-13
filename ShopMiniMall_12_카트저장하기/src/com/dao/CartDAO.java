package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;

public class CartDAO {

	public int cartAdd(SqlSession session, CartDTO xx) {
		int n = session.insert("cartAdd", xx);
		return n;
	}

}
