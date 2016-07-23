package com.example.orientations;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Log.d("StateInfo", "onCreate");
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Log.d("StateInfo", "onStart");
		super.onStart();
		
	}

	@Override
	protected void onResume() {
		Log.d("StateInfo", "onResume");
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		Log.d("StateInfo", "onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Log.d("StateInfo", "onStop");
		super.onStop();
	}

	@Override
	protected void onRestart() {
		Log.d("StateInfo", "onRestart");
		super.onRestart();
	}

	@Override
	protected void onDestroy() {
		Log.d("StateInfo", "onDestroy");
		super.onDestroy();
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
