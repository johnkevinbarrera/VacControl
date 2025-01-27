package com.andes.vacbscontrol.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.andes.vacbscontrol.R;

import java.util.ArrayList;

public class AdaptadorGanado extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String tipo;
    ArrayList<ArrayList<String>> datos;

    public AdaptadorGanado(Context context, String tipo, ArrayList<ArrayList<String>> datos) {
        this.contexto = context;
        this.tipo = tipo;
        this.datos = datos;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() { return datos.size(); }

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
        final View vista = inflater.inflate(R.layout.element_list_ganados, null);

        TextView titulo = (TextView) vista.findViewById(R.id.tvTitulo);
        TextView nombre = (TextView) vista.findViewById(R.id.tvNombre);
        TextView detalle = (TextView) vista.findViewById(R.id.tvDetalle);
        ImageView imagen = (ImageView) vista.findViewById(R.id.tvImagen);

        titulo.setText(tipo + " " + (i+1));
        nombre.setText(""+datos.get(i).get(1));
        detalle.setText(""+datos.get(i).get(2));
        imagen.setImageResource(R.mipmap.vaquita);

        return vista;
    }
}
