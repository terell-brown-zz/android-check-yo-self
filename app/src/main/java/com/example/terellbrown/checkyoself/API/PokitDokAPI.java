package com.example.terellbrown.checkyoself.API;

import android.util.Base64;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;
import android.util.Base64;

/**
 * Created by fnord on 6/25/16.
 */
public interface PokitDokAPI {

    @FormUrlEncoded
    @POST("oath2/token")
    Call<Auth> authToken (@Header("Authorization") String authorization, @Field("grant_type") String grantType);
}
