package recorrido_arbol;

public class Main {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);

        Node<Integer> n4 = new Node<>(5);
        Node<Integer> n5 = new Node<>(6);

        Node<Integer> n6 = new Node<>(7);
    
        root.addChild(n1);
        root.addChild(n2);
        root.addChild(n3);

        n1.addChild(n4);
        n1.addChild(n5);

        n3.addChild(n6);

        root.printTree();

        root.search(6);
    }
}