package com.example.aplikasimobile_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countries = {"Indonesia","Singapura","Thailand","Myanmar","Vietnam",
    "China","Jepang","Inggris","Australia","Amerika Serikat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Listview Sederhana");

        listView = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1, R.id.lblCountry,countries);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(MainActivity.this, "Memilih: " + countries[i],Toast.LENGTH_LONG));
    }
}