package com.example.terellbrown.checkyoself;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class InfoForm extends AppCompatActivity {

    public EditText name;
    public EditText email;
    public RadioButton sexMale;
    public RadioButton sexFemale;
    public RadioButton sexOther;
    public CheckBox hasInsurance;
    public EditText password;
    public EditText confirmPassword;
    public Button registerButton;

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_form);
        context = this;
        name = (EditText) findViewById(R.id.etName);
        email = (EditText) findViewById(R.id.etEmail);
        sexMale = (RadioButton) findViewById(R.id.rbMale); 
        sexFemale = (RadioButton) findViewById(R.id.rbFemale); 
        sexOther = (RadioButton) findViewById(R.id.rbOther);
        hasInsurance = (CheckBox) findViewById(R.id.cbHasInsurace);
        password = (EditText) findViewById(R.id.etPassword);
        confirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        registerButton = (Button) findViewById(R.id.bRegister);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sexChecked;
                if(sexMale.isActivated()){
                    sexChecked = "male";
                }else if(sexFemale.isActivated()){
                    sexChecked = "female";
                }else{
                    sexChecked = "other";
                }
                Intent intent = new Intent(context, DoctorListActivity.class);
                intent.putExtra(Constants.NAME,name.getText());
                intent.putExtra(Constants.EMAIL,email.getText()); //Input validation?
                intent.putExtra(Constants.HAS_INSURANCE,hasInsurance.isEnabled());
                intent.putExtra(Constants.SEX, sexChecked);
                intent.putExtra(Constants.PASSWORD, password.getText());
                startActivity(intent);
            }
        });
    }

}
