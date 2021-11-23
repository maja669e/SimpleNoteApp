package com.example.listviewandedit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    String[] items = {"Apple", "Banana", "Pear"};

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;
    private EditText txtInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        TextView textView = findViewById(R.id.txtItem);
        String newName = getIntent().getExtras().getString("newName");
        textView.setText(newName);*/

        arrayList = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this, R.layout.list_items, R.id.txtItem, arrayList);
        txtInput = (EditText) findViewById(R.id.txtInput);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);


        Button btnAdd = (Button) findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String newItem = txtInput.getText().toString();
                txtInput.getText().clear();
                adapter.add(newItem);

            }
        });


     /*   listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
                String name = ((TextView)findViewById(R.id.txtItem)).getText().toString();
                intent.putExtra("NAME", name);
                startActivity(intent);
            }
        });*/


    }


}