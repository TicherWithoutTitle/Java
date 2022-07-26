/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1;

import java.util.Scanner;
//import static javaguia1.Ej20.relleno;

/**
 *
 * @author Admin
 */
public class Ej23Extra {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        String sopa[][]=new String[20][20];
        relleno(sopa,20);
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                if(sopa[i][j]==null){
                    sopa[i][j]=String.valueOf((int)(Math.random()*10));
                }
            }
        }
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                System.out.print(sopa[i][j]+" |");
            }
            System.out.println("");
        }
    }
    
    
    
    public static void relleno(String array[][],int n){
        int i,j,k=0;
        Scanner read= new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase;
        i=(int) Math.floor(Math.random()*4);
        j=(int) Math.floor(Math.random()*14+1);
        frase=read.nextLine();
        System.out.println("primero: "+i);
        if(frase.length()<=5&&frase.length()>=3){
            for(int l=0;l<frase.length();l++,j++,k++){
                System.out.println(k+" "+j);
                array[i][j]=frase.substring(k, k+1);
                //k++;
            }
        }
        i=(int) Math.floor(5+Math.random()*4);
        j=(int) Math.floor(Math.random()*14+1);
        System.out.println("Escriba una frase");
        frase=read.nextLine();
        System.out.println("segundo: "+i);
        if(frase.length()<=5&&frase.length()>=3){
            k=0;
            for(int l=0;l<frase.length();l++,j++,k++){
                System.out.println(k+" "+j);
                array[i][j]=frase.substring(k, k+1);
                //k++;
            }
        }
        i=(int) Math.floor(10+Math.random()*4);
        j=(int) Math.floor(Math.random()*14+1);
        System.out.println("Escriba una frase");
        frase=read.nextLine();
        System.out.println("tercero: "+i);
        if(frase.length()<=5&&frase.length()>=3){
            k=0;
            for(int l=0;l<frase.length();l++,j++,k++){
                System.out.println(k+" "+j);
                array[i][j]=frase.substring(k, k+1);
                //k++;
            }
        }
        i=(int) Math.floor(15+Math.random()*(18-15));
        j=(int) Math.floor(Math.random()*14+1);
        System.out.println("Escriba una frase");
        frase=read.nextLine();
        System.out.println("cuarto: "+i);
        if(frase.length()<=5&&frase.length()>=3){
            k=0;
            for(int l=0;l<frase.length();l++,j++,k++){
                System.out.println(k+" "+j);
                array[i][j]=frase.substring(k, k+1);
                //k++;
            }
        }
        i=(int) Math.floor(18+Math.random()*(19-18));
        j=(int) Math.floor(Math.random()*14+1);
        System.out.println("Escriba una frase");
        frase=read.nextLine();
        System.out.println("quinto: "+i);
        if(frase.length()<=5&&frase.length()>=3){
            k=0;
            for(int l=0;l<frase.length();l++,j++,k++){
                System.out.println(k+" "+j);
                array[i][j]=frase.substring(k, k+1);
                //k++;
            }
        }
    }
}
