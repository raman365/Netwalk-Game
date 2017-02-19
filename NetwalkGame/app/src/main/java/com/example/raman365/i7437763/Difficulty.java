package com.example.raman365.i7437763;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class Difficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.difficulty);


        Button button= (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent z = new Intent(getApplicationContext(),Easy.class);
                startActivity(z);
            }
        });

        Button button2= (Button) findViewById(R.id.button5);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),Medium.class);
                startActivity(a);
            }
        });

        Button button3= (Button) findViewById(R.id.button6);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),Hard.class);
                startActivity(a);
            }
        });
    }
}
