package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;
import com.dto.OrderDTO;

public class CartDAO {

	public int cartAdd(SqlSession session, CartDTO xx) {
		int n = session.insert("cartAdd", xx);
		return n;
	}

	public List<CartDTO> cartList(SqlSession session, String userid) {
		List<CartDTO> list = session.selectList("CartMapper.cartList", userid);
		return list;
	}

	public int cartDel(SqlSession session, int num) {
		int n = session.delete("CartMapper.cartDel", num);
		return n;
	}

	public int cartUpdate(SqlSession session, HashMap<String, Integer> map) {
		int n = session.update("CartMapper.cartUpdate", map);
		return n;
	}

	public int cartAllDel(SqlSession session, List<String> list) {
		int n = session.update("CartMapper.cartAllDel", list);
		return n;
	}

	public CartDTO cartbyNum(SqlSession session, String num2) {
		int num = Integer.parseInt(num2);
		CartDTO dto = session.selectOne("cartbyNum", num);
		System.out.println("CartDAO=============="+dto);
		return dto;
	}

	public int orderDone(SqlSession session, OrderDTO dto) {
		int num = session.insert("CartMapper.orderDone", dto);
		return num;
	}

}
