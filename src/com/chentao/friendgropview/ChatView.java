package com.chentao.friendgropview;

import java.util.ArrayList;
import java.util.List;

import com.example.friendgropdemo.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ListView;

/**
 * 
 * @des 陈涛测试用聊天Demo View
 * @author Chentao
 * @time 2016年4月7日 上午9:17:50
 */
public class ChatView extends FrameLayout {

	//聊天的ListView
	private ListView mLvChat;
	private Context context;
	
	//聊天的列表
	private List<ChatBean> mChatList;
	private ChatBaseAdapter mBaseAdapter;

	public ChatView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.context = context;
		initView();
	}

	public ChatView(Context context) {
		this(context,null);
	}
	
	private void initView() {
		LayoutInflater.from(getContext()).inflate(R.layout.view_chatview, this);
		mLvChat = (ListView) findViewById(R.id.lv_chat);
		
		mChatList = new ArrayList<ChatBean>();
		mBaseAdapter = new ChatBaseAdapter(context, mChatList);
		
		//设置数据
		mLvChat.setAdapter(mBaseAdapter);
	}
	
	/**
	 * 
	 * @param who 谁发的回复
	 * @param text 发的内容
	 */
	public void reply(String who,String text){
		ChatBean chatBean = new ChatBean(who, null, text);
		UpdateData(chatBean);
	}
	
	/**
	 * 
	 * @param who 谁发的回复
	 * @param toWho 给谁的
	 * @param text 发的内容
	 */
	public void reply(String who,String toWho,String text){
		ChatBean chatBean = new ChatBean(who, toWho, text);
		UpdateData(chatBean);
	}
	
	/**
	 * 更新数据
	 * @param chatBean
	 */
	private void UpdateData(ChatBean chatBean){
		mChatList.add(chatBean);
		mBaseAdapter.notifyDataSetChanged();
	}
	
}
