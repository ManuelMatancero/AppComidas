package com.manuelsarante.tarealist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner v;

        List<String> datos = new ArrayList<>();
        datos.add(0, "Seleccione");
        datos.add("Desayuno");
        datos.add("Almuerzo");
        datos.add("Cena");
        datos.add("Bebidas");
        datos.add("Ensalada");

        v = findViewById(R.id.spinner);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos);

        v.setAdapter(adaptador);

        v.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()){
            case R.id.spinner:
                if(parent.getSelectedItem().toString().equalsIgnoreCase("Desayuno")){
                        Intent i1 = new Intent(MainActivity.this, Desayuno.class);
                        startActivity(i1);
                }else if(parent.getSelectedItem().toString().equalsIgnoreCase("Almuerzo")){
                    Intent i1 = new Intent(MainActivity.this, Almuerzo.class);
                    startActivity(i1);
                }else if(parent.getSelectedItem().toString().equalsIgnoreCase("Cena")){
                    Intent i1 = new Intent(MainActivity.this, Cena.class);
                    startActivity(i1);
                }else if(parent.getSelectedItem().toString().equalsIgnoreCase("Bebidas")){
                    Intent i1 = new Intent(MainActivity.this, Bebidas.class);
                    startActivity(i1);
                }else if(parent.getSelectedItem().toString().equalsIgnoreCase("Ensalada")){
                    Intent i1 = new Intent(MainActivity.this, Ensalada.class);
                    startActivity(i1);
                }
                break;
            default:
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}