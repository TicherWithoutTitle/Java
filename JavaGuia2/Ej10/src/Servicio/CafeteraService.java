/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CafeteraService {
    Scanner read=new Scanner(System.in);
    public Cafetera crearCafetera(){
        System.out.println("ingrese cantidad maxima y actual de la cafetera\nseperados por espacio");
        Cafetera c1 = new Cafetera(read.nextInt(),read.nextInt());
        
        return c1;
    }
    
}
