package com.example.terellbrown.checkyoself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class BookingActivity extends AppCompatActivity {


    String[] bookings = {"9:00 AM","10:00 AM", "10:30 AM", "1:00 AM","2:30 AM",
            "3:30 AM", "4 AM"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,bookings);
        ListView listView = (ListView) findViewById(R.id.listBookings);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text

            }
        });
        listView.setAdapter(adapter);
        listView.setClickable(true);

    }
}
