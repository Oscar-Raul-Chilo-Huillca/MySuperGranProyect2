package com.example.mysupergranproyect2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Comunicacion3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion3);
    }
    public void volver(View view) {
        Intent intent = new Intent();
        setResult(RESULT_OK, intent); finish();
    }

}
