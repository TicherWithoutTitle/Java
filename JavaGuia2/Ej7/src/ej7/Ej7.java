/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7;

import Entidad.Persona;
import Servicio.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read= new Scanner(System.in);
        //Persona p1=new Persona("Maxi",18,"Rawson", 1.75,"Argentina");
        ServicioPersona sv=new ServicioPersona();
        Persona p1=sv.crearPersona();
        sv.verPersona(p1);
        Persona p2=sv.crearPersona();
        sv.verPersona(p2);
        Persona p3=sv.crearPersona();
        sv.verPersona(p3);
        Persona p4=sv.crearPersona();
        sv.verPersona(p4);
        int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        if(sv.esMayorDeEdad(p1)){
            cont1++;
        }else{
            cont2++;
        }
        if(sv.esMayorDeEdad(p2)){
            cont1++;
        }else{
            cont2++;
        }
        if(sv.esMayorDeEdad(p3)){
            cont1++;
        }else{
            cont2++;
        }
        if(sv.esMayorDeEdad(p4)){
            cont1++;
        }else{
            cont2++;
        }
        switch(sv.calcularIMC(p1)){
            case -1:
                cont3++;
                break;
            case 0:
                cont4++;
                break;
            case 1:
                cont5++;
                break;
        }
        switch(sv.calcularIMC(p2)){
            case -1:
                cont3++;
                break;
            case 0:
                cont4++;
                break;
            case 1:
                cont5++;
                break;
        }
        switch(sv.calcularIMC(p3)){
            case -1:
                cont3++;
                break;
            case 0:
                cont4++;
                break;
            case 1:
                cont5++;
                break;
        }
        switch(sv.calcularIMC(p4)){
            case -1:
                cont3++;
                break;
            case 0:
                cont4++;
                break;
            case 1:
                cont5++;
                break;
        }
        float promedioMayorEdad=(cont1*100/4);
        System.out.println("porcentaje de mayores de edad: "+promedioMayorEdad);
        System.out.println("sobrepeso: "+cont5+"\npeso ideal: "+cont4+"\ndebajo peso ideal: "+cont3);
        
    }
    
}
