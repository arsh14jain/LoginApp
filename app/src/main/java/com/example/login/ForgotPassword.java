package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotPassword extends Activity {
    Button b1,b2;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        b1 = (Button)findViewById(R.id.send);
        b2= (Button)findViewById(R.id.back);
        et1 = (EditText)findViewById(R.id.enter);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "Email cant be empty",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Reset link set to " + et1.getText(),Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }
}
