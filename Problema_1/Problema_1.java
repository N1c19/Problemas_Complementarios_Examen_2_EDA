/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_1;

/**
 *
 * @author Usuario
 */
public class Problema_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(2);
        lista.insertarFinal(4);
        lista.insertarFinal(5);
        lista.insertarFinal(6);
        lista.insertarFinal(7);
        lista.insertarFinal(8);

        System.out.println("Lista original:");
        lista.mostrar();

        int k = 4;
        lista.invertirEnGrupos(k);

        System.out.println("Lista invertida en grupos de " + k + ":");
        lista.mostrar();
    }
    
}
