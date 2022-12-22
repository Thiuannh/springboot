package com.training.demo.Exception;

import org.springframework.http.HttpStatus;


public class ErrorResponse {
	
	
	private HttpStatus errCode;
	
	private String errMsg;

	public ErrorResponse(HttpStatus errCode, String errMsg) {
		super();
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public HttpStatus getErrCode() {
		return errCode;
	}

	public void setErrCode(HttpStatus errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	
	
	
	

}
