package com.manuelsarante.tarealist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ensalada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ensalada);
    }

    public void goLechuga(View view) {
        MainActivity.dTipo = "lechuga";
        Intent i = new Intent(Ensalada.this, Lista.class);
        startActivity(i);
    }

    public void goPepino(View view) {
        MainActivity.dTipo = "pepino";
        Intent i = new Intent(Ensalada.this, Lista.class);
        startActivity(i);
    }

    public void goRemolacha(View view) {
        MainActivity.dTipo = "remolacha";
        Intent i = new Intent(Ensalada.this, Lista.class);
        startActivity(i);
    }

    public void goRepollo(View view) {
        MainActivity.dTipo = "repollo";
        Intent i = new Intent(Ensalada.this, Lista.class);
        startActivity(i);
    }

    public void goTomate(View view) {
        MainActivity.dTipo = "tomate";
        Intent i = new Intent(Ensalada.this, Lista.class);
        startActivity(i);
    }
}