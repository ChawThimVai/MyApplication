package com.taruc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonSend;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonSend= findViewById(R.id.buttonSend);
        editText= findViewById(R.id.editTextName);
    }

    public void setButtonSend(View v)
    {
        Intent intent = new Intent(this, )
    }
}
