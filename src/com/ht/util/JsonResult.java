package com.ht.util;

import java.util.List;

public class JsonResult<T> {
	private String result;
	private String msg;
	private int cade;
	private List<T> message;
	public JsonResult(){}
	public JsonResult(int cade,String result,String msg,List<T> message){
		this.cade = cade;
		this.result = result;
		this.msg = msg;
		this.message = message;
		
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCade() {
		return cade;
	}
	public void setCade(int cade) {
		this.cade = cade;
	}
	public List<T> getMessage() {
		return message;
	}
	public void setMessage(List<T> message) {
		this.message = message;
	}
}
