package com.example.scroll;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class CheckedChangeListnerActivity extends Activity {

	private RadioGroup rgCase;
	private EditText editString;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_checked_change_listner);
		rgCase = (RadioGroup) findViewById(R.id.rgCase);
		editString = (EditText) findViewById(R.id.editText);
		OnCheckedChangeListener listner = new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int id) {
				String newString;
				switch(id) {
				case R.id.lCase:
					newString = 
					editString.getText().toString().toLowerCase();
					break;
					editString.setText(newString);
				case R.id.uCase:
					newString = 
					editString.getText().toString().toUpperCase();
					break;
				}
				
			}
		};
		
	}


}
