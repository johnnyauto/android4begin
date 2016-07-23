package com.example.ch02.lifecycle;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class MainActivity extends Activity {

	String tag = "Events";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//--hides the title bar--
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		Log.d(tag, "In the onCreate() event");
	}
	
	public void onStart(){
		super.onStart();
		Log.d(tag, "In the onStart() event");
	}
	
	public void onRestart(){
		super.onRestart();
		Log.d(tag, "In the onRestart() event");
	}
	
	public void onResume(){
		super.onResume();
		Log.d(tag, "In the onResume() event");
	}
	
	public void onPause(){
		super.onPause();
		Log.d(tag, "In the onPause() event");
	}
	
	public void onStop(){
		super.onStop();
		Log.d(tag, "In the onStop() event");
	}
	
	public void onDestroy(){
		super.onDestroy();
		Log.d(tag, "In the onDestroy() event");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
