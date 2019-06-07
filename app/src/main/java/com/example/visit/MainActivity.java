package com.example.visit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView textView_Date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView_Date = findViewById(R.id.res_date);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.airtable.com/v0/app2Na8quylF0scW1/")//這是我的，請填上自己的
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        VisitTimeApi visittimapi = retrofit.create(VisitTimeApi.class);

        Call<visit_info> call = visittimapi.getVisitTIme();

        call.enqueue(new Callback<visit_info>() {
            @Override
            public void onResponse(Call<visit_info> call, Response<visit_info> response) {
                if(!response.isSuccessful()){
                    textView_Date.setText("Code"+response.code());
                    return;
                }

                visit_info visit_times = response.body();
                String content ="";
                for(int i=0; i<visit_times.size;i++){

                    content+=visit_times.getfieldsDate(i);
                }

                //textView_Date.append(visit_times.getfieldsDate(0)+visit_times.getfieldsDate(1));

//                for(visit_time visit_tiime1 : visit_times){
//                    String content ="";
//                    content += "ID:"+visit_tiime1.getId()+"\n";
//                    content += "Date:"+visit_tiime1.getDate()+"\n";
//                    content += "Time:"+visit_tiime1.getTime()+"\n\n";
//
//                    textViewResult.append(content);
//                }
            }

            @Override
            public void onFailure(Call<visit_info> call, Throwable t) {
                textView_Date.setText((t.getMessage()));
            }
        });

    }
}
