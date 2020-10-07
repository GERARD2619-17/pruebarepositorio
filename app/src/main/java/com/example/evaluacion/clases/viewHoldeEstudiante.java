package com.example.evaluacion.clases;

import android.view.View;
import android.widget.TextView;

import com.example.evaluacion.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHoldeEstudiante extends RecyclerView.ViewHolder {

    private TextView txtNumero;
    private TextView txtNombre;
    private TextView txtCodigo;
    private TextView txtMateria;
    private TextView txtPromedio;

    public viewHoldeEstudiante(@NonNull View itemView) {
        super(itemView);
        //inicializamos los controles
        this.txtNumero = itemView.findViewById(R.id.txtNumero);
        this.txtNombre = itemView.findViewById(R.id.txtNombre);
        this.txtCodigo = itemView.findViewById(R.id.txtCodigo);
        this.txtMateria = itemView.findViewById(R.id.txtMateria);
        this.txtPromedio = itemView.findViewById(R.id.txtPromedio);
    }

    public TextView getTxtNumero() {
        return txtNumero;
    }

    public TextView getTxtNombre() {
        return txtNombre;
    }

    public TextView getTxtCodigo() {
        return txtCodigo;
    }

    public TextView getTxtMateria() {
        return txtMateria;
    }

    public TextView getTxtPromedio() {
        return txtPromedio;
    }
}
