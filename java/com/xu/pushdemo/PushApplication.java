package com.xu.pushdemo;

import android.app.Application;
import cn.jpush.android.api.JPushInterface;
/*
* 极光推送
* */
public class PushApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		JPushInterface.setDebugMode(true);
	    JPushInterface.init(this);
	}
}
