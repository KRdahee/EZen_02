package com.saeyan.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//CREATE table tv(
//CODE        NUMBER(5),         --순번       
//NAME       VARCHAR2(50),       --tv프로 이름  
//YGC         VARCHAR2(30),      --방송년도,장르,방송사
//rate	      VARCHAR2(10),	     --평점
//genre	      VARCHAR2(2000),   --줄거리
//review	     VARCHAR2(2000)    --코멘트
//);

@Getter
@Setter
@ToString
public class TVVO {

	private int num;
	private String title;
	private String year;
	private String genre;
	private String channel;
	private String country;
	private String age;
	private String rate;
	private String summary;
	private String review;
	private String img;
	private String bimg;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getBimg() {
		return bimg;
	}
	public void setBimg(String bimg) {
		this.bimg = bimg;
	}

}
