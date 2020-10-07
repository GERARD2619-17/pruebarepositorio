package com.example.evaluacion.clases;

public class Estudiantes {
    private int id;
    private String nombre;
    private String codigo;
    private String materia;
    private double parcial1;
    private double parcial2;
    private double parcial3;
    private double promedio;


    public Estudiantes(int id, String nombre, String codigo, String materia, double parcial1, double parcial2, double parcial3) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia = materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getParcial1() {
        return parcial1;
    }

    public void setParcial1(double parcial1) {
        this.parcial1 = parcial1;
    }

    public double getParcial2() {
        return parcial2;
    }

    public void setParcial2(double parcial2) {
        this.parcial2 = parcial2;
    }

    public double getParcial3() {
        return parcial3;
    }

    public void setParcial3(double parcial3) {
        this.parcial3 = parcial3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPromedioFinal(double parcial1, double parcial2, double parcial3){
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
        double promedioFinal;

        promedioFinal = ((parcial1*0.30)+(parcial2*0.30)+(parcial3*0.4));

        return promedioFinal;

    }
}
