package com.example.echomind;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Field;
public interface ApiService {

    FormUrlEncoded
    @POST("create_account.php")
    Call<ResponseBody> createAccount(
            @Field("first_name") String firstName,
            @Field("last_name") String lastName,
            @Field("anonymous_name") String anonymousName,
            @Field("password") String password
    );
}

