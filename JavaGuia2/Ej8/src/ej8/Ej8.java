/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("escriba una frase");
        String frase=read.nextLine();
        Cadena c1=new Cadena(frase);
        System.out.println("Vocales: "+c1.mostraVocales());
        System.out.println(c1.invertirFrase());
        System.out.println("escriba una letra para saber cuantas veces se repite");
        String letra=read.next();
        System.out.println("veces repetida la letra "+letra+": "+c1.vecesRepetido(letra));
        System.out.println("escriba una frase para comparar la longitud");
        read.nextLine();
        frase=read.nextLine();
        switch(c1.compararLongitud(frase)){
            case 0:
                System.out.println("misma longitud");
                break;
            case 1:
                System.out.println("mas corta");
                break;
            case 2:
                System.out.println("mas larga");
                break;
        }
        System.out.println("escriba una frase para unirla a la frase original");
        frase=read.nextLine();
        System.out.println("frase nueva: "+c1.unirFrases(frase));
        System.out.println("indique un caracter para reemplazar por las letras a");
        letra=read.next();
        System.out.println("nueva frase: "+c1.reemplazar(letra));
        System.out.println("indique una letra para buscarla");
        letra=read.next();
        if(c1.contiene(letra)){
            System.out.println("si se encuentra");
        }else{
            System.out.println("no se encontró");
        }
    }
}
