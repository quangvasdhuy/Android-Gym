package android.com.example.customnavigation.InterfaceResponsitory;

import android.com.example.customnavigation.Model.DataModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Methods {
    @GET("v3/d600f0b0-24ce-402b-a2fb-f8c249f9caf3")
    Call<DataModel> getProduct();
}
