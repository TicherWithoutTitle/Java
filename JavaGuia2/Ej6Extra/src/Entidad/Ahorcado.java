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
public class Ahorcado {
    private int cantLetrasEncontradas;
    private int maxJugadas;
    private String[] palabra;
    private int longitud;

    public Ahorcado(int maxJugadas, String palabra) {
        this.cantLetrasEncontradas = 0;
        this.maxJugadas = maxJugadas;
        this.palabra = new String [palabra.length()];
        this.longitud = palabra.length();
        for (int i = 0; i < palabra.length(); i++) {
            this.palabra[i]=palabra.substring(i, i+1);
        }
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public int getMaxJugadas() {
        return maxJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public Ahorcado() {
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public void setMaxJugadas(int maxJugadas) {
        this.maxJugadas = maxJugadas;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLongitud() {
        return longitud;
    }
    
    public boolean buscar(String letra){
        boolean rtr=false;
        for (int i = 0; i < longitud; i++) {
            if(letra.equals(palabra[i])){
                rtr=true;
                cantLetrasEncontradas++;
                palabra[i]=null;
            }
        }
        return rtr;
    }
}
