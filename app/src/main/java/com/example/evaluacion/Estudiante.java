package com.example.evaluacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.evaluacion.clases.Estudiantes;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import static com.example.evaluacion.MainActivity.listaEstudiante;

public class Estudiante extends AppCompatActivity implements View.OnClickListener {

    EditText editNombre, editCodigo, editMateria, editPrimerParcial, editSegundoPacial, editTercerParcial;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);
        editNombre = findViewById(R.id.editNombre);
        editCodigo = findViewById(R.id.editCodigo);
        editMateria = findViewById(R.id.editMateria);
        editPrimerParcial = findViewById(R.id.editPrimerParcial);
        editSegundoPacial = findViewById(R.id.editSegundoParcial);
        editTercerParcial = findViewById(R.id.editTercerParcial);
        btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(this);

    }

    private boolean validar() {

        boolean campos = true;

        if (editNombre.getText().toString().isEmpty()) {
            editNombre.setError("Debe digitar su nombre");
            campos = false;
        } else if (editCodigo.getText().toString().isEmpty()) {
            editCodigo.setError("Debe digitar su código");
            campos = false;
        } else if (editMateria.getText().toString().isEmpty()) {
            editMateria.setError("Debe digitar la materia");
            campos = false;
        } else if (editPrimerParcial.getText().toString().isEmpty()) {
            editPrimerParcial.setError("Debe digitar la nota");
            campos = false;
        } else if (editSegundoPacial.getText().toString().isEmpty()) {
            editSegundoPacial.setError("Debe digitar la nota");
            campos = false;
        } else if (editTercerParcial.getText().toString().isEmpty()) {
            editTercerParcial.setError("Debe digitar la nota");
            campos = false;
        }

        return campos;
    }

    public void NuevoEstudiante() {

        if (validar()) {
            Estudiantes e = new Estudiantes(listaEstudiante.size() + 1, editNombre.getText().toString(),
                    editCodigo.getText().toString(), editMateria.getText().toString(),
                    Double.parseDouble(editPrimerParcial.getText().toString()),
                    Double.parseDouble(editSegundoPacial.getText().toString()),
                    Double.parseDouble(editTercerParcial.getText().toString()));

            double promedio = e.getPromedioFinal(Double.parseDouble(editPrimerParcial.getText().toString()),
                    Double.parseDouble(editSegundoPacial.getText().toString()),
                    Double.parseDouble(editTercerParcial.getText().toString()));
            e.setPromedio(promedio);
            listaEstudiante.add(e);
            this.finish();
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnGuardar: {
                NuevoEstudiante();
            }break;
        }

    }
}