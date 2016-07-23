package com.example.ch02.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
Button btn = (Button)findViewById(R.id.btn_OK);
		
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent data = new Intent();
				
				EditText username = (EditText)findViewById(R.id.txt_username);
				
				data.setData(Uri.parse(username.getText().toString()));
				setResult(RESULT_OK, data);
				
				finish();
				
			}
		});
	}

	
}
