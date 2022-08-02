/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejGuia;

import Entidad.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EjGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        //Persona p1=new Persona("Maxi",18,"Rawson", 1.75,"Argentina");
        PersonaService ServPer=new PersonaService();
        Persona p1=ServPer.crearPersona();
        ServPer.verPersona(p1);
        Persona p2=ServPer.crearPersona();
        ServPer.verPersona(p2);
        Persona p3=ServPer.crearPersona();
        ServPer.verPersona(p3);
        Persona p4=ServPer.crearPersona();
        ServPer.verPersona(p4);
        Persona p5=ServPer.crearPersona();
        ServPer.verPersona(p5);
        Persona listaPersona[]=new Persona[5];
        listaPersona[0]=p1;
        listaPersona[1]=p2;
        listaPersona[2]=p3;
        listaPersona[3]=p4;
        listaPersona[4]=p5;
        read.next();
        for (int i = 0; i < 5; i++) {
            ServPer.verPersona(listaPersona[i]);
        }
    }
    
}
