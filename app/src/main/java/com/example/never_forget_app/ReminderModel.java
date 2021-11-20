package com.example.never_forget_app;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.Date;

public class ReminderModel extends ViewModel {

    private ArrayList<Reminder> reminders = new ArrayList<Reminder>();
    static private ReminderModel anInstance = null;

    public static class Reminder{

        public String title;
        public Date date;
        public String time;

        public Reminder(String title, Date date, String time){
            this.title = title;
            this.date = date;
            this.time = time;
        }
    }

}
