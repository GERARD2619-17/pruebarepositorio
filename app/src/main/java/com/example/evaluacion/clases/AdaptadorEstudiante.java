package com.example.evaluacion.clases;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.evaluacion.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptadorEstudiante extends RecyclerView.Adapter<viewHoldeEstudiante> {


    public List<Estudiantes> listaEstudiantes;

    public AdaptadorEstudiante(List<Estudiantes> data){
        this.listaEstudiantes = data;
    }


    @NonNull
    @Override
    public viewHoldeEstudiante onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //creamos la vista que representa el item
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_estudiante,parent,false);
        viewHoldeEstudiante vhEstudiante = new viewHoldeEstudiante(vista);
        return vhEstudiante;

    }

    @Override
    public void onBindViewHolder(@NonNull viewHoldeEstudiante holder, int position) {
        //Enlazamos los datos con el ViewHolder


        holder.getTxtNumero().setText(String.valueOf(this.listaEstudiantes.get(position).getId()));
        holder.getTxtNombre().setText(this.listaEstudiantes.get(position).getNombre());
        holder.getTxtCodigo().setText(this.listaEstudiantes.get(position).getCodigo());
        holder.getTxtMateria().setText(this.listaEstudiantes.get(position).getMateria());
        holder.getTxtPromedio().setText(Double.toString(this.listaEstudiantes.get(position).getPromedio()));


    }

    @Override
    public int getItemCount() {
        return this.listaEstudiantes.size();
    }
}
