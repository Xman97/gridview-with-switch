package com.abdo.iamlearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.abdo.iamlearn.test.item1;
import com.abdo.iamlearn.test.item2;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {
    private GridView gridView1;
    private ArrayAdapter<String> listAdapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView1 = (GridView) findViewById(R.id.gridView1);
        String[] someColors = new String[] { "Red", "Orange",
                "Yellow",
                "Green", "Blue", "Indigo", "Violet", "Black",
                "White"};
        ArrayList<String> colorArrayList = new
                ArrayList<String>();
        colorArrayList.addAll( Arrays.asList(someColors) );
        listAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                colorArrayList);
        gridView1.setAdapter( listAdapter1 );
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String)
                        gridView1.getItemAtPosition(position);
               switch (itemValue){
                   case "Red" :
                       Intent intent = new Intent(MainActivity.this, item1.class);
                       startActivity(intent);
                       break;
                   case "Orange" :
                       Intent intent1 = new Intent(MainActivity.this, item2.class);
                       startActivity(intent1);
                       break;
                   case "Yellow" :
                       Intent intent2 = new Intent(MainActivity.this, item1.class);
                       startActivity(intent2);
                       break;
                   case "Green" :
                       Intent intent3 = new Intent(MainActivity.this, item1.class);
                       startActivity(intent3);
                       break;
                   case "Blue" :
                       Intent intent4 = new Intent(MainActivity.this, item1.class);
                       startActivity(intent4);
                       break;
                   case "Indigo" :
                       Intent intent5 = new Intent(MainActivity.this, item1.class);
                       startActivity(intent5);
                       break;
                   case "Black" :
                       Intent intent6 = new Intent(MainActivity.this, item1.class);
                       startActivity(intent6);
                       break;
                   case "Violet" :
                       Intent intent7 = new Intent(MainActivity.this, item1.class);
                       startActivity(intent7);
                       break;
                   case "White" :
                       Intent intent8 = new Intent(MainActivity.this, item1.class);
                       startActivity(intent8);
               }
            }
        });
    }
}

