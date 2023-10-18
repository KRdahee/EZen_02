package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
---------- - ------------- 
ID           VARCHAR2(10)  
TITLE        VARCHAR2(100) 
RATE         VARCHAR2(10)  
DIB          NUMBER(1)     
REVIEW       VARCHAR2(400) 
PICTUREURL   VARCHAR2(50)
*/

@Getter
@Setter
@ToString

public class MyListVO {
	
	private String id;
	private String title;
	private String category;
	private String img;
	private String num;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}
