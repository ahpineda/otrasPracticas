package com.example.apineda.otraspracticas;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.b1);
        button2=(Button) findViewById(R.id.b2);
        button3=(Button) findViewById(R.id.b3);
        button4=(Button) findViewById(R.id.b4);
    }


    @Override
    public void onClick(View v) {

    }
}
