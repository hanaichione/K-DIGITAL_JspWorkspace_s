package com.service;

import java.util.HashMap;
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

	public int cartDel(int num) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			n = dao.cartDel(session, num);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	public int cartUpdate(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			CartDAO dao = new CartDAO();
			n = dao.cartUpdate(session, map);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}// end cartAdd

	public int cartAllDel(List<String> list) {
		SqlSession session = MySqlSessionFactory.getSession();
		int n = 0;
		try {
			CartDAO dao = new CartDAO();
			n = dao.cartAllDel(session, list);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	public CartDTO cartbyNum(String num) {
		SqlSession session = MySqlSessionFactory.getSession();
		CartDTO cDTO = new CartDTO();
		try {
			CartDAO dao = new CartDAO();
			cDTO = dao.cartbyNum(session, num);
			System.out.println("CartService==========="+cDTO);
		} finally {
			session.close();
		}
		return cDTO;
	}


}
