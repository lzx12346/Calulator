package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button dl = (Button) findViewById(R.id.dl);
        final EditText zh = (EditText) findViewById(R.id.zh);
        final EditText mm = (EditText) findViewById(R.id.mm);

        dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zh.getText().toString().equals("user") && mm.getText().toString().equals("123456")) {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    EditText ts = (EditText) findViewById(R.id.ts);
                    ts.setText("账号或密码错误");
                }
            }


        });
    }
}
