package com.example.visit;

import java.util.ArrayList;

public class visit_time_fields {
    private int id;
    private String date;
    private int time;
    private ArrayList<String> doctor_id;
    private ArrayList<String> reservation_id;

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getDoctor_id() {
        return doctor_id;
    }

    public ArrayList<String> getReservation_id() {
        return reservation_id;
    }

}
