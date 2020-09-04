package com.example.banner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class User_Details extends AppCompatActivity {

    TextView nam,num,add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__details);
        //find the views for user data
        nam = findViewById(R.id.username);
        num = findViewById(R.id.usernumber);
        add = findViewById(R.id.useraddress);

        //to get the data for these textviews, we use Bundle
        Bundle bundle = getIntent().getExtras();
        //create 3 strings to get data in strings
        String names = bundle.getString("Name");
        String numbr = bundle.getString("Number");
        String addre = bundle.getString("Address");
        //now pass these variables into the 3 textViews above
        nam.setText(names);
        num.setText(numbr);
        add.setText(addre);
    }
}