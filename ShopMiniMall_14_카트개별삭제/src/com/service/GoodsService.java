package com.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GoodsDAO;
import com.dto.GoodsDTO;

public class GoodsService {
	GoodsDAO dao = new GoodsDAO();
	
	public List<GoodsDTO> goodsList(String gCategory) {
		
		List<GoodsDTO> list = null;
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			list = dao.goodsList(session, gCategory);
		} catch(Exception e){
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return list;
	}

	public GoodsDTO goodsRetrieve(String gCode) {
		GoodsDTO dto = new GoodsDTO();
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			dto = dao.goodsRetrieve(session, gCode);
		} catch(Exception e){
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return dto;
	}

}
