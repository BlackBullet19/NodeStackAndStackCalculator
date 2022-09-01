package myStack;

public class Node {

    public int value;
    public Node next;
    public Node previous;

    protected Node(int value) {
        this.value = value;
        this.next = null;
        this.previous=null;
    }
}
