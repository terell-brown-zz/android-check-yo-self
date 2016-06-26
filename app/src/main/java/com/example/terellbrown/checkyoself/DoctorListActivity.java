package com.example.terellbrown.checkyoself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.terellbrown.checkyoself.API.Auth;
import com.example.terellbrown.checkyoself.API.TheAPI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DoctorListActivity extends AppCompatActivity {

    String TAG = DoctorListActivity.class.getSimpleName();
    Intent intent;
    String authToken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);

        intent = getIntent();
        getAuthToken();

    }

    private void getAuthToken() {

        TheAPI.get().authToken("Basic " + Constants.getEncodedAuth(), "client_credentials").enqueue(new Callback<Auth>() {
            @Override
            public void onResponse(Call<Auth> call, Response<Auth> response) {
                authToken = response.body().access_token;
                DataStore.init(getApplicationContext()).access_token().put(authToken);
                Toast.makeText(getBaseContext(),DataStore.init(getApplicationContext()).access_token().get(), Toast.LENGTH_LONG).show();
                Log.i(TAG, "onResponse: " + authToken);
            }

            @Override
            public void onFailure(Call<Auth> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getMessage());
            }
        });
    }
}
