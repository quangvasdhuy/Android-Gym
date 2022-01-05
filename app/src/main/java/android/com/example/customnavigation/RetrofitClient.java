package android.com.example.customnavigation;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit;
    private static String Base_UrL = "https://run.mocky.io/";

    public static String getBase_UrL() {
        return Base_UrL;
    }

    public static void setBase_UrL(String base_UrL) {
        Base_UrL = base_UrL;
    }

    public static Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_UrL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
