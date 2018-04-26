package com.example.apineda.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Segunda_Activity extends AppCompatActivity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_);

        texto = findViewById(R.id.tf);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        texto.setText(bundle.getString("texto"));
        }
}
