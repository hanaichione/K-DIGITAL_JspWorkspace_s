package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {

	public List<EmpDTO> select(SqlSession session) {
		List<EmpDTO> list = session.selectList("com.dto.selectAll");
		return list;
	}

	
	
	/*
	 * public ArrayList<EmpDTO> selectAllEmp(Connection con) { ArrayList<EmpDTO>
	 * list = new ArrayList<EmpDTO>(); PreparedStatement pstmt = null; ResultSet rs
	 * = null;
	 * 
	 * String sql =
	 * "select empno, ename, job, mgr, to_char(hiredate, 'YYYY-MM-DD')hiredate, sal, comm, deptno from emp order by empno desc"
	 * ; try { pstmt=con.prepareStatement(sql); rs = pstmt.executeQuery(); while
	 * (rs.next()) { int empno = rs.getInt("empno"); String ename =
	 * rs.getString("ename"); String job = rs.getString("job"); int mgr =
	 * rs.getInt("mgr"); String hiredate = rs.getString("hiredate"); double sal =
	 * rs.getDouble("sal"); double comm = rs.getDouble("comm"); int deptno =
	 * rs.getInt("deptno"); EmpDTO notice = new EmpDTO(empno, ename, job, mgr,
	 * hiredate, sal, comm, deptno); list.add(notice); } } catch (SQLException e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); } finally { try {
	 * if(rs != null) rs.close(); if(pstmt != null) pstmt.close(); } catch
	 * (SQLException e2) { // TODO: handle exception e2.printStackTrace(); } } //
	 * end finally return list; } // end selectAll
	 */
}
