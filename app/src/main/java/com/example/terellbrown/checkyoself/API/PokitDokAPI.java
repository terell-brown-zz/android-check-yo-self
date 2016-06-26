package com.example.terellbrown.checkyoself.API;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by fnord on 6/25/16.
 */
public interface PokitDokAPI {
    @POST("oath2/token")
    Call<Auth> authToken ();
}
