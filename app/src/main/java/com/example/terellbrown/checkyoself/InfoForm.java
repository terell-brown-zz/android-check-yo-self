package com.example.terellbrown.checkyoself;

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
    public Button searchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_form);

        name = (EditText) findViewById(R.id.etName);
        email = (EditText) findViewById(R.id.etEmail);
        sexMale = (RadioButton) findViewById(R.id.rbMale); 
        sexFemale = (RadioButton) findViewById(R.id.rbFemale); 
        sexOther = (RadioButton) findViewById(R.id.rbOther);
        hasInsurance = (CheckBox) findViewById(R.id.cbHasInsurace);
        searchButton = (Button) findViewById(R.id.bSearch);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DoctorListActivity.class, )
            }
        });
    }

}
