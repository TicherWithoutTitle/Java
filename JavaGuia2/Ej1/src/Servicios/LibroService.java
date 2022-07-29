/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LibroService {

    Scanner read = new Scanner(System.in);

    public Libro crearLibro() {
        System.out.println("ISBN:");
        int n = read.nextInt();
        System.out.println("Numero Paginas:");
        int pags = read.nextInt();
        read.nextLine();
        System.out.println("Nombre Autor:");
        String nombre = read.nextLine();
        System.out.println("Titulo:");
        String titulo = read.nextLine();

        Libro nuevoLibro = new Libro(n, titulo, nombre, pags);
        return nuevoLibro;
    }

    public void verLibro(Libro nuevoLibro) {
        System.out.println("ISBN: " + nuevoLibro.getISBN());
        System.out.println("Titulo: " + nuevoLibro.getTitulo());
        System.out.println("Autor: " + nuevoLibro.getAutor());
        System.out.println("Cant. Pags.: " + nuevoLibro.getNumPags());
    }
}
