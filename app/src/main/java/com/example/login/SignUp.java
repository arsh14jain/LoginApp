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

public class SignUp extends Activity {

    Button b1;
    EditText ed1,ed2,ed3,ed4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        b1 = (Button)findViewById(R.id.bt_SignUp);
        ed1 = (EditText)findViewById(R.id.et_name);
        ed2 = (EditText)findViewById(R.id.et_username);
        ed3 = (EditText)findViewById(R.id.et_password);
        ed4 = (EditText)findViewById(R.id.et_cpassword);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().isEmpty()==true)
                    Toast.makeText(getApplicationContext(), "Name field cant be empty",Toast.LENGTH_SHORT).show();
                else if (ed2.getText().toString().isEmpty()==true)
                    Toast.makeText(getApplicationContext(), "Username field cant be empty",Toast.LENGTH_SHORT).show();
                else if(ed3.getText().toString().isEmpty()==true)
                    Toast.makeText(getApplicationContext(), "Password field cant be empty",Toast.LENGTH_SHORT).show();
                else if(ed4.getText().toString().isEmpty()==true)
                    Toast.makeText(getApplicationContext(), "Please confirm password",Toast.LENGTH_SHORT).show();
                else if(ed3.getText().toString().length()<8)
                {
                    Toast.makeText(getApplicationContext(), "Password too short",Toast.LENGTH_SHORT).show();
                    ed3.setText("");
                    ed4.setText("");
                }

                else if(ed3.getText().toString().equals(ed4.getText().toString())) {
                    Toast.makeText(getApplicationContext(),
                            "New account created",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),Welcome.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(), "Passwords do not match",Toast.LENGTH_SHORT).show();
                    ed3.setText("");
                    ed4.setText("");
                }
            }
        });
    }
}
