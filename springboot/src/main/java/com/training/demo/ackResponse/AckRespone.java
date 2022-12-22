package com.training.demo.ackResponse ;

import org.springframework.stereotype.Component;


public class AckRespone {
	
	private String status;
    private String code;
    private String reason;
    
    private Object content;
    
    public String getReason() {
        return reason;
    }



   public Object getContent() {
        return content;
    }



   public void setContent(Object content) {
        this.content = content;
    }



   public void setReason(String reason) {
        this.reason = reason;
    }



   public AckRespone() {
        
    }        
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }    

}
