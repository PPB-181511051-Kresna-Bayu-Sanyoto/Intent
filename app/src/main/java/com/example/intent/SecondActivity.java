package com.example.intent;

import android.app.Activity;
import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //get the data passed in using getStringExtra
        Toast.makeText(this,getIntent().getStringExtra("str1"),Toast.LENGTH_SHORT).show();
        //get the data passed in using getIntExtra
        Toast.makeText(this,Integer.toString(getIntent().getIntExtra("age1",0)),Toast.LENGTH_SHORT).show();
        //get the budle object passen in
        Bundle bundle = getIntent().getExtras();
        //get the data using the getString
        Toast.makeText(this, bundle.getString("str2"),Toast.LENGTH_SHORT).show();
        //get the data using the getint
        Toast.makeText(this,Integer.toString(bundle.getInt("age2")),Toast.LENGTH_SHORT).show();
    }
    public void onClick(View view){
        Intent i = new Intent();
        //get the EditText view
        i.putExtra("age3",45);
        //set data to pass back
        i.setData(Uri.parse("Something passed back to main activity"));
        setResult(RESULT_OK,i);
        //closes the activity
        finish();
    }
}
