package com.example.terellbrown.checkyoself.API;

import android.util.Base64;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

import android.util.Base64;

/**
 * Created by fnord on 6/25/16.
 */
public interface PokitDokAPI {

    @FormUrlEncoded
    @POST("oauth2/token")
    Call<Auth> authToken (@Header("Authorization") String authorization, @Field("grant_type") String grantType);

    @FormUrlEncoded
    @GET("/api/v4/providers")
    Call<Provider> getProvidersByLocation(@Header("Authorization") String authorization, @Field("zipcode") String zipcode, @Field("specialty") String specialty, @Field("radius") String radius);

    @GET("api/v4/providers/{NPI}")
    Call<ProviderDetail> getProviderDetail(@Header("Authorization") String authorization, @Path("NPI") String npi);
}
