package com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.myapplication.models.Bunny;
import com.myapplication.models.Song;
import com.myapplication.utils.Constants;

import java.io.Serializable;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Intent intent = getIntent();
        int i = intent.getIntExtra(Constants.EXTRA_MY_INT, -1);
        String su = intent.getStringExtra(Constants.EXTRA_MY_STRING);
        boolean b = intent.getBooleanExtra(Constants.EXTRA_MY_BOOL, true);
        Bunny bu = (Bunny) intent.getSerializableExtra(Constants.EXTRA_MY_BUNNY);
        Song so = (Song) intent.getParcelableExtra(Constants.EXTRA_MY_SONG);

        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(i + "--" + su + "--" + b + "--" + bu.color + "--" + so.sum + "");


    }
}
