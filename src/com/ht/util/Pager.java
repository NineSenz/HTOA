package com.ht.util;

import java.util.List;

public class Pager<T> {
	
	private int pageNo;  //当前页
	private int pageSize; //一页个数
	private int total; //总条数
	private List<T> rows; //数据存放

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
	public int getBeginIndex() {
		return (pageNo - 1) * pageSize;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

    @Override
    public String toString() {
        return "Pager{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", rows=" + rows +
                '}';
    }
}
