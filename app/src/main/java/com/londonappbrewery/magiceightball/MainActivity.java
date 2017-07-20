package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random randomNumberGenerator = new Random();
        final int[] imageArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final ImageView ballImageView = (ImageView) findViewById(R.id.image_eightBall);

        Button askButton = (Button) findViewById(R.id.button_askButton);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int number = randomNumberGenerator.nextInt(5);

                Log.d("8Ball", "onClick number: "+number);

                ballImageView.setImageResource(imageArray[number]);
            }
        });

    }
}
