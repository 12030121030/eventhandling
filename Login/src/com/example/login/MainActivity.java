package com.example.login;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity {

	private Button btnClick;
	private float no=(float) 20.5;
	private CheckBox stream;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnClick = (Button) findViewById(R.id.btnClick);
        btnClick.setText(Html.fromHtml("<u>" + 
        getResources().getString(R.string.hello_world) + "</u>"));
        btnClick.setTextColor(Color.RED);
        btnClick.setTextSize((float)20.5); 
        btnClick.setBackgroundColor(getResources().getColor(R.color.blue));
        
        
        stream = (CheckBox) findViewById(R.id.stream);
        stream.setTextColor(Color.RED);
        stream.setTextSize((float)20.5);
        stream.setChecked(true);
        
    }
    
}
