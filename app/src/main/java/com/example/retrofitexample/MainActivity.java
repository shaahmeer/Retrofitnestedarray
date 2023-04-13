package com.example.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.retrofitexample.Network.apiinter;
import com.example.retrofitexample.model.Category;
import com.example.retrofitexample.model.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
List<Category> userList;
    String url = "https://www.themealdb.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getrepo();

    }

    private void getrepo() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        System.out.println("bodydone1122");

        apiinter apiinter = retrofit.create(apiinter.class);
        Call<List<Model>> call = apiinter.LIST_CALL();
        System.out.println("jeeeeeeeee");
        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                System.out.println("lele");
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                System.out.println(t.getLocalizedMessage());
            }
        });







    }
}