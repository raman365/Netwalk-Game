package com.example.raman365.i7437763;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;


public class Medium extends AppCompatActivity {

    static Context mDialogContext=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        mDialogContext = this;

        NetwalkView1 view = new NetwalkView1(getApplicationContext());
        setContentView(view);

    }
}
