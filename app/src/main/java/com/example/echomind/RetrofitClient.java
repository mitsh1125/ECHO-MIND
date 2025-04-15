package com.example.echomind;

public class RetrofitClient {

    private static final String BASE_URL = "http://10.0.2.2/"; // Use your server's URL
    private static RetrofitClient retrofit;

    public static RetrofitClient getInstance() {
        if (retrofit == null) {
            retrofit = new RetrofitClient().Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
}
