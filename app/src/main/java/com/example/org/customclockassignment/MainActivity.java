package com.example.org.customclockassignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> clockNames;
    ArrayAdapter adapter;
    ListView listView;
    int analogCounter = 0;
    int digitalCounter = 0;

    private Button openSetting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        openSetting = findViewById(R.id.settingbtn);
        clockNames = new ArrayList<String>();


        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, clockNames);

        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String currentClock = (String) parent.getItemAtPosition(position);

                Intent intent = new Intent(MainActivity.this, ClockActivity.class);
                intent.putExtra("CLOCK_NAME", currentClock);
                startActivity(intent);

            }
        });


        openSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensettingbtn();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void addAnalogClicked(View v) {
        if (clockNames != null) {
            clockNames.add("ANALOG" + ++analogCounter);
        }
        adapter.notifyDataSetChanged();

        Log.d("MYCUSTOMLOGTAG", String.valueOf(clockNames.size()));

    }

    public void addDigitalClicked(View v) {
        if (clockNames != null) {
            clockNames.add("DIGITAL" + ++digitalCounter);
        }
        adapter.notifyDataSetChanged();

        Log.d("MYCUSTOMLOGTAG", String.valueOf(clockNames.size()));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void opensettingbtn() {
        Intent intent = new Intent(this,setting.class);
        startActivity(intent);
    }
}
