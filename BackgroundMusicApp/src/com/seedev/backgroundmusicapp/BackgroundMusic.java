package com.seedev.backgroundmusicapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class BackgroundMusic extends Activity {

	public static final String TAG = "BackgroundMusic APP";

	// Create MediaPlayer object;

	MediaPlayer myPlayer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_background_music);
		Log.d(TAG, "onCreate");
	}
	/*
	 * During onResume event , we have to get the resource and start the media player. 
	 */
	@Override
	protected void onResume() {
		Log.d(TAG, "onResume");
		// create Media player for given resource id.
		myPlayer = MediaPlayer.create(getApplicationContext(),
				R.raw.avicii_vs_thomas_newson);

		// start or resume the playback
		myPlayer.start();

		super.onResume();
	}

	/*
	 * During onPause event , we have to stop paly the music & also release the resource. 
	 */
	@Override
	protected void onPause() {
		Log.d(TAG, "onPause");
		if (myPlayer != null) {
			if (myPlayer.isPlaying()) {//To Check whether mediaplayer is playing or not.
				// Stops playback after playback has been stopped or paused.
				myPlayer.stop();
				// After release media object no longer available.
				myPlayer.release();
			}
		}
		super.onPause();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.background_music, menu);
		return true;
	}

}
