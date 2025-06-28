/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author sebas
 */
public class Lista_Simple {
    private Nodo head;
    private int size;

    public Lista_Simple() {
        this.head = null;
        this.size = 0;
    }
    
    public void InsertarElemento(int clave) {
        Nodo temp = new Nodo(clave);
        if (head == null){
            head = temp;
        }
        else{
            Nodo last = head;
            while (last.siguiente != null){
                last = last.siguiente;
            }
            last.siguiente = temp;
        }
        size++;
    }
          
    public void Reverse() {
        Nodo anterior = null;
        Nodo actual = head;
        Nodo siguiente;
        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        head = anterior;
    }
    
    public void InvertirSublista(Lista_Simple lista1, int primero, int último){
        if (primero < 1 || primero >= último || último >= size) {
            return;
        }
        Lista_Simple aux = new Lista_Simple();
        Nodo it = head;
        for (int i = 1; i < primero; i++) {
            it = it.siguiente;
        }
        Nodo NodoAux = null;
        for (int i = primero; i <= último; i++) {
            Nodo nuevo = new Nodo(it.clave);
            if (aux.head == null) {
                aux.head = nuevo;
            }
            else {
                NodoAux.siguiente = nuevo;
            }
            NodoAux = nuevo;
            it = it.siguiente;
        }
        aux.Reverse();
        it = aux.head;
        while(it.siguiente != null){
            it = it.siguiente;
        }
        
        Nodo it1 = head;
        for (int i = 1; i <= último; i++) {
            it1 = it1.siguiente;
        }
        it.siguiente = it1;
        if (primero == 1){
            head = aux.head;
        }
        else{
            it = head;
            for (int i = 1; i < primero - 1; i++) {
                it = it.siguiente;
            }
            it.siguiente = aux.head;
        }
        
    } 
        public void ImprimirLista(){
        Nodo temp = head;
        while (temp != null){
            System.out.print(temp.clave + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}
