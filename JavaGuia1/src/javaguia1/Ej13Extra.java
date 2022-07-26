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
public class Ej13Extra {
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese el nivel de la escalera");
        int n=read.nextInt();
        int m=0,i;
        i=0;
        while(i<=n){
            for(int j=0, k=1;j<m;j++){
                System.out.print(k);
                k++;
            }
            System.out.println("");
            i++;
            m++;
        }
    }
}
