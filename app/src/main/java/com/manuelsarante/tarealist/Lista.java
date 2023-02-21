package com.manuelsarante.tarealist;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Lista extends AppCompatActivity {
    //desayuno////////////////////////
    private String[] avena;
    private String[] huevos;
    private String[] pan;
    private String[] yogurt;
    private String[] frutas;

    private String[] avenades;
    private String[] huevosdes;
    private String[] pandes;
    private String[] yogurtdes;
    private String[] frutasdes;

    //Almuerzo//////////////////////
    private String[] arroz;
    private String[] carne;
    private String[] pescado;
    private String[] pollo;
    private String[] vegetales;

    private String[] arrozdes;
    private String[] carnedes;
    private String[] pescadodes;
    private String[] pollodes;
    private String[] vegetalesdes;

    //cena/////////////////////////////
    private String[] harina;
    private String[] espaguetti;
    private String[] platano;
    private String[] cPollo;
    private String[] salmon;

    private String[] harinades;
    private String[] espaguettides;
    private String[] platanodes;
    private String[] cPollodes;
    private String[] salmondes;

    //bebidas/////////////////////////////
    private String[] cerveza;
    private String[] ron;
    private String[] vino;
    private String[] vodka;
    private String[] wisky;

    private String[] cervezades;
    private String[] rondes;
    private String[] vinodes;
    private String[] vodkades;
    private String[] wiskydes;


    //ensaladas/////////////////////////////
    private String[] lechuga;
    private String[] pepino;
    private String[] remolacha;
    private String[] repollo;
    private String[] tomate;

    private String[] lechugades;
    private String[] pepinodes;
    private String[] remolachades;
    private String[] repollodes;
    private String[] tomatedes;


    FoodAdapter adapter;
    ListView lv;

    String tipo = Desayuno.dTipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lv = findViewById(R.id.lista);

        //Desayuno
        avena = getResources().getStringArray(R.array.avena);
        huevos = getResources().getStringArray(R.array.huevo);
        pan = getResources().getStringArray(R.array.pan);
        yogurt = getResources().getStringArray(R.array.yogurt);
        frutas = getResources().getStringArray(R.array.frutas);

        avenades = getResources().getStringArray(R.array.avena_desc);
        huevosdes = getResources().getStringArray(R.array.huevo_desc);
        pandes = getResources().getStringArray(R.array.pan_desc);
        yogurtdes = getResources().getStringArray(R.array.yogurt_desc);
        frutasdes = getResources().getStringArray(R.array.frutas_desc);

        //Almuerzo
        arroz = getResources().getStringArray(R.array.arroz);
        carne = getResources().getStringArray(R.array.carne);
        pollo = getResources().getStringArray(R.array.pollo);
        pescado = getResources().getStringArray(R.array.pescado);
        vegetales = getResources().getStringArray(R.array.vegetales);

        arrozdes = getResources().getStringArray(R.array.arroz_desc);
        carnedes = getResources().getStringArray(R.array.carne_desc);
        pollodes = getResources().getStringArray(R.array.pollo_desc);
        pescadodes = getResources().getStringArray(R.array.pescado_desc);
        vegetalesdes= getResources().getStringArray(R.array.vegetales_desc);

        //Cena
        harina = getResources().getStringArray(R.array.harina);
        espaguetti = getResources().getStringArray(R.array.espaguetti);
        platano = getResources().getStringArray(R.array.platano);
        cPollo = getResources().getStringArray(R.array.cPollo);
        salmon = getResources().getStringArray(R.array.salmon);

        harinades = getResources().getStringArray(R.array.harina_desc);
        espaguettides = getResources().getStringArray(R.array.espaguetti_desc);
        platanodes = getResources().getStringArray(R.array.platano_desc);
        cPollodes = getResources().getStringArray(R.array.cPollo_desc);
        salmondes = getResources().getStringArray(R.array.salmon_desc);

        //Bebidas
        cerveza = getResources().getStringArray(R.array.cerveza);
        ron = getResources().getStringArray(R.array.ron);
        vino = getResources().getStringArray(R.array.vino);
        vodka = getResources().getStringArray(R.array.vodka);
        wisky = getResources().getStringArray(R.array.whisky);

        cervezades = getResources().getStringArray(R.array.cerveza_desc);
        rondes = getResources().getStringArray(R.array.ron_desc);
        vinodes = getResources().getStringArray(R.array.vino_desc);
        vodkades = getResources().getStringArray(R.array.vodka_desc);
        wiskydes = getResources().getStringArray(R.array.whisky_desc);


        //Ensaladas
        lechuga = getResources().getStringArray(R.array.lechuga);
        pepino = getResources().getStringArray(R.array.pepino);
        remolacha = getResources().getStringArray(R.array.remolacha);
        repollo = getResources().getStringArray(R.array.tomate);
        tomate = getResources().getStringArray(R.array.tomate);

        lechugades = getResources().getStringArray(R.array.lechuga_desc);
        pepinodes = getResources().getStringArray(R.array.pepino_desc);
        remolachades= getResources().getStringArray(R.array.remolacha_desc);
        repollodes = getResources().getStringArray(R.array.tomate_desc);
        tomatedes = getResources().getStringArray(R.array.tomate_desc);


        mostrarComidas();


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
                txtdescripcion.setText(String.valueOf(comida.getDescripcion()));
                imagen.setImageDrawable(comida.getImagen());
                //devuelve la vista completa para mostrarla en pantalla
                return convertView;
            }

        }

        public void mostrarComidas(){
            List<DatosList> comidasList = new ArrayList<>();
            ArrayList<DatosList> miListaComidas = new ArrayList<>();
            int imageResource;
            String uri = "@drawable/";
            switch (tipo){
                case "avena":
                   // where myresource (without the extension) is the file
                    imageResource = getResources().getIdentifier(uri+"desavena", null, getPackageName());
                    for(int i= 0 ; i < 4; i++){
                        DatosList datos = new DatosList();
                        datos.setTitulo(avena[i]);
                        datos.setDescripcion(avenades[i]);
                        datos.setImagen(getResources().getDrawable(imageResource));
                        comidasList.add(datos);
                    }
                    miListaComidas.addAll(comidasList);
                    break;

                case "huevo":
                    imageResource = getResources().getIdentifier(uri+"deshuevos", null, getPackageName());
                    for(int i= 0 ; i < 4; i++){
                        DatosList datos = new DatosList();
                        datos.setTitulo(huevos[i]);
                        datos.setDescripcion(huevosdes[i]);
                        datos.setImagen(getResources().getDrawable(imageResource));
                        comidasList.add(datos);
                    }
                    miListaComidas.addAll(comidasList);
                    break;

                case "pan":
                    imageResource = getResources().getIdentifier(uri+"despnatostado", null, getPackageName());
                    for(int i= 0 ; i < 4; i++){
                        DatosList datos = new DatosList();
                        datos.setTitulo(pan[i]);
                        datos.setDescripcion(pandes[i]);
                        datos.setImagen(getResources().getDrawable(imageResource));
                        comidasList.add(datos);
                    }
                    miListaComidas.addAll(comidasList);
                    break;
                case "yogurt":
                    imageResource = getResources().getIdentifier(uri+"desyogurt", null, getPackageName());
                    for(int i= 0 ; i < 4; i++){
                        DatosList datos = new DatosList();
                        datos.setTitulo(yogurt[i]);
                        datos.setDescripcion(yogurtdes[i]);
                        datos.setImagen(getResources().getDrawable(imageResource));
                        comidasList.add(datos);
                    }
                    miListaComidas.addAll(comidasList);
                    break;

                case "fruta":
                    imageResource = getResources().getIdentifier(uri+"desfrutas", null, getPackageName());
                    for(int i= 0 ; i < 4; i++){
                        DatosList datos = new DatosList();
                        datos.setTitulo(frutas[i]);
                        datos.setDescripcion(frutasdes[i]);
                        datos.setImagen(getResources().getDrawable(imageResource));
                        comidasList.add(datos);
                    }
                    miListaComidas.addAll(comidasList);
                    break;


            }

            ArrayList<DatosList> arrayofComidas = new ArrayList<>();
            adapter = new FoodAdapter(Lista.this, arrayofComidas);
            lv.setAdapter(adapter);
            adapter.addAll(miListaComidas);
        }

    }
    /////////////////////////////////////Me quede realizando la listaaaaaaaaaa