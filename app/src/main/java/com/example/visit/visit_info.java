package com.example.visit;

import java.util.ArrayList;
import java.util.List;

public class visit_info {
    private visit_records[] records;
    private visit_time_fields fields;

    public visit_info(visit_time_fields fields){
        this.fields = fields;
    }

    public String getfieldsDate(int i){
        return records[i].getFields().getDate();
    }

    public int getfieldsTime(int i){
        return records[i].getFields().getTime();
    }

    public ArrayList<String> getfieldsDoctor_id(int i){
        return records[i].getFields().getDoctor_id();
    }
    public ArrayList<String> getfieldsReservation_id(int i){
        return records[i].getFields().getReservation_id();
    }

    public int size = records.length;

}
