package com.example.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {


    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17;
    TextView text1;
    double start,ends,sum;
    int i=0;//计次
    int states=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView)findViewById(R.id.text1);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button10=(Button)findViewById(R.id.button10);
        button11=(Button)findViewById(R.id.button11);
        button12=(Button)findViewById(R.id.button12);
        button13=(Button)findViewById(R.id.button13);
        button14=(Button)findViewById(R.id.button14);
        button15=(Button)findViewById(R.id.button15);
        button16=(Button)findViewById(R.id.button16);
        button17=(Button)findViewById(R.id.button);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
//        button11.setOnClickListener(this);//+
//        button12.setOnClickListener(this);//-
//        button13.setOnClickListener(this);//*
//        button14.setOnClickListener(this);
        button16.setOnClickListener(this);//C
        button17.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
// TODO Auto-generated method stub
        double n=Double.parseDouble(text1.getText().toString());
        if(v==button1){
            if(n==0||states==1){
                text1.setText("1");
            }else{
                text1.append("1");
            }
        }else if(v==button2){
            if(n==0||states==1){
                text1.setText("2");
            }else{
                text1.append("2");
            }
        }else if(v==button3){
            if(n==0||states==1){
                text1.setText("3");
            }else{
                text1.append("3");
            }
        }else if(v==button4){
            if(n==0||states==1){
                text1.setText("4");
            }else{
                text1.append("4");
            }
        }else if(v==button5){
            if(n==0||states==1){
                text1.setText("5");
            }else{
                text1.append("5");
            }
        }else if(v==button6){
            if(n==0||states==1){
                text1.setText("6");
            }else{
                text1.append("6");
            }
        }else if(v==button7){
            if(n==0||states==1){
                text1.setText("7");
            }else{
                text1.append("7");
            }
        }else if(v==button8){
            if(n==0||states==1){
                text1.setText("8");
            }else{
                text1.append("8");
            }
        }else if(v==button9){
            if(n==0||states==1){
                text1.setText("9");
            }else{
                text1.append("9");
            }
        }else if(v==button10){
            if(n==0){
                text1.setText("0");
            }else{
                text1.append("0");//("0");
            }
        }else if(v==button16){
            text1.setText("0");
            i=0;
        }else if(v==button17){
            finish();
            System.exit(0);
        }
        states=0;
    }
    String symbol;
    public void jishu(View v){
        states=1;
        i+=1;
        if(i==1){
            start=Double.parseDouble(text1.getText().toString());
            sum=start;
        }else{
            ends=Double.parseDouble(text1.getText().toString());
        }
        if(v==button11){
            if(i>=2&&symbol.equals("+")){
                sum+=ends;
            }else if(i>=2&&symbol.equals("-")){
                sum-=ends;
            }else if(i>=2&&symbol.equals("*")){
                sum*=ends;
            }else if(i>=2&&symbol.equals("/")){
                sum/=ends;
            }
            symbol="+";
            text1.setText(Double.toString(sum));
//	if(i==2){
//	sum=start+ends;
//	}else if(i>2){
//	sum+=ends;
//	}
        }else if(v==button12){
            if(i>=2&&symbol.equals("+")){
                sum+=ends;
            }else if(i>=2&&symbol.equals("-")){
                sum-=ends;
            }else if(i>=2&&symbol.equals("*")){
                sum*=ends;
            }else if(i>=2&&symbol.equals("/")){
                sum/=ends;
            }
            symbol="-";
            text1.setText(Double.toString(sum));
//	if(i==2){
//	sum=start-ends;
//	}else if(i>2){
//	sum-=ends;
//	}
        }else if(v==button13){
            if(i>=2&&symbol.equals("+")){
                sum+=ends;
            }else if(i>=2&&symbol.equals("-")){
                sum-=ends;
            }else if(i>=2&&symbol.equals("*")){
                sum*=ends;
            }else if(i>=2&&symbol.equals("/")){
                sum/=ends;
            }
            symbol="*";
//	if(i==2){
//	sum=start*ends;
//	}else if(i>2){
//	sum*=ends;
//	}
            text1.setText(Double.toString(sum));
        }else if(v==button14){
            if(i>=2&&symbol.equals("+")){
                sum+=ends;
            }else if(i>=2&&symbol.equals("-")){
                sum-=ends;
            }else if(i>=2&&symbol.equals("*")){
                sum*=ends;
            }else if(i>=2&&symbol.equals("/")){
                sum/=ends;
            }
            symbol="/";
//	if(i==2){
//	sum=start/ends;
//	}else if(i>2){
//	sum/=ends;
//	}
            text1.setText(Double.toString(sum));
        }else if(v==button15){
            if(i>=2&&symbol.equals("+")){
                sum+=ends;
            }else if(i>=2&&symbol.equals("-")){
                sum-=ends;
            }else if(i>=2&&symbol.equals("*")){
                sum*=ends;
            }else if(i>=2&&symbol.equals("/")){
                sum/=ends;
            }
            text1.setText(Double.toString(sum));
            sum=0;
            i=0;
        }
    }


}


