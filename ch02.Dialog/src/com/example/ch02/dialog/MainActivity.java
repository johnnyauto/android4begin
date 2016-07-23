package com.example.ch02.dialog;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	CharSequence[] items = {"Google", "Apple", "Microsoft"};
	boolean[] itemChecked = new boolean[items.length];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button btn = (Button)findViewById(R.id.btn_dialog);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				showDialog(0);
				
			}
		});
	}
	
	

	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case 0:
			return new AlertDialog.Builder(this).setIcon(R.drawable.ic_launcher)
					.setTitle("This is a dialog wiht some simple text...")
					.setPositiveButton("OK", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							Toast.makeText(getBaseContext(), "OK clicked!", Toast.LENGTH_SHORT).show();
							
						}
					})
					.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							Toast.makeText(getBaseContext(), "Cancel clicked!", Toast.LENGTH_SHORT).show();
							
						}
					})
					.setMultiChoiceItems(items, itemChecked, new DialogInterface.OnMultiChoiceClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which, boolean isChecked) {
							Toast.makeText(getBaseContext(), items[which] + (isChecked ? "checked!" : "unchecked!"), Toast.LENGTH_SHORT).show();
							
						}
					}).create();
		
		}
		return null;
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
