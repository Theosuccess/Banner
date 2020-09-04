package com.example.banner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,mobile,address;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find all the views in the onCreate method
        name = findViewById(R.id.name);
        mobile = findViewById(R.id.mobile);
        address = findViewById(R.id.address);
        signup = findViewById(R.id.signup);

        //set onClickListener on the signUp button to make it clickable
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get the text from each of the editText and store in a variable
                String nam = name.getText().toString();
                String mob = mobile.getText().toString();
                String addr = address.getText().toString();

                //now get user data when signup button is clicked
                //and pass the data on second activity with intent EXTRA
                Intent intent = new Intent(MainActivity.this, User_Details.class);
                //Using String variable and their text id as input we can pass the putEXTRA on the intent
                intent.putExtra("Name", nam);
                intent.putExtra("Number", mob);
                intent.putExtra("Address", addr);
                //now start intent
                startActivity(intent);




            }
        });
    }
}