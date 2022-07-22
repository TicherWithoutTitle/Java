/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Admin
 */
public class Ej12 {
    public static void main(String[] args){
        Scanner read= new Scanner(System.in); 
        String cadena,x,o;
        int cont1=0,cont2=0, cont=0;
        do {
            System.out.println("Dispositivo RS232\nInserte cadena de un maximo de 5 caracteres");
            cadena=read.next();
            cont++;
            cadena=toUpperCase(cadena);
            System.out.println("cadena: "+cadena);
            if(cadena.length()==5){
                if(("X".equals(cadena.substring(0,1)))&&("O".equals(cadena.substring(4,5)))){
                        cont1++;
                }else{
                    cont2++;
                }
            }else{
                cont2++;
            }
        } while (!"&&&&&".equals(cadena));
        System.out.println("INFORME:\nCadenas Escritas: "+ (cont-1)+"\nCadenas correctas: "+ cont1+"\nCadenas Incorrectas: "+(cont2-1));
    }
}
