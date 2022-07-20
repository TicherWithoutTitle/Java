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
public class Ej20 {
    public static void main(String[] args){
        
        int i,j,sum=0,aux=0,cont=0,aux1=0,aux2=0,aux3=0;
        Scanner read = new Scanner(System.in);
        int n;
        do{
            System.out.println("Escriba un número");
            n = read.nextInt();
            if (n>10 || n<1){
                System.out.println("numnero invalido, intente de vuelta");
            }
        }while(n>10 || n<1);
        
        System.out.println("logro salir "+ n);
        int array[][];
        array = new int[n][n];
        relleno(array,n);
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(array[i][j]+" |");
            }
            System.out.println("");
        }
        for (i=0;i<n;i++){
            sum+=array[0][i];
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                aux+=array[i][j];
                aux1+=array[j][i];
            }
            for(j=0;j<n;j++){
                aux2+=array[j][j];
            }
            for(j=n-1;j>=0;j--){
                aux3+=array[i][j];
            }
            if(aux==sum&&aux1==sum&&aux2==sum&&aux3==sum){
                cont++;
            }
            System.out.println("sumas "+aux+" "+aux1+" "+aux2+" "+aux3);
            aux=0;
            aux1=0;
            aux2=0;
            aux3=0;
        }
        if(cont==n){
            System.out.println("ES MAGICO");
        }else{
            System.out.println("no lo es :( :( :(");  
        }
    }
    
    public static void relleno(int array[][],int n){
        int i,j,k;
        Scanner read= new Scanner(System.in);
        for (i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.println("escriba el valor de la coordenada "+i+" "+j);
                k=read.nextInt();
                while(k<1 ||k>10){
                    System.out.println("Cargue un valor entre 1 y 10 por favor");
                    k=read.nextInt();
                }
                array[i][j]=k;
            }
        }
            
    }
}
