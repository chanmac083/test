package com.example.session.form;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class SessionForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name1;
	
	private String name2;
	
	private String name3;
	
	// write title
	private String title;
	
	// write url
	private String url;
	
	// write memo
	private String memo;
	
	
//	private int reject_mail;
//	
//	private String nickName;
//	
//	private String buttonValue;
//	
//	public void setReject_Mail(int reject_mail) {
//		this.reject_mail = reject_mail;
//	}
//	public int getReject_Mail() {
//		return reject_mail;
//	}
//		
//	public void setNickName(String nickName) {
//		this.nickName = nickName;
//	}
//	public String getNickName() {
//		return nickName;
//	}
//	
//	public void setButtonValue(String button_value) {
//		this.buttonValue = button_value;
//	}
//	public String getButtonValue() {
//		return buttonValue;
//	}

	
	
}
