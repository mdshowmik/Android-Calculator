package com.Showmik.Calculator;

import java.io.FileInputStream;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class HistoryActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.history);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onRestart();
		historyDetails();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}
    
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
	@Override
    protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	public void historyDetails()
	{
		String file="calculatedHistory";
		final TextView historyTextView=(TextView)findViewById(R.id.texthistory);
		historyTextView.setMovementMethod(new ScrollingMovementMethod());
		
		try
		{
			int count;
			String temp="";
			
			FileInputStream fin=openFileInput(file);
			while((count=fin.read())!=-1)
			{
				temp=temp+Character.toString((char)count);
			}
			historyTextView.setText(temp);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}	
	}
}
