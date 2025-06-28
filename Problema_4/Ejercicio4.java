/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author sebas
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista_Simple XD = new Lista_Simple();
        XD.InsertarElemento(1);
        XD.InsertarElemento(2);
        XD.InsertarElemento(3);
        XD.InsertarElemento(4);
        XD.InsertarElemento(5);
        XD.InsertarElemento(6);
        XD.InsertarElemento(7);
        XD.InsertarElemento(8);
        XD.InvertirSublista(XD, 3, 6);
        XD.ImprimirLista();
    }
    
}
