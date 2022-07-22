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
public class Ej17 {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("escriba la dimension del vector");
        int n=read.nextInt();
        int vector[],i;
        vector = new int [n];
        relleno(vector,n);
        compara(vector,n);
    }
    
    public static void relleno(int array[],int n){
        int i,k;
        Scanner read= new Scanner(System.in);
        for (i=0;i<n;i++){
            
            System.out.println("escriba el valor de la coordenada "+i);
            k=read.nextInt();
                
            array[i]=k;
        }    
    }
    
    public static void compara(int vector[],int n){
        int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        for (int i=0;i<n;i++){
            if(vector[i]>0&&vector[i]<10){
                cont1++;
            }else if(vector[i]>=10&&vector[i]<100){
                cont2++;
            }else if(vector[i]>=100&&vector[i]<1000){
                cont3++;
            }else if(vector[i]>=1000&&vector[i]<10000){
                cont4++;
            }else if(vector[i]>=10000&&vector[i]<100000){
                cont5++;
            }
        }
        System.out.println("cantidad de numeros de una cifra: "+cont1);
        System.out.println("cantidad de numeros de dos cifras: "+cont2);
        System.out.println("cantidad de numeros de tres  cifras: "+cont3);
        System.out.println("cantidad de numeros de cuatro cifras: "+cont4);
        System.out.println("cantidad de numeros de cinco cifras: "+cont5);
    }
}
