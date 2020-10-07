package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.evaluacion.clases.Estudiantes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnEstudiante, btnListaEstudiante;
    public static List<Estudiantes> listaEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEstudiante = findViewById(R.id.btnEstudiante);
        btnListaEstudiante = findViewById(R.id.btnListaEstudiante);



        listaEstudiante = new ArrayList<>();

        btnEstudiante.setOnClickListener(this);
        btnListaEstudiante.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnEstudiante:{
                Intent i = new Intent(this, Estudiante.class);
                startActivity(i);
            }break;
            case R.id.btnListaEstudiante: {
                if(listaEstudiante.isEmpty()){
                    Toast.makeText(this, "Por Favor Ingrese un estudiante para ver su lista", Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(MainActivity.this, ListaEstudiante.class);
                    startActivity(i);
                }
            }break;


        }
    }
}