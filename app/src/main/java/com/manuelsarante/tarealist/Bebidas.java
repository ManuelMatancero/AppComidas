package com.manuelsarante.tarealist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);
    }

    public void goCerveza(View view) {
        MainActivity.dTipo = "cerveza";
        Intent i = new Intent(Bebidas.this, Lista.class);
        startActivity(i);
    }

    public void goRon(View view) {
        MainActivity.dTipo = "ron";
        Intent i = new Intent(Bebidas.this, Lista.class);
        startActivity(i);
    }

    public void goVino(View view) {
        MainActivity.dTipo = "vino";
        Intent i = new Intent(Bebidas.this, Lista.class);
        startActivity(i);
    }

    public void goVodka(View view) {
        MainActivity.dTipo = "vodka";
        Intent i = new Intent(Bebidas.this, Lista.class);
        startActivity(i);
    }

    public void goWisky(View view) {
        MainActivity.dTipo = "wisky";
        Intent i = new Intent(Bebidas.this, Lista.class);
        startActivity(i);
    }
}