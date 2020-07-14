package com.example.mysupergranproyect2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Comunicacion2 extends AppCompatActivity { TextView txtmensaje;
    String nombre;
    int ingresomes;
    int evaluacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_comunicacion2);
    Bundle extras = getIntent().getExtras();
        //assert extras != null;
        nombre= extras.getString("nombre");
        ingresomes = extras.getInt("ingresomes");
        txtmensaje=findViewById(R.id.txtmensaje);
        if (ingresomes < 800)
            evaluacion = 1500;
        else if	(ingresomes < 1500)
            evaluacion = 2500;
        else if	(ingresomes < 3000)
            evaluacion = 5000;
        else if	(ingresomes < 5000)
            evaluacion = 12000;
        else if	(ingresomes < 10000)
            evaluacion = 25000;
        else
            evaluacion = 45000;
        txtmensaje.setText("Buen día "+ nombre + " por su ingreso mensual de " + ingresomes +
                " podemos ofrecerle hasta " + evaluacion + "soles");
    }

    public void aceptar(View view) {
        Intent intent=new Intent();
        intent.putExtra("resultado","acertado");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void rechazar(View view) {
        Intent intent=new Intent();
        intent.putExtra("resultado","rechazado");
        setResult(RESULT_OK, intent);
        finish();
    }
}

