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
    }
    
}
