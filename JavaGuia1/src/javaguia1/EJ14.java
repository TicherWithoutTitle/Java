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
public class EJ14 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Indique el valor en Euros");
        int moneda = read.nextInt();
        System.out.println("indique a que moneda quiere convertir\n1 para libras\n2 para dolares\n3 para yenes");
        int monedaAConvertir = read.nextInt();
        convertirMoneda(moneda,monedaAConvertir);
    }

    public static void convertirMoneda(int cant, int moneda) {
        switch (moneda) {
            case 1:
                System.out.println(cant + " euros son "+cant*0.86+" libras");
                //break;
            case 2:
                System.out.println(cant + " euros son "+cant*1.28611+" dolares");
                //break;
            case 3:
                System.out.println(cant + " euros son "+cant*129.852+" yenes");
                break;
            default:
                System.out.println("opcion incorrecta");
        }
               
    }
}
