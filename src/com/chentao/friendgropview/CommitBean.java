package com.chentao.friendgropview;

public class CommitBean {

	public  String who;
	public  String toWho;
	public  String text;
	
	
	/**
	 * 构造函数
	 * @param who 发送者
	 * @param toWho 给谁
	 * @param text 消息体
	 */
	public CommitBean(String who, String toWho, String text) {
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
