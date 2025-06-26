/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_2;

/**
 *
 * @author Usuario
 */
public class Problema_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista lista1 = new Lista();
        lista1.insertarFinal(7);
        lista1.insertarFinal(1);
        lista1.insertarFinal(0);

        Lista lista2 = new Lista();
        lista2.insertarFinal(6);
        lista2.insertarFinal(3);

        Nodo resultado = lista1.restarListas(lista1.head, lista2.head);
        lista1.mostrar(resultado);
        
    }
    
}
