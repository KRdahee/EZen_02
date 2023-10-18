package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReplyVO {
	int rno;
	int code;
	String userid;
	String contents;
	int rgroup;
	int rsequence;
	String title;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getRgroup() {
		return rgroup;
	}
	public void setRgroup(int rgroup) {
		this.rgroup = rgroup;
	}
	public int getRsequence() {
		return rsequence;
	}
	public void setRsequence(int rsequence) {
		this.rsequence = rsequence;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}