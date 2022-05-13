package com.service;

import java.util.List;

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

	public List<CartDTO> cartList(String userid) {
		List<CartDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			list = dao.cartList(session, userid);
		} finally {
			session.close();
		}
		return list;
	}

}
