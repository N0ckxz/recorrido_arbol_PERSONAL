package recorrido_arbol;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);

        Node n4 = new Node(5);
        Node n5 = new Node(6);

        Node n6 = new Node(7);
    
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