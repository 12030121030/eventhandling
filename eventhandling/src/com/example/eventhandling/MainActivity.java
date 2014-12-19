
	package com.example.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

	public class MainActivity extends Activity {
	   
	    private Button click;
	    private EditText name;
	    
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	       
	       click = (Button) findViewById(R.id.btnClick);
	       name = (EditText) findViewById(R.id.editText1);
	       
	        OnClickListener listener = new OnClickListener(){
	             
	        	public void onClick(View v) {
	Toast.makeText(getApplicationContext(), name.getText(), Toast.LENGTH_LONG).show();
	
	        	}
	        };
	        
	         click.setOnClickListener(listener);


	    }
	  
	   
	}
   