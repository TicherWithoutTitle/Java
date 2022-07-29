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
public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numPags;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPags) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPags() {
        return numPags;
    }
}
