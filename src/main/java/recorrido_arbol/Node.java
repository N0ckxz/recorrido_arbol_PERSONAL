package recorrido_arbol;

import java.util.LinkedList;
import java.util.List; // Importamos List ya que lo tenemos mencionado en el atributo "List<Node>"
    
public class Node<T> {
    private T data = null;
    private List<Node<T>> children; // Para el arreglo dinámico

    Node() { //Constructor por defecto 
        this.children = new LinkedList<>();
    }  
    
    Node(T data) { //Constructor principal
        this.data = data;
        this.children = new LinkedList<>(); //Inicializamos la lista
    }

    void addChild(Node<T> node) {
        this.children.add(node);
    }

    void printTree() {
        System.out.print(this.data + " ");
        
        for(int i = 0; i < children.size(); i++) {
            children.get(i).printTree(); // Recursion para que el metodo se ejecute por cada hijo del arbol
        }
    }

    Node<T> search(T searchValue) {

        if(this.data.equals(searchValue)) { //Si el dato del nodo actual es el mismo que el dato ingresado, verdadero
            return this;
        } 

        // Buscamos en los hijos
        for (int i = 0; i <children.size(); i++) {
            //Con ayuda de Gemini
            Node<T> findInChild = children.get(i).search(searchValue);
            // Si se encuentra dentro de un hijo, mandamos el true hacia arriba
            if (findInChild != null) { // ERROR CORREGIDO: En Java debemos comparar contra null
                return findInChild; // ERROR CORREGIDO: Debes retornar 'findInChild', 'node' no existía aquí
            }
        }
        // No se encontro en ningun hijo
        return null;
    }
}