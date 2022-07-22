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
public class Ej21 {
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        int[][] matrizGrande = new int[10][10];
        int[][] matrizChica = new int [3][3];
        relleno(matrizGrande,10);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(matrizGrande[i][j]+" |");
            }
            System.out.println("");
        }
        System.out.println("relleno matriz chica");
        relleno2(matrizChica,3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrizChica[i][j]+" |");
            }
            System.out.println("");
        }
        System.out.println("toque una tecla para continuar");
        read.nextLine();
        busca(matrizGrande,10,matrizChica,3);
    }
    public static void relleno(int array[][],int n){
        int i,j;
        
        
        int k;
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                
                k=(int) Math.floor(Math.random()*99+1);
                array[i][j]=k;
            }
        }
            
    }
    public static void busca(int [][]matriz1,int n,int [][]matriz2,int m){
        int i,j,ret=0;
        for(i=0;i<8;i++){
            for(j=0;j<8;j++){
                if(matriz1[i][j]==matriz2[0][0]){
                    System.out.println("se encontró una posible coincidencia en la coordenada "+i+","+j);
                    System.out.println(matriz1[i][j]);
                    System.out.println(matriz2[0][0]);
                    ret=compara(matriz1,i,j,matriz2);
                }
            }
        }
        if (ret==0){
            System.out.println("no se encontró ninguna coincidencia");
        }
    }

    private static int compara(int[][] matriz1, int i, int j, int[][] matriz2) {
        //int k,l,
        int cont;
        cont=0;
        //k=0;
        //l=0;
        //System.out.println(i+" "+j);
        for(int i2=i, k=0;i2<i+3;i2++){
            for(int j2=j, l=0;j2<j+3;j2++) {
//                System.out.println(matriz1[i2][j2]);
//                System.out.println(matriz2[k][l]);
//                System.out.println(i2+" "+j2);
//                System.out.println(k+" "+l);
                if(matriz1[i2][j2]==matriz2[k][l]){
                    cont++;   
                }
                l++;
            }
            k++;
            //System.out.println(cont);
        }
        if(cont==9){
            System.out.println("SE ENCONTRO!!!! en las coordenadas:");
            System.out.println("");
            for(int i3=i;i3<i+3;i3++){
                for(int j3=j;j3<j+3;j3++){
                    System.out.print(i3+","+j3+" | ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("no se encontró en esas coordenadas");
            System.out.println("\n\n");
            //return 1;
        }
        return 1;
    }

    private static void relleno2(int[][] array, int n) {
        int k,i,j;
        Scanner read= new Scanner(System.in);
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.println("escriba el valor de la coordenada "+i+","+j);
                k=read.nextInt();
                array[i][j]=k;
            }
        }
    }
}
