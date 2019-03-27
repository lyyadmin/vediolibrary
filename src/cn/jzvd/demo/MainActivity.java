package cn.jzvd.demo;

import android.app.Activity;
import android.os.Bundle;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;
import cn.jzvd.MyJzvdStd;
import cn.jzvd.R;

import com.squareup.picasso.Picasso;

public class MainActivity extends Activity {

	MyJzvdStd myJzvdStd;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.activity_main);

	        myJzvdStd = (MyJzvdStd) findViewById(R.id.jz_video);
	        myJzvdStd.setUp("http://jzvd.nathen.cn/342a5f7ef6124a4a8faf00e738b8bee4/cf6d9db0bd4d41f59d09ea0a81e918fd-5287d2089db37e62345123a1be272f8b.mp4"
	                , "饺子快长大", JzvdStd.SCREEN_NORMAL);
	        Picasso.with(this).load("http://jzvd-pic.nathen.cn/jzvd-pic/1bb2ebbe-140d-4e2e-abd2-9e7e564f71ac.png").into(myJzvdStd.thumbImageView);
	}

    @Override
    protected void onPause() {
        super.onPause();
        Jzvd.resetAllVideos();
    }

    @Override
    public void onBackPressed() {
        if (Jzvd.backPress()) {
            return;
        }
        super.onBackPressed();
    }
}
