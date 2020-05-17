package com.example.android_lab_4;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    public void nowyWpis(MenuItem mi){
        Intent intencja = new Intent(this, DodajWpis.class);
        startActivityForResult(intencja, 1);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode ,Intent data){
        if(requestCode==1 && requestCode==RESULT_OK){
            Bundle extras=data.getExtras();
            String nowy=(String)extras.get("wpis");
            target.add(nowy);
            adpater.notifyDataSetChanged();
        }
    }
    private ArrayList<String> target;
    private ArrayAdapter adpater;


}
//TODO