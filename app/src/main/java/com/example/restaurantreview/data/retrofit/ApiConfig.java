package com.example.restaurantreview.data.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import okhttp3.logging.HttpLoggingInterceptor;
import androidx.annotation.NonNull;

public class ApiConfig {
    @NonNull
    public static ApiService getApiService() {

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(loggingInterceptor).build();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://restaurant-api.dicoding.dev/").addConverterFactory(GsonConverterFactory.create()).client(client).build();
        return retrofit.create(ApiService.class);
    }
}