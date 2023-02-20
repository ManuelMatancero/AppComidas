package com.manuelsarante.tarealist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

    }

    public class FoodAdapter extends ArrayAdapter<DatosList> {

        public FoodAdapter(Context context, ArrayList<DatosList> comidas) {
            super(context, 0, comidas);
        }
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                //Obtiene los datos desde su posicion
                DatosList comida = getItem(position);

                //Verifica si una vista existente esta siendo reutilizada, de lo contrario muestrame la vista
                if (convertView==null){

                    convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
                }

                //Busca una vista para popular los datos
                TextView txttitulo = (TextView) convertView.findViewById(R.id.titulo);
                TextView txtdescripcion = (TextView) convertView.findViewById(R.id.desc);
                ImageView imagen = (ImageView) convertView.findViewById(R.id.imagen);
                //Popula los datos dentro de la plantilla
                txttitulo.setText(String.valueOf(comida.getTitulo()));
                txtdescripcion.setText(comida.getDescripcion());
                imagen.setImageDrawable(comida.getImagen());

                //devuelve la vista completa para mostrarla en pantalla
                return convertView;
            }

        }
    }
    /////////////////////////////////////Me quede realizando la listaaaaaaaaaa