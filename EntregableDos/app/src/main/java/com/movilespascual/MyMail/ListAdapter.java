package com.movilespascual.MyMail;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;




public class ListAdapter extends BaseAdapter {

    Context contexto;
    String [] nombres, mensajes,vistap, horaUltimoMensaje,cuerpo,pais;
    int[] idImagen;
    LayoutInflater inflater;

    public ListAdapter(Context contexto, String[] nombres, String[] mensajes,String[] vista,
                       String[] horaUltimoMensaje, String[] cuerpos, String[] pais, int[] idImagen) {
        this.contexto = contexto;
        this.nombres = nombres;
        this.mensajes = mensajes;
        this.vistap = vista;
        this.horaUltimoMensaje = horaUltimoMensaje;
        this.cuerpo = cuerpos;
        this.pais = pais;
        this.idImagen = idImagen;
        inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount() {
        return nombres.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_item, null);
        ImageView fotoPerfil = view.findViewById(R.id.imagenPerfil);
        TextView nombreUsuario = view.findViewById(R.id.nombrePersona);
        TextView ultimoMensaje = view.findViewById(R.id.ultimoMensaje);
        TextView vista = view.findViewById(R.id.vistaPrevia);
        TextView horaMensaje = view.findViewById(R.id.horaMensaje);
        fotoPerfil.setImageResource(idImagen[i]);
        nombreUsuario.setText(nombres[i]);
        ultimoMensaje.setText(mensajes[i]);
        vista.setText(vistap[i]);
        horaMensaje.setText(horaUltimoMensaje[i]);


        return view;
    }
}
