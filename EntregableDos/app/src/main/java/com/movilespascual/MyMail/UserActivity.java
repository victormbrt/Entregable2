package com.movilespascual.MyMail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserActivity extends AppCompatActivity {

    String nombre,mensaje,hora,cuerpo,pais;
    TextView textoNombre, textoMensaje,textovista,textoHora,textoCuerpo,textoPais;
    int imagen;
    CircleImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

          setContentView(R.layout.activity_user);
        textoNombre = findViewById(R.id.textoNombre);
        textoMensaje = findViewById(R.id.textoMensaje);
        textoCuerpo = findViewById(R.id.textoCuerpo);
        textoPais = findViewById(R.id.pais);
        image = findViewById(R.id.imagen);

        Intent datos = this.getIntent();
        if(datos != null){
            nombre = datos.getStringExtra("nombre");
            mensaje = datos.getStringExtra("mensaje");
            hora = datos.getStringExtra("hora");
            cuerpo = datos.getStringExtra("cuerpo");
            pais = datos.getStringExtra("pais");
            imagen = datos.getIntExtra("imagen",R.drawable.img_1);

            textoPais.setText(pais);
            textoNombre.setText(nombre);
            textoCuerpo.setText(cuerpo);
            textoMensaje.setText(mensaje);
            image.setImageResource(imagen);
        }


    }
}