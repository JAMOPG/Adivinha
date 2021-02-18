package com.cursodeandroid.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonPlay;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPlay = findViewById(R.id.button_play_id);
        textResult = findViewById(R.id.resultid);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              Random randomic = new Random();

                                              int numberrandomic = randomic.nextInt(10);
                                              textResult.setText("Numero Escolhido " + numberrandomic );
                                          }
                                      });

                //textResult.setText("Texto alterado");
    }
}
