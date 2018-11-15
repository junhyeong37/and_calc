package com.example.a405_18.myapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button plusbn = findViewById(R.id.plusbn);
        //Button minusbn = findViewById(R.id.minusbn);
        //Button multibn = findViewById(R.id.multibn);
        //Button divbn = findViewById(R.id.divbn);
        //Button equal = findViewById(R.id.equalbn);
        final Context ctx = MainActivity.this;
        final EditText num1 = findViewById(R.id.num);
        final TextView result = findViewById(R.id.result);


        class Calc{
            private int num1,num2, res; // 인스턴스 변수
            private String op;
            /*public void exe(){
                switch (op){
                    case "+":
                        res = num1 + num2;
                        break;
                    case "-":
                        res = num1 - num2;
                        break;
                    case "*":
                        res = num1 * num2;
                        break;
                    case "/":
                        res = num1 / num2;
                        break;
                }
            }*/
            public void setNum(int num){
                this.num=num;
            }
            public int getNum(){
                return  this.num;
            }
            /*public void setNum2(int num2){
                this.num2=num2;
            }
            public int getNum2(){
                return  this.num2;
            }*/
            public void setRes(int res){
                this.res=res;
            }
            public int getRes(){
                return  this.res;
            }
            public void setOp(String op){
                this.op=op;
            }
            public String getOp(){
                return  this.op;
            }
        }
        final Calc calc = new Calc();

        findViewById(R.id.plusbn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(num1.getText().toString());
                calc.setNum(a);
                int b = Integer.parseInt(num.getText().toString());
                calc.setNum(b);
                calc.setOp("+");
                calc.exe();
                result.setText("결과: "+calc.getRes());
            }
        });
        findViewById(R.id.minusbn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                calc.setNum(a);
                int b = Integer.parseInt(num.getText().toString());
                calc.setNum(b);
                calc.setOp("-");
                calc.exe();
                result.setText("결과: "+calc.getRes());
            }
        });
        findViewById(R.id.multibn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                calc.setNum(a);
                int b = Integer.parseInt(num.getText().toString());
                calc.setNum(b);
                calc.setOp("*");
                calc.exe();
                result.setText("결과: "+calc.getRes());
            }
        });
        findViewById(R.id.divbn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                calc.setNum(a);
                int b = Integer.parseInt(num.getText().toString());
                calc.setNum(b);
                calc.setOp("/");
                calc.exe();
                result.setText("결과: "+calc.getRes());
            }
        });
        findViewById(R.id.equalbn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"덧셈 결과: "+calc.getRes(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
