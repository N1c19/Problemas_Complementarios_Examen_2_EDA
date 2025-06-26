/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_1;

/**
 *
 * @author Usuario
 */
public class Lista {
    Nodo head;
    int size;

    public Lista() {
        head = null;
        size = 0;
    }

    public boolean estaVacia() {
        return head == null;
    }

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
        size++;
    }

    public void mostrar() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.clave + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void invertirEnGrupos(int k) {
        head = invertirGrupo(head, k);
    }

    Nodo invertirGrupo(Nodo cabeza, int k) {
        Nodo actual = cabeza;
        Nodo anterior = null;
        Nodo siguiente = null;
        int contador = 0;

        Nodo temp = cabeza;
        int total = 0;
        while (temp != null && total < k) {
            temp = temp.siguiente;
            total++;
        }

        while (contador < total && actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
            contador++;
        }

        if (siguiente != null) {
            cabeza.siguiente = invertirGrupo(siguiente, k);
        }

        return anterior;
    }
}


