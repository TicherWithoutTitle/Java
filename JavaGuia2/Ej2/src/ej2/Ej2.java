/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import Entidad.Circunferencia;
import Servicio.ServiceCircunferencia;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        ServiceCircunferencia ServCir=new ServiceCircunferencia();
        System.out.println("Indique el radio de la circunferencia");
        Circunferencia c1= ServCir.crearCircunferencia(read.nextFloat());
        ServCir.area(c1);
        ServCir.perimtetro(c1);
    }
    
}
