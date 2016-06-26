package com.example.terellbrown.checkyoself;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.terellbrown.checkyoself.API.Auth;
import com.example.terellbrown.checkyoself.API.NewProvider;
import com.example.terellbrown.checkyoself.API.NewProvider.Providers;
import com.example.terellbrown.checkyoself.API.TheAPI;
import com.example.terellbrown.checkyoself.Lists.DoctorListAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DoctorListActivity extends AppCompatActivity {

    public ArrayList<NewProvider.Datum> providerList;
    String TAG = DoctorListActivity.class.getSimpleName();
    Intent intent;
    String authToken;

    private Context context;

    private RecyclerView rvDoctorList;
    private LinearLayoutManager layoutManager;
    private DoctorListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);
        context = this;
        intent = getIntent();
        //getAuthToken();
        authToken = DataStore.init(getApplicationContext()).access_token().get();

        setupRecyclerView();
        getProviders(authToken);
    }

    private void setupRecyclerView() {
            // setup but don't populate recyclerview
            rvDoctorList = (RecyclerView) findViewById(R.id.rvDoctorList);
            rvDoctorList.setHasFixedSize(true);
            layoutManager = new LinearLayoutManager(getBaseContext());
            rvDoctorList.setLayoutManager(layoutManager);
    }


    private void populateRecyclerView() {
        adapter = new DoctorListAdapter(providerList);
        rvDoctorList.setAdapter(adapter);
    }

    private void getProviders(String auth) {
        Toast.makeText(getApplicationContext(),auth,Toast.LENGTH_LONG);
        TheAPI.get().getProvidersByLocation("Bearer " + auth.replaceAll("\\n", ""), "94104", "primary care", "100mi").enqueue(new Callback<Providers>(){
            @Override
            public void onResponse(Call<Providers> call, Response<Providers> response) {
                providerList = (ArrayList) response.body().data;
                populateRecyclerView();
            }

            @Override
            public void onFailure(Call<Providers> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getMessage());
            }
        });
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
