package com.example.textformatter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
	private CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    android.widget.CompoundButton.OnCheckedChangeListener chkBoxListener = 
    new android.widget.CompoundButton.OnCheckedChangeListener() {
    	
    	
		
		@Override
		public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
			// TODO Auto-generated method stub
			CheckBox cb = FindViewById(R.id.checkBox1);
			
		}
    };
    
    android.widget.RadioGroup.OnCheckedChangeListener radioGroupListerner 
   = new android.widget.RadioGroup.OnCheckedChangeListener() {
	
	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		
				}
		    };
    }
}

	
    	