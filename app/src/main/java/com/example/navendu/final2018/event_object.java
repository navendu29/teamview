package com.example.navendu.final2018;

/**
 * Created by navendu on 31/12/17.
 */

public class event_object {
    int image;
    String date;
    String time;
    String venue;
    String register;
    String rules;
    int y;

    public event_object(int image, String date, String time, String venue, String register, String rules,int x) {
        this.image = image;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.register = register;
        this.rules = rules;
        y=x;
    }


}
