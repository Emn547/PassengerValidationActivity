package com.example.eladm96.passengervalidationactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //the message TextView
        final TextView message = (TextView) findViewById(R.id.message);
        message.setText("Enter validation code:");

        //the validation code EditText
        final EditText validCode = (EditText) findViewById(R.id.inputCode);
        validCode.setGravity(Gravity.CENTER);

        //the button key
        final Button btn = (Button) findViewById(R.id.btn);
        btn.setText("OK");

        //the DriveAir logo
        final ImageView rideAirLogo = (ImageView) findViewById(R.id.rideAirLogo);
        rideAirLogo.setImageResource(R.drawable.ride_air_logo);



    }
}
