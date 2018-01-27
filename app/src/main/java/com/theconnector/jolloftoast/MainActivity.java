package com.theconnector.jolloftoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.shashank.sony.fancytoastlib.FancyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void Success(View view) {
        FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,
                FancyToast.SUCCESS, R.drawable.android_jollof
        ).show();
    }

    public void Info(View view) {
        FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,
                FancyToast.INFO,true
        ).show();
    }

    public void Warning(View view) {
        FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,
                FancyToast.WARNING,true
        ).show();
    }

    public void Error(View view) {
        FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,
                FancyToast.ERROR,true
        ).show();
    }

    public void Confusing(View view) {
        FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,
                FancyToast.CONFUSING,true
        ).show();
    }
}
