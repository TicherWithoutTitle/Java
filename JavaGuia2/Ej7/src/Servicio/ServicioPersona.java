/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ServicioPersona {
    Scanner read=new Scanner(System.in);
    public Persona crearPersona(){
        Persona nuevaPersona=new Persona();
        System.out.println("Ingrese el nombre de la persona");
        nuevaPersona.setNombre(read.next());
        System.out.println("edad");
        nuevaPersona.setEdad(read.nextInt());
        System.out.println("altura");
        nuevaPersona.setAltura(read.nextFloat());
        System.out.println("sexo");
        nuevaPersona.setSexo(read.next());
        System.out.println("peso");
        nuevaPersona.setPeso(read.nextFloat());
        return nuevaPersona;
    }
    public void verPersona(Persona nuevaPersona){
        System.out.println("=====================================\nINICIO VER PERSONA");
        System.out.println("altura: "+nuevaPersona.getAltura());
        System.out.println("nombre: "+nuevaPersona.getNombre());
        System.out.println("edad: "+nuevaPersona.getEdad());
        System.out.println("sexo: "+nuevaPersona.getSexo());
        System.out.println("peso: "+nuevaPersona.getPeso());
        System.out.println("=====================================\nFIN VER PERSONA");
    }
    public int calcularIMC(Persona p1){
        return p1.calcularIMC();
    }
    public boolean esMayorDeEdad(Persona p1){
        return p1.esMayorDeEdad();
    }
}