package com.example.apineda.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private ButtonListener buttonListener = new ButtonListener();
    private EditText texto;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.et);
        send = findViewById(R.id.send);
        buttonListener.setOrigen(texto);
        buttonListener.setActivity(this);
        send.setOnClickListener(buttonListener);
    }
}
