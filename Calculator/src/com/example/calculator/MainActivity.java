package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText editString;
	private Button btnClear,btnadd,btnmul,btndiv,btnsub,btnequal;
	private Button button1,button2,button3,button5,button6,button7,button9,button10,button11,button14,button15;
	private int operation;
	private double Num2,Num1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editString=(EditText)findViewById(R.id.text);
        btnClear = (Button) findViewById(R.id.btnclear);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnsub = (Button) findViewById(R.id.btnsub);
        button1 =(Button)findViewById(R.id.button1) ;
        button2 =(Button)findViewById(R.id.button2);
        button3 =(Button)findViewById(R.id.button3);
        button5 =(Button)findViewById(R.id.button5);
        button6 =(Button)findViewById(R.id.button6);
        button7= (Button)findViewById(R.id.button7);
        button9= (Button)findViewById(R.id.button9);
        button10= (Button)findViewById(R.id.button10);
        button11= (Button)findViewById(R.id.button11);
        button14= (Button)findViewById(R.id.button14);
        button15= (Button)findViewById(R.id.button15);
        btnequal= (Button)findViewById(R.id.btnequal);
       
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        String no = ((Button)v).getText().toString();
        String txt = editString.getText().toString();
        editString.setText(txt + no);
        	
            }
        };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        button10.setOnClickListener(listener);
        button11.setOnClickListener(listener);
        button15.setOnClickListener(listener);
        
        OnClickListener listener= new OnClickListener();
        View.OnClickListener operationlistener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        if(((Button)(v)).getText().toString().equals("/"))
        {
                 operation=1;
        }
        if(((Button)(v)).getText().toString().equals("*"))
        {
                operation=2;
        }
        if(((Button)(v)).getText().toString().equals("+"))
        {
                operation=3;
        }
        if(((Button)(v)).getText().toString().equals("-"))
        {
                operation=4;
        }
        switch(operation){
        case 1:
            x=Double.parsedouble(edit.getText().toString());
            edit.setText("");
            y=Double.parsedouble(edit.getText().toString());
            edit.setText(x/y);
            break;
        case 2:
                x=Double.parsedouble(edit.getText().toString());
            edit.setText("");
            y=Double.parsedouble(edit.getText().toString());
            edit.setText(x*y);
            break;
        case 3:
                x=Double.parsedouble(edit.getText().toString());
            edit.setText("");
            y=Double.parsedouble(edit.getText().toString());
            edit.setText(x+y);
            break;
        case 4:
                x=Double.parsedouble(edit.getText().toString());
            edit.setText("");
            y=Double.parsedouble(edit.getText().toString());
            edit.setText(x-y);
        }
            }
        };
         }
     }
