package com.example.terellbrown.checkyoself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    public EditText username;
    public EditText password;
    public Button login;
    public TextView register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
        login = (Button) findViewById(R.id.bLogin);
        register = (TextView) findViewById(R.id.tvRegister);

        login.setOnClickListener(new View.OnClickListener(){
            Intent intent = new Intent(context, InfoForm.class);
            startActivity(intent);

        });
    }
}


