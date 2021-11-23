package com.example.listviewandedit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        Intent i = getIntent();
        String message = i.getStringExtra("NAME");
        ((EditText)findViewById(R.id.textViewName)).setText(message);

    }

 /*   public void saveText(View v){

       EditText editText;
       String string;

       editText = findViewById(R.id.textViewName);

       Intent i = new Intent(this, MainActivity.class);
       string = editText.getText().toString();
       i.putExtra("newName", string);

       startActivity(i);
    }*/
}