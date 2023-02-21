package com.manuelsarante.tarealist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Almuerzo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almuerzo);
    }

    public void goArroz(View view) {
        MainActivity.dTipo = "arroz";
        Intent i = new Intent(Almuerzo.this, Lista.class);
        startActivity(i);
    }

    public void goCarne(View view) {
        MainActivity.dTipo = "carne";
        Intent i = new Intent(Almuerzo.this, Lista.class);
        startActivity(i);
    }

    public void goPescado(View view) {
        MainActivity.dTipo= "pescado";
        Intent i = new Intent(Almuerzo.this, Lista.class);
        startActivity(i);
    }

    public void goPollo(View view) {
        MainActivity.dTipo = "pollo";
        Intent i = new Intent(Almuerzo.this, Lista.class);
        startActivity(i);
    }

    public void goVegetales(View view) {
        MainActivity.dTipo = "vegetales";
        Intent i = new Intent(Almuerzo.this, Lista.class);
        startActivity(i);
    }
}