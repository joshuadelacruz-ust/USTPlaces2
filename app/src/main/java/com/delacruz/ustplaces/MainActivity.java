package com.delacruz.ustplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goTo(View v){
        Intent i = null;
        if(v.getId() == R.id.button) {
            i = new Intent(this, SecondActivity.class);
            startActivity(i);
        }else if(v.getId() == R.id.button2){
            Toast toast = Toast.makeText(this, "Service is Running", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
