/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;

/**
 *
 * @author Admin
 */
public class ServiceCircunferencia {
    public Circunferencia crearCircunferencia(float r){
        Circunferencia nuevaCir= new Circunferencia(r);
        return nuevaCir;
    }
    public void verCircunferencia(Circunferencia c){
        System.out.println("Radio: "+c.getRadio());
    }
    public void area(Circunferencia c){
        System.out.println("Area: "+(Math.PI*c.getRadio()*c.getRadio()));
    }
    public void perimtetro(Circunferencia c){
        System.out.println("Perimetro: "+(Math.PI*2*c.getRadio()));
    }
    
}
