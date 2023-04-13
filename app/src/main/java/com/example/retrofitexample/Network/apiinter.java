package com.example.retrofitexample.Network;

import com.example.retrofitexample.model.Category;
import com.example.retrofitexample.model.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public  interface apiinter {
    String url = "https://www.themealdb.com/api/json/v1/1/categories.php";

    @GET("api/json/v1/1/categories.php/")
    Call<List<Model>> LIST_CALL();
    @GET("api/json/v1/1/categories.php/")
    Call<List<Category>> LIST_CALL1();
}


