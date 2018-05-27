package com.Showmik.Calculator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends Activity {
	Button btn0;
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btnDot;
	Button btnPlus;
	Button btnMinus;
	Button btnMult;
	Button btnDiv;
	Button btnEqual;
	Button btnMR;
	Button btnMS;
	Button btnMC;
	Button btnMPlus;
	Button btnMMinus;
	Button btnClear;
	Button btnDelete;
	Button btnHistory;
	
	EditText display;
	
	TextView text;
	
	SharedPreferences sharedpreferences;
	
	FileOutputStream fos=null;

	
	String firstNumber;
	String secondNumber;
	String result;
	String textInput;
	String filename="calculatedHistory";
	public static final String keyOfMemory ="";
	double number1;
	double number2;
	double answer;
	double memory=0.0;
	boolean plus, minus, mult, div;
	
	public static String MyPREFERENCES="0.0";
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

    @Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		btn0=(Button)findViewById(R.id.button_id0);
		btn1=(Button)findViewById(R.id.button_id1);
		btn2=(Button)findViewById(R.id.button_id2);
		btn3=(Button)findViewById(R.id.button_id3);
		btn4=(Button)findViewById(R.id.button_id4);
		btn5=(Button)findViewById(R.id.button_id5);
		btn6=(Button)findViewById(R.id.button_id6);
		btn7=(Button)findViewById(R.id.button_id7);
		btn8=(Button)findViewById(R.id.button_id8);
		btn9=(Button)findViewById(R.id.button_id9);
		btnDot=(Button)findViewById(R.id.button_iddot);
		btnPlus=(Button)findViewById(R.id.button_idplus);
		btnMinus=(Button)findViewById(R.id.button_idminus);
		btnMult=(Button)findViewById(R.id.button_idmult);
		btnDiv=(Button)findViewById(R.id.button_iddiv);
		btnEqual=(Button)findViewById(R.id.button_idequal);
		btnMR=(Button)findViewById(R.id.button_idMR);
		btnMS=(Button)findViewById(R.id.button_idMS);
		btnMC=(Button)findViewById(R.id.button_idMemoryClear);
		btnMPlus=(Button)findViewById(R.id.button_idMPlus);
		btnMMinus=(Button)findViewById(R.id.button_idMMinus);
		btnClear=(Button)findViewById(R.id.button_idClear);
		btnDelete=(Button)findViewById(R.id.button_idDelete);
		btnHistory=(Button)findViewById(R.id.button_idHistory);
		
		display=(EditText)findViewById(R.id.text_view_id);
        text=(TextView)findViewById(R.id.texthist);
		
		display.setInputType(InputType.TYPE_NULL);
		
		sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedpreferences.edit();
		editor.putString(keyOfMemory,"0.0");
	    editor.commit();
        
        btn0.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				int checkLength=display.getText().toString().length();
				if(checkLength<10)
				{
					display.append(getString(R.string.Zero));
				}
				else
				{
					
				}
			}
		});
        
        btn1.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				int checkLength=display.getText().toString().length();
				if(checkLength<10)
				{
					display.append(getString(R.string.One));
				}
				else
				{
					
				}			}
		});
        
        btn2.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				int checkLength=display.getText().toString().length();
				if(checkLength<10)
				{
					display.append(getString(R.string.Two));
				}
				else
				{
					
				}
			}
		});
        
        btn3.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				int checkLength=display.getText().toString().length();
				if(checkLength<10)
				{
					display.append(getString(R.string.Three));
				}
				else
				{
					
				}
			}
		});
        
        btn4.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				int checkLength=display.getText().toString().length();
				if(checkLength<10)
				{
					display.append(getString(R.string.Four));
				}
				else
				{
					
				}
			}
		});
        
        btn5.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				int checkLength=display.getText().toString().length();
				if(checkLength<10)
				{
					display.append(getString(R.string.Five));
				}
				else
				{
					
				}
			}
		});
        
        btn6.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				int checkLength=display.getText().toString().length();
				if(checkLength<10)
				{
					display.append(getString(R.string.Six));
				}
				else
				{
					
				}
			}
		});
        
        btn7.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				int checkLength=display.getText().toString().length();
				if(checkLength<10)
				{
					display.append(getString(R.string.Seven));
				}
				else
				{
					
				}
			}
		});
        
        btn8.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				int checkLength=display.getText().toString().length();
				if(checkLength<10)
				{
					display.append(getString(R.string.Eight));
				}
				else
				{
					
				}
			}
		});
        
        btn9.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				int checkLength=display.getText().toString().length();
				if(checkLength<10)
				{
					display.append(getString(R.string.Nine));
				}
				else
				{
					
				}
			}
		});
        
        btnDot.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				if(display.getText().length()==0)
				{
					display.append(getString(R.string.Zero));
					display.append(getString(R.string.Dot));
				}
				else if(display.getText().length()!=0)
				{
					String checkDot=display.getText().toString();
					String lastChar=checkDot.substring(checkDot.length()-1);
					
					if(lastChar.contains("."))
					{
						display.setText(checkDot);
					}
					else if(checkDot.indexOf(".")!=-1)
					{	
						display.setText(checkDot);
					}
					else
					{
						display.append(getString(R.string.Dot));
					}
				}
			}
		});
        
        btnClear.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				display.setText("");
				text.setText("");
			}
		});
        
        btnDelete.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				if(display.getText().toString().length()==0 && text.getText().toString().length()==0)
				{
					display.setText("");
					text.setText("");
				}
				else if(display.getText().toString().length()!=0 && text.getText().toString().length()==0)
				{
					String checkDeleteChar=display.getText().toString();
					String afterDeleteChar=checkDeleteChar.substring(0, checkDeleteChar.length()-1);
					display.setText(afterDeleteChar);
				}
				else if(display.getText().toString().length()!=0 && text.getText().toString().length()!=0)
				{
					String checkDeleteChar=display.getText().toString();
					String afterDeleteChar=checkDeleteChar.substring(0, checkDeleteChar.length()-1);
					display.setText(afterDeleteChar);
				}
			}
		});
        
        btnPlus.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				firstNumber= display.getText().toString();

				if(firstNumber.length()==0 && text.getText().toString().length()==0)
				{
					plus=false;
					display.setText("");
				}
				else if(firstNumber.length()==0)
				{
					String textIn=text.getText().toString();
					String lastChar=textIn.substring(textIn.length()-1);
					if(lastChar.contains("+"))
					{
						plus=true;
						text.setText(text.getText().toString());
					}
					else if(lastChar.contains("-"))
					{
						plus=true;
						minus=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"+");
					}
					else if(lastChar.contains("*"))
					{
						plus=true;
						mult=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"+");
					}
					else if(lastChar.contains("/"))
					{
						plus=true;
						div=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"+");
					}
					else
					{
						plus=false;
						display.setText("");
						text.setText("");	
					}
				}
				else if(firstNumber.length()!=0 && text.getText().toString().length()!=0)
				{					
					String textIn=text.getText().toString();
					String lastChar=textIn.substring(textIn.length()-1);
					
					if(lastChar.contains("+"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)+Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"+");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("-"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)-Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"+");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("*"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)*Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"+");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("/"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)/Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"+");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else
					{
						firstNumber=result;
						text.setText(firstNumber+"+");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
				}
				else
				{
					text.setText(firstNumber+"+");
					number1 = Double.parseDouble(firstNumber);
					plus=true;
					display.setText("");
				}
			}
		});
        
        btnMinus.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				firstNumber= display.getText().toString();

				if(firstNumber.length()==0 && text.getText().toString().length()==0)
				{
					minus=false;
					display.setText("");
				}
				else if(firstNumber.length()==0)
				{
					String textIn=text.getText().toString();
					String lastChar=textIn.substring(textIn.length()-1);
					if(lastChar.contains("-"))
					{
						minus=true;
						text.setText(text.getText().toString());
					}
					else if(lastChar.contains("+"))
					{
						minus=true;
						plus=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"-");
					}
					else if(lastChar.contains("*"))
					{
						minus=true;
						mult=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"-");
					}
					else if(lastChar.contains("/"))
					{
						plus=true;
						div=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"-");
					}
					else
					{
						minus=false;
						display.setText("");
						text.setText("");	
					}
				}
				else if(firstNumber.length()!=0 && text.getText().toString().length()!=0)
				{					
					String textIn=text.getText().toString();
					String lastChar=textIn.substring(textIn.length()-1);
					
					if(lastChar.contains("+"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)+Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"-");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("-"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)-Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"-");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("*"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)*Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"-");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("/"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)/Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"-");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else
					{
						firstNumber=result;
						text.setText(firstNumber+"-");
						number1 = Double.parseDouble(firstNumber);
						minus=true;
						display.setText("");
					}
				}
				else
				{
					text.setText(firstNumber+"-");
					number1 = Double.parseDouble(firstNumber);
					minus=true;
					display.setText("");
				}
			}
		});
        
        btnMult.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{	
				firstNumber= display.getText().toString();
	
				if(firstNumber.length()==0 && text.getText().toString().length()==0)
				{
					mult=false;
					display.setText("");
				}
				else if(firstNumber.length()==0)
				{
					String textIn=text.getText().toString();
					String lastChar=textIn.substring(textIn.length()-1);
					if(lastChar.contains("*"))
					{
						mult=true;
						text.setText(text.getText().toString());
					}
					else if(lastChar.contains("+"))
					{
						mult=true;
						plus=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"*");
					}
					else if(lastChar.contains("-"))
					{
						mult=true;
						minus=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"*");
					}
					else if(lastChar.contains("/"))
					{
						mult=true;
						div=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"*");
					}
					else
					{
						mult=false;
						display.setText("");
						text.setText("");	
					}
				}
				else if(firstNumber.length()!=0 && text.getText().toString().length()!=0)
				{					
					String textIn=text.getText().toString();
					String lastChar=textIn.substring(textIn.length()-1);
					
					if(lastChar.contains("+"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)+Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"*");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("-"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)-Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"*");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("*"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)*Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"*");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("/"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)/Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"*");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else
					{
						firstNumber=result;
						text.setText(firstNumber+"*");
						number1 = Double.parseDouble(firstNumber);
						mult=true;
						display.setText("");
					}
				}
				else
				{
					text.setText(firstNumber+"*");
					number1 = Double.parseDouble(firstNumber);
					mult=true;
					display.setText("");
				}
			}
		});
        
        btnDiv.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				firstNumber= display.getText().toString();
				
				if(firstNumber.length()==0 && text.getText().toString().length()==0)
				{
					plus=false;
					display.setText("");
				}
				else if(firstNumber.length()==0)
				{
					String textIn=text.getText().toString();
					String lastChar=textIn.substring(textIn.length()-1);
					if(lastChar.contains("/"))
					{
						div=true;
						text.setText(text.getText().toString());
					}
					else if(lastChar.contains("+"))
					{
						div=true;
						plus=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"/");
					}
					else if(lastChar.contains("-"))
					{
						div=true;
						minus=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"/");
					}
					else if(lastChar.contains("*"))
					{
						div=true;
						mult=false;
						String textWithoutOperator=((String) text.getText()).substring(0, text.getText().length()-1);
						text.setText(textWithoutOperator+"/");
					}					
					else
					{
						div=false;
						display.setText("");
						text.setText("");	
					}
				}
				else if(firstNumber.length()!=0 && text.getText().toString().length()!=0)
				{					
					String textIn=text.getText().toString();
					String lastChar=textIn.substring(textIn.length()-1);
					
					if(lastChar.contains("+"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)+Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"/");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("-"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)-Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"/");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("*"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)*Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"/");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else if(lastChar.contains("/"))
					{
						String newOneWithOutSign=((String) text.getText()).substring(0, text.getText().length()-1);
						String newTwo=display.getText().toString();
						Double newResult=Double.parseDouble(newOneWithOutSign)/Double.parseDouble(newTwo);
						firstNumber=newResult.toString();
						text.setText(firstNumber+"/");
						number1 = Double.parseDouble(firstNumber);
						plus=true;
						display.setText("");
					}
					else
					{
						firstNumber=result;
						text.setText(firstNumber+"/");
						number1 = Double.parseDouble(firstNumber);
						div=true;
						display.setText("");
					}
				}
				else
				{
					text.setText(firstNumber+"/");
					number1 = Double.parseDouble(firstNumber);
					div=true;
					display.setText("");
				}
			}
		});
        
        btnMR.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				sharedpreferences=getSharedPreferences(MyPREFERENCES,Context.MODE_PRIVATE);
				String getMemory=sharedpreferences.getString(keyOfMemory, "");
				display.setText(getMemory);
			}
		});
        
        btnMS.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				String getDisplay=display.getText().toString();
				sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
				SharedPreferences.Editor editor = sharedpreferences.edit();
				editor.putString(keyOfMemory,getDisplay);
		        editor.commit();
			}
		});
        
        btnMC.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
				SharedPreferences.Editor editor = sharedpreferences.edit();
				editor.putString(keyOfMemory,"0.0");
		        editor.commit();
			}
		});
        
        btnMPlus.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				sharedpreferences=getSharedPreferences(MyPREFERENCES,Context.MODE_PRIVATE);
				String getMemory=sharedpreferences.getString(keyOfMemory, "0.0");
				Double addWithMemory= Double.parseDouble(getMemory)+Double.parseDouble(getMemory);
				String showAfterAdd=addWithMemory.toString();
				display.setText(showAfterAdd);
				
				String getDisplay=display.getText().toString();
				sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
				SharedPreferences.Editor editor = sharedpreferences.edit();
				editor.putString(keyOfMemory,getDisplay);
		        editor.commit();
			}
		});
        
        btnMMinus.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				sharedpreferences=getSharedPreferences(MyPREFERENCES,Context.MODE_PRIVATE);
				String getMemory=sharedpreferences.getString(keyOfMemory, "0.0");
				Double minusFromMemory= Double.parseDouble(getMemory)-Double.parseDouble(getMemory);
				String showAfterMinus=minusFromMemory.toString();
				display.setText(showAfterMinus);
				
				String getDisplay=display.getText().toString();
				sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
				SharedPreferences.Editor editor = sharedpreferences.edit();
				editor.putString(keyOfMemory,getDisplay);
		        editor.commit();
			}
		});
        
        btnHistory.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				Intent forHistory=new Intent(CalculatorActivity.this, HistoryActivity.class);
				startActivity(forHistory);
			}
		});
        
        btnEqual.setOnClickListener(new View.OnClickListener()
        {
			
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				secondNumber= display.getText().toString();
				if(secondNumber.length()==0)
				{
					text.append("");
				}
				else
				{
					number2 = Double.parseDouble(secondNumber);
					textInput=text.getText().toString();
					if(plus==true)
					{
						text.append(secondNumber);
						answer=number1+number2;
						result= new Double(answer).toString();
						display.setText(result);
						plus=false;
						storeHistory();
					}
					
					if(minus==true)
					{
						text.append(secondNumber);
						answer=number1-number2;
						result= new Double(answer).toString();
						display.setText(result);
						minus=false;
						storeHistory();
					}
					
					if(mult==true)
					{
						text.append(secondNumber);
						answer=number1*number2;
						result= new Double(answer).toString();
						display.setText(result);
						mult=false;
						storeHistory();
					}
					
					if(div==true)
					{
						text.append(secondNumber);
						answer=number1/number2;
						result= new Double(answer).toString();
						display.setText(result);
						div=false;
						storeHistory();
					}
				}
			}
		});
	}
    
    public void storeHistory()
    {
    	String input=text.getText().toString();
    	String output=display.getText().toString();
    	
    	try
    	{
    		fos=openFileOutput(filename, Context.MODE_APPEND);
    	}
    	catch (FileNotFoundException e) 
    	{
			// TODO: handle exception
    		e.printStackTrace();
		}
    	try
    	{	
    		fos.write(input.getBytes());
    		fos.write("=".getBytes());
    		fos.write(output.getBytes());
    		fos.write("\n".getBytes());
    		fos.write("\n".getBytes());
    		fos.close();
    	}
    	catch (IOException e) 
    	{
			// TODO: handle exception
    		e.printStackTrace();
		}
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
}