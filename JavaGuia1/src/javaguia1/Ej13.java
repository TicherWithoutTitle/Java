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
public class Ej13 {
    public static void main(String[] args){
        int n;
        Scanner read = new Scanner(System.in);
        n=read.nextInt();
        //int array[][]=new int [n][n] ;
        
        for (int i=0; i<n;i++){
            for (int j=0; j<n;j++){
                if(i==0||j==0||j==n-1||i==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
            
        

        
        
    
    }
}
