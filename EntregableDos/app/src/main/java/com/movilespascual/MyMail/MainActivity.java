package com.movilespascual.MyMail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;




public class MainActivity extends AppCompatActivity {

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main);

        int[] idImagen = {
                R.drawable.img_1,
                R.drawable.img_2,
                R.drawable.img_3,
                R.drawable.img_4,
                R.drawable.img_5,
                R.drawable.img_6,
                R.drawable.img_7,
                R.drawable.img_8,
                R.drawable.img_9,
                R.drawable.img_10,
                R.drawable.img_11,
        };

        String[] nombre = {
               "Sam",
               "Facebook",
                "Google+",
                "Twitter",
                "Pinterest Weekly",
                "Josh",
                "victor",
                "Eduar",
                "Camilo",
                "Maria",
                "Diela"

        };

        String[] ultimoMensaje ={
                "WeeKend adventure", "James, you have 1 new notification","Top suggested Google+ pages for you?","Follow T-Mobile, Samsung Mobile U","Pins you`ll Love!","Going lunch",
                "Que mas", "Citacion","Bienvenido","Gracias por participar","Registro exitoso"
        };
        String[] vista ={
                "We are going fishing with John and others. We will, we will ", "A lot has happened on Facebook since","Top suggested Google+pages for you","James, some people you manu know","Have you seen these Pins yet? Pinterest","Going lunch",
                "ultimos días de inscripción", "Se aproximan las jornadas","Le damos la bienvenida al","Preparate para conocer el nuevo","Tenemos una buena noticia para ti"
        };
        String[] horaUltimoMensaje ={
                "10:42am", "16:04pm","18:44pm","20:04pm","09:04am","01:04am","02:25am","04:55am","10:15am","01:35pm","2:45pm"
        };
        String[] cuerpo ={
                "do it on Saturday at 3 in the afternoon", "this is an alert message since misuse of the application was identified","'These are the most visited pages by you during this week",
                "These people have commented a lot on your contributions","look at these suggestions we have for you","Prepare fun recipes for lunchtime", "Aprovecha los ultimas dias para realizar la inscripciòn a nuestro curos",
                "Se aproximan las jornadas pascualinas","Le damos la bienvenida al curso de fundamentos de programaciòn","Estas preparada para conocer las nuevas peliculas que tenemos para ti",
                "Aprovecha esta oportunidad para viajar a cualquier con el 30% de descuento"
        };

        String[] pais ={
                "Colombia", "USA","Colombia","Perú","Alemania","Suiza","USA","Suecia","Japon","Corea del sur","Australia"
        };




        ListAdapter listAdapter = new ListAdapter(MainActivity.this, nombre,ultimoMensaje,vista,horaUltimoMensaje,cuerpo,pais,idImagen);
        lista = (ListView) findViewById(R.id.listaView);
        lista.setAdapter(listAdapter);
        //agregar listener para cuando se hace click sobre el item
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long id) {
                //Agregar el intent
                Intent irAinformacion = new Intent(MainActivity.this,UserActivity.class)
                        .putExtra("nombre",nombre[posicion])
                        .putExtra("mensaje", ultimoMensaje[posicion])
                        .putExtra("vista",vista[posicion])
                        .putExtra("hora",horaUltimoMensaje[posicion])
                        .putExtra("cuerpo",cuerpo[posicion])
                        .putExtra("pais",pais[posicion])
                        .putExtra("imagen",idImagen[posicion]);

                startActivity(irAinformacion);
            }
        });

    }
}