/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Admin
 */
public class Cadena {
    private final String frase;
    private final int longitud;

    public Cadena(String phrase) {
        this.frase = phrase;
        this.longitud=phrase.length();
    }
    public int mostraVocales(){
        int cont=0;
        for (int i = 0; i < longitud; i++) {
        switch(frase.substring(i, i+1)){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                cont++;
                break;
            }
        }
        return cont;
    }
    public String invertirFrase(){
        String nuevaFrase="";
        for (int i = longitud; i > 0; i--) {
            nuevaFrase+=frase.substring(i-1, i);
        }
        return nuevaFrase;
    }
    public int vecesRepetido(String letra){
        int cont=0;
        for (int i = 0; i < longitud; i++) {
            if(letra.equals(frase.substring(i, i+1))){
                cont++;
            }
        }
        return cont;
    }
    public int compararLongitud(String frase){
        int rtr=2;
        if (frase.length()==longitud){
            rtr=0;
        }else if(frase.length()<longitud){
            rtr=1;
        }
        return rtr;
    }
    public String unirFrases(String frase){
        return this.frase+" "+frase;
    }
    public String reemplazar(String letra){
        String nuevaFrase="";
        for (int i = 0; i < longitud; i++) {
            if("a".equals(frase.substring(i, i+1))){
                nuevaFrase+=letra;
            }else{
                nuevaFrase+=frase.substring(i, i+1);
            }
        }
        return nuevaFrase;
    }
    public boolean contiene(String letra){
        boolean rtr=false;
        for (int i = 0; i < longitud; i++) {
            if(letra.equals(frase.substring(i, i+1))){
                rtr=true;
                break;
            }
        }
        return rtr;
    }
}
