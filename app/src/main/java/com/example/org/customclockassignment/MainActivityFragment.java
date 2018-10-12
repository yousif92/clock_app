package com.example.org.customclockassignment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */


public class MainActivityFragment extends Fragment {



    public MainActivityFragment() {
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        TextView dateTextView = findViewById(R.id.date_text_digital);
//        Calendar calendar = Calendar.getInstance();
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        String formatedDate = df.format(calendar.getTime());
//        dateTextView.setText(formatedDate);



        return inflater.inflate(R.layout.fragment_main, container, false);
    }




}
