package cn.jzvd.demo;

import android.app.Application;

/**
 * Created by Nathen
 * On 2015/12/01 11:29
 */
public class ApplicationDemo extends Application {
	CrashHandler handler;
    @Override
    public void onCreate() {
        super.onCreate();
//        LeakCanary.install(this);
        handler = CrashHandler.getInstance();
		handler.init(getApplicationContext());
    }
}
