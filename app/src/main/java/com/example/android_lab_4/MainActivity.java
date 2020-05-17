package com.example.android_lab_4;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] value = new String[] {"Pies","Kot","Chomik"};
        this.target = new ArrayList<>();
        this.target.addAll(Arrays.asList(value));

        this.adpater = new ArrayAdapter(this, android.R.layout.simple_list_item_1, this.target);
        ListView listview=(ListView) findViewById(R.id.listView);
        listview.setAdapter(this.adpater);
    }
    private ArrayList<String> target;
    private ArrayAdapter adpater;


}
//TODO