/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pregunta3;

/**
 *
 * @author JERICKO
 */
public class Pregunta3 {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);
        lista.insertarFinal(5);

        System.out.println("Antes de reordenar:");
        lista.mostrar();

        lista.reordenarBasico();

        System.out.println("Después de reordenar:");
        lista.mostrar();
    
        
    }
}
