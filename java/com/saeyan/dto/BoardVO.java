package com.saeyan.dto;




import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class BoardVO {
	private int num;
	private String userid;
	private String title;
	private String content;
	private Date writedate;
	private int readcount;
	private int bgroup;
	private int bsequence;
	private int blevel;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public int getBgroup() {
		return bgroup;
	}
	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}
	public int getBsequence() {
		return bsequence;
	}
	public void setBsequence(int bsequence) {
		this.bsequence = bsequence;
	}
	public int getBlevel() {
		return blevel;
	}
	public void setBlevel(int blevel) {
		this.blevel = blevel;
	}
	
	
}
