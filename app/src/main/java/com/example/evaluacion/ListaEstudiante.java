package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.evaluacion.clases.AdaptadorEstudiante;

import static com.example.evaluacion.MainActivity.listaEstudiante;

public class ListaEstudiante extends AppCompatActivity {

    private RecyclerView listvEstudiantes;
    private AdaptadorEstudiante adaptador;
    private LinearLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);

        //Cargar los datos
        this.listvEstudiantes = findViewById(R.id.listvEstudiantes);
        this.manager = new LinearLayoutManager(this);
        this.adaptador = new AdaptadorEstudiante(listaEstudiante);

        //Configuramos el RecyclerView
        this.listvEstudiantes.setHasFixedSize(true);
        this.listvEstudiantes.setLayoutManager(this.manager);
        this.listvEstudiantes.setAdapter(this.adaptador);
    }
}