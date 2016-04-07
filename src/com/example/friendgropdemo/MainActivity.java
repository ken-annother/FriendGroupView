package com.example.friendgropdemo;

import com.chentao.friendgropview.CommitView;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		CommitView  cv = (CommitView) findViewById(R.id.cv_1);
		cv.reply("自己", "哈哈");
		
		cv.reply("这个名字是不是很长，哈哈，因为我是用来测试换行的，哈哈", "哈哈");
		
		cv.reply("张三", "李四","我又回复啦我又回复啦我又回复啦我又回复啦我又回复啦我又回复啦我又回复啦我又回复啦我又回复啦我又回复啦我又回复啦我又回复啦");
	}

}
