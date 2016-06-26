package com.example.terellbrown.checkyoself.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TheAPI {

    public static PokitDokAPI pkApi;

    public static void init() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://platform.pokitdok.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        pkApi = retrofit.create(PokitDokAPI.class);
    }

    public static PokitDokAPI get() {
        if (pkApi == null) {
            init();
        }
        return pkApi;
    }
}
