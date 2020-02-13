package com.example.abdullah.backpress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextClock textClock;
    DigitalClock digitalClock;
    AnalogClock analogClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textClock=findViewById(R.id.text_clock_ID);
        digitalClock=findViewById(R.id.digital_clock_ID);
        analogClock=findViewById(R.id.analog_clock_ID);

        analogClock.setOnClickListener(this);
        digitalClock.setOnClickListener(this);
        textClock.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.analog_clock_ID){
            Toast.makeText(MainActivity.this,"Analog Clock",Toast.LENGTH_SHORT).show();
            }
            else if (view.getId()==R.id.digital_clock_ID){
            Toast.makeText(MainActivity.this,"Digital Clock",Toast.LENGTH_SHORT).show();
        }
        else if (view.getId()==R.id.text_clock_ID){
            Toast.makeText(MainActivity.this,"Text Clock",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,"Clik anyone",Toast.LENGTH_SHORT).show();
        }

    }
}
