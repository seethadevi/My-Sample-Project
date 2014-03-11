package com.seedev.webviewsample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {
	WebView myWebView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//Find a view that was identified by the id attribute from XML.
		myWebView = (WebView) findViewById(R.id.webView1);
		
		//set the javascript enable true
		myWebView.getSettings().setJavaScriptEnabled(true);
		
		//Load the index.html file into the webview. 
		myWebView.loadUrl("file:///android_asset/index.html");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.webview, menu);
		return true;
	}
}
