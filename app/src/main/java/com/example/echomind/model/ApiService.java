package com.example.echomind.model;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public class ApiService {
    @FormUrlEncoded
    @POST("create_account.php")
    Call<ApiResponse> createAccount(
            @Field("first_name") String firstName,
            @Field("last_name") String lastName,
            @Field("anonymous_name") String anonymousName,
            @Field("password") String password
    ) {
        return null;
    }
}


