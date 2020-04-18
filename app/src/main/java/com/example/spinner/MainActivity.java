package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner dropDown;
    TextView showItem;
    String[] items = {"Jelly Bean","Kitkat","Lollipop","Marshmellow","Nougat","Oreo","Pie","Android Q"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    dropDown = findViewById(R.id.spin);
    showItem = findViewById(R.id.tvShow);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,items);
    dropDown.setAdapter(adapter);

    dropDown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            showItem.setText(items[position]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    });

    }
}
