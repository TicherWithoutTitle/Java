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
    private float altura;
    private String sexo;
    private float peso;

    public Persona(String nombre, int edad, float altura, String sexo, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.sexo = sexo;
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int calcularIMC(){
        float IMC=peso/(altura*altura);
        System.out.println("IMC: "+IMC);
        int rtr=1;
        if (IMC<20){
            rtr= -1;
        }else if(IMC>=20 && IMC<=25){
            rtr= 0;
        }
        return rtr;
    }
    public boolean esMayorDeEdad(){
        return edad>=18;
    }
}