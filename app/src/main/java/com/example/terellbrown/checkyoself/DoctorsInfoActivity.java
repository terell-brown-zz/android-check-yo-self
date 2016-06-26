package com.example.terellbrown.checkyoself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.terellbrown.checkyoself.API.NewProvider;
import com.example.terellbrown.checkyoself.API.ProviderDetail;
import com.example.terellbrown.checkyoself.API.TheAPI;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DoctorsInfoActivity extends AppCompatActivity {

    public TextView doctorsName;
    public TextView specicilty;
    public TextView address;
    public TextView phone;
    public TextView description;
    public Button book;
    public String TAG = DoctorsInfoActivity.class.getSimpleName();

    public Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_info);
        doctorsName = (TextView) findViewById(R.id.DoctorName);
        specicilty = (TextView) findViewById(R.id.tvSpecialty);
        address = (TextView) findViewById(R.id.tvAddress);
        phone = (TextView) findViewById(R.id.tvPhoneNumber);
        description = (TextView) findViewById(R.id.tvDoctorBio);
        book = (Button) findViewById(R.id.btBook);
        intent = getIntent();
        getProviderDetails((String) intent.getExtras().get("AuthToken"), (String) intent.getExtras().get("Provider"));
    }
//.replaceAll("\\n", "")
    private void getProviderDetails(String auth, String providernpi){
        TheAPI.get().getProviderDetail("Bearer " + auth, providernpi).enqueue(new Callback<ProviderDetail>(){
            @Override
            public void onResponse(Call<ProviderDetail> call, Response<ProviderDetail> response) {
                doctorsName.setText(response.body().data.provider.first_name + " " + response.body().data.provider.middle_name + " " + response.body().data.provider.last_name);
                specicilty.setText(response.body().data.provider.specialty.get(0));
                address.setText(response.body().data.provider.locations.get(0).address_lines.get(0));
                phone.setText(response.body().data.provider.phone);
                description.setText(response.body().data.provider.description);
            }


            @Override
            public void onFailure(Call<ProviderDetail> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getMessage());
            }
        });
    }
}
