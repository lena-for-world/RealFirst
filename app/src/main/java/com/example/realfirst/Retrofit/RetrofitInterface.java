package com.example.realfirst.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    // https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15095040#layer-api-guide
    @GET("https://api.odcloud.kr/api/uws/v1/inventory")
    Call<Result> getScr(@Query("serviceKey") String serviceKey);

}
