package com.icefire.android.baseframework.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
/**
 * 基础类
 * @author yangchj
 * @date 2014-11-14 下午2:39:24
 */
public abstract class BaseActivity extends ActionBarActivity {

	private ActionBar actionBar;
	
	public ActionBar getCustomActionBar() {
		return actionBar;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initActionBar();
		initView();
		initData();
		setListener();
	}
	
	/**
	 * 初始化设置ActionBar
	 */
	private void initActionBar(){
		actionBar=getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(false);
		actionBar.setDisplayShowHomeEnabled(false);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		//屏蔽实体键的menu菜单
		if(keyCode == KeyEvent.KEYCODE_MENU){
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	//初始化元素控件
	protected abstract void initView();
	//接收数据
	protected abstract void initData();
	//设置监听事件
	protected abstract void setListener();
}
