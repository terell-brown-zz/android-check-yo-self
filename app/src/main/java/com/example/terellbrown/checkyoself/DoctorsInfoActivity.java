package com.example.terellbrown.checkyoself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DoctorsInfoActivity extends AppCompatActivity {

    public TextView doctorsName;
    public TextView specicilty;
    public TextView address;
    public TextView phone;
    public TextView description;
    public Button book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_info);
        context = this;
        doctorsName = (TextView) findViewById()
        specicilty = (TextView) findViewById()
        address = (TextView) findViewById()
        phone = (TextView) findViewById()
        description = (TextView) findViewById()
        book = (Button) findViewById()


    }
}
