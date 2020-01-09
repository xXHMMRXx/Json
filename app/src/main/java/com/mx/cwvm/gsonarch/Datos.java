package com.mx.cwvm.gsonarch;

public class Datos
{

    private String nombre;
    private int edad;
    private String correo;
    private String curp;

    public Datos(String nombre, int edad, String correo, String curp) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

}
