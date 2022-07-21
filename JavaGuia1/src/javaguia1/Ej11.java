/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ej11 {
    //Scanner read= new Scanner(System.in);
    public static  void main (String[] args){
        Scanner read= new Scanner(System.in);
        System.out.println("Escriba el primer valor");
        float n1=read.nextInt();
        System.out.println("Escriba el segundo valor");
        float n2=read.nextInt();
        
        boolean menu=true;
        while (menu){
            System.out.println("MENU:");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR\n3. MULTIPLICAR\n4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("Elija una opción");
            int opcion=read.nextInt();
            switch (opcion){
                case 1:
                    suma(n1,n2);
                    break;
                case 2:
                    resta(n1,n2);
                    break;
                case 3:
                    multi(n1,n2);
                    break;
                case 4:
                    div(n1,n2);
                    break;
                case 5:
                    //salir(menu);
                    menu=salir();
                    break;
                default:
                    System.out.println("Intente de nuevo");
                    break;
            }
        }
    }
    public static void suma(float n1,float n2){
        System.out.println("la suma es: "+(n1+n2));
    }
    public static void resta(float n1,float n2){
        System.out.println("la resta es: "+(n1-n2));
    }
    public static void multi(float n1,float n2){
        System.out.println("la multiplicacion es: "+(n1*n2));
    }
    public static void div(float n1,float n2){
        float n3=n1/n2;
        System.out.println("la divison es: "+(n3));
    }
    public static boolean salir(){
        System.out.println("Desea salir? S/N");
        Scanner read=new Scanner(System.in);
        String sino=read.next();
        return !"S".equals(sino);
    }   
    
}
