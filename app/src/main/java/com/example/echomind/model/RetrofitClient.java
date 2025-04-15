package com.example.echomind.model;

public class RetrofitClient {
    private static final String BASE_URL = "http://10.0.2.2/"; // Localhost for emulator
    private static RetrofitClient  retrofit;

    public static RetrofitClient  getInstance() {
        if (retrofit == null) {
            retrofit = new RetrofitClient .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

