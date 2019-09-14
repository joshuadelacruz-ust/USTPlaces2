package com.delacruz.ustplaces;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void goTo(View v){
        Intent i = null;
        if(v.getId() == R.id.button3) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://jangkebin.files.wordpress.com/2013/05/dsc_7415.jpg"));
            startActivity(i);
        }else if(v.getId() == R.id.button4){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://pbs.twimg.com/media/Dx-7YkiUUAIL4sB.jpg:large"));
            startActivity(i);
        }else if(v.getId() == R.id.button5){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://varsitarian.net/wp-content/uploads/2017/12/MIKE-8552.jpg"));
            startActivity(i);
        }else if(v.getId() == R.id.button6){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("http://www.olryt.com/wp-content/uploads/2016/05/olryt_317933-500x281.png"));
            startActivity(i);
        }else if(v.getId() == R.id.button7){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }

}
