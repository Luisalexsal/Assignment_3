package com.example.cisc.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonMesa;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMesa = (Button) findViewById(R.id.buttonMesa);
        buttonMesa.setOnClickListener(this);

        b= (Button) findViewById(R.id.callButton);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent callIntent=new Intent();
                callIntent.setData(Uri.parse("tel:(619)388-2600"));
                startActivity(callIntent);
            }
        });

    }

    @Override
    public void onClick(View view) {

        Intent m = new Intent(this, MesaCollegeActivity.class);
        startActivity(m);


    }
}