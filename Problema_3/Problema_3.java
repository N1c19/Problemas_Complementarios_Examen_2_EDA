/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_3;

/**
 *
 * @author Usuario
 */
public class Problema_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);
        lista.insertarFinal(5);

        lista.reordenar();
        lista.mostrar();
    }
    
    
}
