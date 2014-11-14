package com.icefire.android.baseframework.activity;

import com.icefire.android.baseframework.R;
import com.icefire.android.baseframework.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_activity_main);
	}
	
}
