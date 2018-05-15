package ex6;

public class Numbers {
    public static void main(String args[]) {
        Node node1 = new Node("One");

        Node node2 = new Node("Two");

        Node node3 = new Node("Three");

        Node node4 = new Node("Four");

        node4.setNext(node3);
        node3.setNext(node2);
        node2.setNext(node1);
        node1.setNext(null);

        for (Node n = node4; n != null; n = n.getNext()) {
            System.out.println(n);
        }

    }
}
/*public static void main(String args[]) {
        Node n1 = new Node("Line");
        n1.setNext(null);

        Node n2 = new Node("Rectangle");
        n2.setNext(n1);

        Node n3 = new Node("Circle");
        n3.setNext(n2);

        for (Node n = n3; n != null; n = n.getNext()) {
            System.out.println(n);
        }
    }*/
