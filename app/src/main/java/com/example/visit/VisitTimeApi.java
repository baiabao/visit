package com.example.visit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface VisitTimeApi {

    @GET("visit_time?api_key=keyxoPJrsRszv63ZS")
    Call<visit_info> getVisitTIme();


}
