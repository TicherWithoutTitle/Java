/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import Entidad.Libro;
import Servicios.LibroService;

/**
 *
 * @author Admin
 */
public class Ej1 {

    public static void main(String[] args) {
        LibroService ServLib= new LibroService();
        Libro libro1= ServLib.crearLibro();
        ServLib.verLibro(libro1);
    }
    
}
