package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CartDAO;
import com.dto.CartDTO;

public class CartService {
	CartDAO dao = new CartDAO();
	
	public int cartAdd(CartDTO xx) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			n = dao.cartAdd(session, xx);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

}
