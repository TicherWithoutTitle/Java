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
public class Ej17Extra {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Escriba un numero");
        float n=read.nextFloat();
        //esPrimo(n);
        if (esPrimo(n)){
            System.out.println("ES PRIMO VAMOOOOOOOOOOOOOOOOS");
        }else{
            System.out.println("No lo es :(");
        }
    }

    public static boolean esPrimo(float n) {
        int cont=0;
        for(int i=1;i<=n;i++){
            //System.out.println(n/i);
            if(n%i==0){
                cont++;
            }
        }
        return cont==2;
    }
}
