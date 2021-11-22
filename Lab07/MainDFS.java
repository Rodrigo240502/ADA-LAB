package Lab07;

public class MainDFS {
    public static void main(String[] args) {
        Node<Integer> nodo1 = new Node<Integer>(2);
        Node<Integer> nodo2 = new Node<Integer>(3);
        Node<Integer> nodo3 = new Node<Integer>(4);
        Node<Integer> nodo4 = new Node<Integer>(5);
        Node<Integer> nodo5 = new Node<Integer>(6);

        nodo1.setSon(nodo2);
        nodo1.setSon(nodo3);
        nodo2.setSon(nodo4);
        nodo2.setSon(nodo5);

        nodo1.auxIterative();
        System.out.println();
        nodo1.auxRecursive();

    }
}
