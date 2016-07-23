package com.example.basicview2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

public class MainActivity extends ActionBarActivity {

	private static int progress;
	private ProgressBar progressBar;
	private int progressStatus = 0;
	private Handler handler = new Handler();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		progress = 0;
		progressBar = (ProgressBar) findViewById(R.id.progressbar);
		
		//do some work in background
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// do some work here 
				while(progressStatus < 10){
					progressStatus = doSomeWork();
				}
				
				//hides the progress bar
				handler.post(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						progressBar.setVisibility(8);
					}
				});
				
			}
		});
	}
	
	private int doSomeWork(){
		try{
			//--simulate doing some work
			Thread.sleep(500);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		return ++progress;
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
