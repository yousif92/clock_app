package com.example.org.customclockassignment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();


        Bundle getBundle;
        getBundle = this.getIntent().getExtras();
        if (getBundle != null) {
            String title = getBundle.getString("CLOCK_NAME");
            TextView clockHeading = findViewById(R.id.clock_title_text);
            if (!TextUtils.isEmpty(title)) {
                clockHeading.setText(title);
                if (title.contains("DIGITAL")) {
                    fragmentTransaction.replace(R.id.fragment_clock, new DigitalClockFragment());
                } else {
                    fragmentTransaction.replace(R.id.fragment_clock, new AnalogClockFragment());
                }
                fragmentTransaction.commit();
            }

        }
        TextView dateTextView = findViewById(R.id.date_text_digital);
        Calendar calendar = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String formatedDate = df.format(calendar.getTime());
        dateTextView.setText(formatedDate);
    }
}
