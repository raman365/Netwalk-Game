package com.example.raman365.i7437763;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;


public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.instructions);

    }
}
