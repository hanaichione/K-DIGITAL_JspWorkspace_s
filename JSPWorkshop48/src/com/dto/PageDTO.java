package com.dto;

import java.util.List;

public class PageDTO {

	private List<EmpDTO> list;
	private int curPage;
	private int perPage=2;
	private int totalCount;
	
	private int perBlock=3;
	
	
	
	
	public int getPerBlock() {
		return perBlock;
	}
	public void setPerBlock(int perBlock) {
		this.perBlock = perBlock;
	}
	public List<EmpDTO> getList() {
		return list;
	}
	public void setList(List<EmpDTO> list) {
		this.list = list;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
}
