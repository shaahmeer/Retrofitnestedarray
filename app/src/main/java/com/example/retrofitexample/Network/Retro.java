package com.example.retrofitexample.Network;

import com.example.retrofitexample.model.Category;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retro {
    public static Retro retroinstance;
    public static apiinter apiinter;
    String url = "https://www.themealdb.com/";
    List<Category> userList;


}
