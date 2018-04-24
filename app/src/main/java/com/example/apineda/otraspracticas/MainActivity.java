package com.example.apineda.otraspracticas;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
    private Button button1, button2, button3, button4;
    private ButtonListener buttonListener = new ButtonListener();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= findViewById(R.id.b1);
        button2= findViewById(R.id.b2);
        button3= findViewById(R.id.b3);
        button4= findViewById(R.id.b4);
        buttonListener.setActivity(this);
        button1.setOnClickListener(buttonListener);
        button2.setOnClickListener(buttonListener);
        button3.setOnClickListener(buttonListener);
        button4.setOnClickListener(buttonListener);
    }


    @Override
    public void onClick(View v) {

    }
}
