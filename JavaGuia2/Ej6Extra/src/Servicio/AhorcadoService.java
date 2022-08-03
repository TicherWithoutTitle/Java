/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AhorcadoService {
    Scanner read=new Scanner(System.in);
    private String[] log=new String[26];
    private int k=0;
    public void juego(){
        //boolean jugar =false;
        
        Ahorcado x = crearJuego();
        do{
            k++;
            System.out.println("=======================================================");
            encontradas(x);
            System.out.println("Numero de letras (encontradas,faltantes): " + "(" + x.getCantLetrasEncontradas() + "," + (longitud(x) - x.getCantLetrasEncontradas()) + ")");
            intentos(x);
            System.out.println("=======================================================");
            
        }while (x.getCantLetrasEncontradas()<x.getLongitud()&&x.getMaxJugadas() >0);
    }
    public Ahorcado crearJuego(){
        System.out.println("escriba la palabra a adivinar");
        String palabra=read.next();
        System.out.println("indique la cantidad de jugadas maximas");
        int n= read.nextInt();
        Ahorcado x=new Ahorcado(n,palabra);
        return x;
    }
    public int longitud(Ahorcado x){
        return x.getPalabra().length;
    }
    public boolean buscar(Ahorcado x,String letra){
        
        
        return x.buscar(letra);
    }
    public void encontradas(Ahorcado x){
        System.out.println("ingrese una letra");
        String letra=read.next();
        boolean seEncuentraEnLog=false;
        for (int i = 0; i < 26; i++) {
            if(letra.equals(log[i])){
                seEncuentraEnLog=true;
            }
        }
        if(!seEncuentraEnLog){
            log[k]=letra;
            if (buscar(x, letra)) {
                System.out.println("longitud de la palabra: " + longitud(x));
                System.out.println("La letra pertenece a la palabra");
            } else {
                System.out.println("longitud de la palabra: " + longitud(x));
                System.out.println("La letra no pertenece a la palabra");
                x.setMaxJugadas(x.getMaxJugadas() - 1);
            }
        }else{
            System.out.println("Letra "+letra+" ya usada");
        }
    }
    public void intentos(Ahorcado x){
        System.out.println("numero de oportunidades restantes: "+x.getMaxJugadas());
    }
}
