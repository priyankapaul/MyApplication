package com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myapplication.models.Bunny;
import com.myapplication.models.Song;
import com.myapplication.utils.Constants;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button btn = (Button) findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create intent for starting a new activity
                Intent myIntent = new Intent(ActivityA.this, ActivityB.class);

                // put key-value pairs into extra bundle of intent
                myIntent.putExtra(Constants.EXTRA_MY_INT, 4);
                myIntent.putExtra(Constants.EXTRA_MY_STRING, "kem");
                myIntent.putExtra(Constants.EXTRA_MY_BOOL, true);

                // working with serializable object
                Bunny bu = new Bunny();
                bu.color = "blue";
                bu.weight = 2;
                myIntent.putExtra(Constants.EXTRA_MY_BUNNY, bu);

                // working with parcelable object
                Song so = new Song(8, "ho");
                myIntent.putExtra(Constants.EXTRA_MY_SONG, so);

                // start a new activity with above intent
                startActivity(myIntent);

            }
        });

    }
}
