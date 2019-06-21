package com.qphone.utils;

public class ResultMsg {
	private String msg;//会带错误信息
	private int code=100;//错误码（200-success/其他-error)
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}


}
