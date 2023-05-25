/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroestudiante;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private int codigo;
    private int cedula;
    private int semestre;
    private String carrera;
    private double promedio;

    // Constructor
    public Estudiante(String nombres, String apellidos, int codigo, int cedula, int semestre, String carrera, double promedio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.cedula = cedula;
        this.semestre = semestre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
 
}

