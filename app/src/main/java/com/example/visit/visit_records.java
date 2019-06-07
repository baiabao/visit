package com.example.visit;

public class visit_records {

    private String id;
    private visit_time_fields fields;
    private String createdTime;

    public visit_records(visit_time_fields fields){
        this.fields = fields;
    }
    public visit_time_fields getFields(){
        return fields;
    }


}
