/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PersonaService {
    Scanner read=new Scanner(System.in);
    public Persona crearPersona(){
        Persona nuevaPersona=new Persona();
        System.out.println("Ingrese el nombre de la persona");
        nuevaPersona.setNombre(read.next());
        System.out.println("nacionalidad");
        nuevaPersona.setNacionalidad(read.next());
        System.out.println("domicilio");
        nuevaPersona.setDomicilio(read.next());
        System.out.println("edad");
        nuevaPersona.setEdad(read.nextInt());
        System.out.println("altura");
        nuevaPersona.setAltura(read.nextDouble());
        return nuevaPersona;
    }
    public void verPersona(Persona nuevaPersona){
        System.out.println("altura: "+nuevaPersona.getAltura());
        System.out.println("nombre: "+nuevaPersona.getNombre());
        System.out.println("edad: "+nuevaPersona.getEdad());
        System.out.println("domicilio: "+nuevaPersona.getDomicilio());
        System.out.println("nacionalidad: "+nuevaPersona.getNacionalidad());
        
    }
    
}
