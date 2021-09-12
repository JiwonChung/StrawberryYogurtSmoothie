package com.example.hopethisisntthelastchance;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button_signIn, button_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonListener buttonListener = new ButtonListener();

        button_signIn = (Button) findViewById(R.id.button_signIn);
        button_signUp = (Button) findViewById(R.id.button_signUp);

        button_signIn.setOnClickListener(buttonListener);
        button_signUp.setOnClickListener(buttonListener);

    }


    class ButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button_signIn:
                    Toast.makeText(getApplicationContext(), "아직한참 먼 그곳은", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button_signUp:
                    Toast.makeText(getApplicationContext(), "그댈위한 파라다이스", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}