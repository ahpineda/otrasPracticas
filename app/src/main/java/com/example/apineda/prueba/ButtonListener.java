package com.example.apineda.prueba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

class ButtonListener implements View.OnClickListener {
    private EditText origen;
    private Activity activity;

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(activity, Segunda_Activity.class);
        Bundle bundle = new Bundle();

        bundle.putString("texto", origen.getText().toString());
        intent.putExtras(bundle);
        activity.startActivity(intent);

    }

    public void setOrigen(EditText origen) {
        this.origen = origen;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
