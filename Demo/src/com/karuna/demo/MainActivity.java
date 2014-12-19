package com.karuna.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	private static final String TAG="ACTIVITY LIFECYCLE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "inside onCreate");
    }
    
    protected void onStart() {
	super.onStart();
	Log.e(TAG, "inside onStart");
    }
    
    protected void onRestart() {
    	super.onRestart();
    	Log.e(TAG, "inside onRestart");
        }
        
    protected void onResume() {
    	super.onResume();
    	Log.e(TAG, "inside onResume");
        }
    
    protected void onPause() {
    	super.onPause();
    	Log.e(TAG, "inside onPause");
        }
        
    protected void onStop() {
    	super.onStop();
    	Log.e(TAG, "inside onStop");
        }
        
    protected void onDestroy() {
    	super.onDestroy();
    	Log.e(TAG, "inside onDestroy");
        }
        
    
}
