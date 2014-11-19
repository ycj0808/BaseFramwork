package com.icefire.android.baseframework.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class NoActionBarActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().hide();
	}
}
