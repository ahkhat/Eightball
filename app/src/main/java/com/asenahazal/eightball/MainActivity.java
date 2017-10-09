package com.asenahazal.eightball;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button askButton;
        askButton=(Button) findViewById(R.id.askButton);

        final ImageView ball =(ImageView)findViewById(R.id.eightBall);

        final int [] ballArray={
        R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};


       askButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Random hazal=new Random();
               int number =hazal.nextInt(5);

               ball.setImageResource(ballArray[number]);

           }
       });


    }
}
