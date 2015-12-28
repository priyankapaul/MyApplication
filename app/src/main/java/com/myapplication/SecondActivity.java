package com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
take input from edit text and display it in a toast onclick of a button
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void showMe(View v) {
        EditText fw = (EditText) findViewById(R.id.editText);
        String s = fw.getText().toString();
//        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
       TextView tv= (TextView) findViewById(R.id.textView2);
        System.out.println(fw.getText());
        tv.setText(fw.getText());
    }
}
