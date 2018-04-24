package com.example.apineda.otraspracticas;

import android.app.Activity;
import android.view.View;

public class ButtonListener implements View.OnClickListener {
    private Activity activity;
    @Override
    public void onClick(View v) {


    }

    public void setActivity(Activity activity){
        this.activity=activity;
    }
}
