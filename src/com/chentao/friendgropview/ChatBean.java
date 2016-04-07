package com.chentao.friendgropview;

public class ChatBean {

	public  String who;
	public  String toWho;
	public  String text;
	
	
	//构造函数
	public ChatBean(String who, String toWho, String text) {
		super();
		this.who = who;
		this.toWho = toWho;
		this.text = text;
	}
	
	
	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}
	public String getToWho() {
		return toWho;
	}
	public void setToWho(String toWho) {
		this.toWho = toWho;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "ChatBean [who=" + who + ", toWho=" + toWho + ", text=" + text + "]";
	}
	
	
}
