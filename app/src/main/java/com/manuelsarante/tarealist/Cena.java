package com.manuelsarante.tarealist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cena);
    }

    public void goHarina(View view) {
        MainActivity.dTipo = "harina";
        Intent i = new Intent(Cena.this, Lista.class);
        startActivity(i);
    }

    public void goEspaguetti(View view) {
        MainActivity.dTipo = "espaguetti";
        Intent i = new Intent(Cena.this, Lista.class);
        startActivity(i);
    }
    public void goPlatano(View view) {
        MainActivity.dTipo = "platano";
        Intent i = new Intent(Cena.this, Lista.class);
        startActivity(i);
    }

    public void goCpollo(View view) {
        MainActivity.dTipo = "cPollo";
        Intent i = new Intent(Cena.this, Lista.class);
        startActivity(i);
    }

    public void goSalmon(View view) {
        MainActivity.dTipo = "salmon";
        Intent i = new Intent(Cena.this, Lista.class);
        startActivity(i);
    }
}