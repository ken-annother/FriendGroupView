package com.chentao.friendgropview;

import java.util.List;

/**
 * 
 * @des 朋友圈的itemBean
 * @author Songkun
 * @time 2016年4月7日 下午10:03:04
 */
public class GroupBean {
	
	/**
	 * 头像地址
	 */
	public String touxiangUrl;
	
	/**
	 * 用户名
	 */
	public String mingzi;
	
	/**
	 * 消息类型
	 */
	public GroupStyle infoStyle;
	
	/**
	 * 点评
	 */
	public String dianping;
	
	/**
	 * 图片集
	 */
	public List<String> tupianji;
	
	/**
	 * 转发图
	 */
	public String zhuanfaTu;
	
	/**
	 * 转发内容
	 */
	public String zhuanfaNeirong;
	
	/**
	 * 消息发表时间
	 */
	public long shijian;
	
	/**
	 * 评论信息集
	 */
	public List<CommitBean> chatList;
}
