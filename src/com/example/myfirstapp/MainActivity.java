package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	private static final String TAG = "LoggerActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    Log.d(TAG, "THIS IS MY LOGGING LINE --- ITÕS GREAT FOR DEBUGGING");
	}
	@Override
	protected void onPause() {
	   super.onPause();
	   Log.d(TAG, "I got onPause!!!");
	 }
	@Override
	protected void onResume() {
	   super.onResume();
	   Log.d(TAG, "I got onResume!!!");
	 }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void sendMessage(View view) {
	    // Do something in response to button
	}

}
