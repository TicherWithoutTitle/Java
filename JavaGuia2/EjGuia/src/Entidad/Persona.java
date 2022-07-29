/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Admin
 */
public class Persona {
    private String nombre;
    private int edad;
    private String domicilio;
    private double altura;
    private String nacionalidad;
    
    public Persona(String nombre, int edad, String domicilio, float altura, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
        this.altura = altura;
        this.nacionalidad = nacionalidad;
    }

    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public double getAltura() {
        return altura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}