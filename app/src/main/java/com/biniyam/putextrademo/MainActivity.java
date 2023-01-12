package com.biniyam.putextrademo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final String TAG = "demo";
    final static public String NAME_KEY = "NAME";
    final static public String USER_KEY = "USER";
    final static public String USERS_KEY = "USERS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: ");
        setTitle("Main Activity");

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
               // intent.putExtra(NAME_KEY,"Boben Maraka"); // this is one variable at a time.
               // intent.putExtra(USER_KEY,new User("",25 )); // this is putting ArrayList in one go

                ArrayList<User> users = new ArrayList<>();
                users.add(new User("bob smith",33));
                users.add(new User("Alic reel", 23));

                intent.putExtra(USERS_KEY, users);  //new User("",25 )); // this is putting ArrayList in one go





                startActivity(intent);
            }
        });
    }
}