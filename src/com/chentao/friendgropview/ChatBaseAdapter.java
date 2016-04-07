package com.chentao.friendgropview;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ChatBaseAdapter extends BaseAdapter {

	Context context;
	List<ChatBean> chatList;
	
	public ChatBaseAdapter(Context context,List<ChatBean> chatList) {
		this.context = context;
		this.chatList = chatList;
	}
	
	
	@Override
	public int getCount() {
		
		if(chatList !=null){
			return chatList.size();
		}
		
		return 0;
	}

	
	@Override
	public ChatBean getItem(int position) {
		return chatList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if(convertView == null){
			convertView = new TextView(context);
		}
		
		TextView tv = (TextView)convertView;
		tv.setTextSize(18);
		tv.setTextColor(Color.DKGRAY);
		
		
		ChatBean chatBean = chatList.get(position);
		
		String displayText;
		
		if(chatBean.toWho == null){
			displayText = chatBean.who + ":" + chatBean.text;
		}else{
			displayText = chatBean.who  + " 回复 " + chatBean.toWho + ":" + chatBean.text;
		}
		
		SpannableStringBuilder style=new SpannableStringBuilder(displayText); 
		
	    style.setSpan(new ForegroundColorSpan(Color.GRAY),0,chatBean.who.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); 
	   
	    if(chatBean.toWho != null){
	    	style.setSpan(new ForegroundColorSpan(Color.GRAY),chatBean.who.length() + 4,chatBean.who.length() + 4 + chatBean.toWho.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); 
	    }
	     
	     
	    //设置文本
	    tv.setText(style);
	    
		return convertView;
	}

}
