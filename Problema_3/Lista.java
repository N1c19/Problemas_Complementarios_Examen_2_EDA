/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_3;

/**
 *
 * @author Usuario
 */
public class Lista {
    Nodo head;

    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (head == null) {
            head = nuevo;
        } else {
            Nodo actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void reordenar() {
        if (head == null || head.siguiente == null) return;

        Nodo lento = head, rapido = head;
        while (rapido.siguiente != null && rapido.siguiente.siguiente != null) {
            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;
        }

        Nodo mitad = lento.siguiente;
        lento.siguiente = null;

        Nodo anterior = null;
        Nodo actual = mitad;
        while (actual != null) {
            Nodo siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }

        Nodo primero = head;
        Nodo segundo = anterior;
        while (segundo != null) {
            Nodo temp1 = primero.siguiente;
            Nodo temp2 = segundo.siguiente;

            primero.siguiente = segundo;
            segundo.siguiente = temp1;

            primero = temp1;
            segundo = temp2;
        }
    }

    public void mostrar() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.clave + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}

