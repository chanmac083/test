package com.example.hello.form;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class HelloForm implements Serializable {

	private int reject_mail;
	
	private String nickName;
	
	private String buttonValue;
	
	public void setReject_Mail(int reject_mail) {
		this.reject_mail = reject_mail;
	}
	public int getReject_Mail() {
		return reject_mail;
	}
		
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNickName() {
		return nickName;
	}
	
	public void setButtonValue(String button_value) {
		this.buttonValue = button_value;
	}
	public String getButtonValue() {
		return buttonValue;
	}

	
	
}
