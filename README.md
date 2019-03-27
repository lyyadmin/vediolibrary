# vediolibrary
2.Add JZVideoPlayer in your layout:

<cn.jzvd.JzvdStd
    android:id="@+id/videoplayer"
    android:layout_width="match_parent"
    android:layout_height="200dp"/>
3.Set the video uri, video thumb url and video title:

JzvdStd jzvdStd = (JzvdStd) findViewById(R.id.videoplayer);
jzvdStd.setUp("http://jzvd.nathen.cn/c6e3dc12a1154626b3476d9bf3bd7266/6b56c5f0dc31428083757a45764763b0-5287d2089db37e62345123a1be272f8b.mp4"
                            , "饺子闭眼睛" , Jzvd.SCREEN_WINDOW_NORMAL);
jzvdStd.thumbImageView.setImage("http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640");
4.In Activity:

@Override
public void onBackPressed() {
    if (Jzvd.backPress()) {
        return;
    }
    super.onBackPressed();
}
@Override
protected void onPause() {
    super.onPause();
    Jzvd.releaseAllVideos();
}
5.In AndroidManifest.xml:

<activity
    android:name=".MainActivity"
    android:configChanges="orientation|screenSize|keyboardHidden"
    android:screenOrientation="portrait" />
    <!-- or android:screenOrientation="landscape"-->
