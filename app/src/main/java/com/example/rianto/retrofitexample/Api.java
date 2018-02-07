package com.example.rianto.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rianto on 2/6/2018.
 */

public interface Api {

    String BASE_URL = "http://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
