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
public class Ej24Extra {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("indique la cantidad de veces que quiere q se repita ");
        int n=read.nextInt();
        long vector[]=new long [n];
        System.out.println("Fibonacci serie: ");
        for(int i=0;i<n;i++){
            if(i>1){
                vector[i]=vector[i-1]+vector[i-2];
            }else{
                vector[i]=1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(vector[i]+", ");
        }        
        System.out.println("");
        System.out.println("Vector: ");
        for(int i=0;i<n;i++){
            System.out.print("|posicion "+i+": "+vector[i]+"| ");
        }
    }
}
