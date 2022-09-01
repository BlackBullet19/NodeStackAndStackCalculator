package myStack;

public class MyStack {

    private Node first = null;

    public void push(int value) {

        Node node = new Node(value);
        if (first == null) {
            first = node;
        } else {
            Node temp = first;
            first = node;
            first.next = temp;
        }
    }

    public int peek() {
        if (first == null) {
            throw new IllegalArgumentException();
        }
        return first.value;
    }

    public int pop() {
        if (first == null) {
            throw new IllegalArgumentException();
        }
        int firstValue = first.value;
        first = first.next;
        return firstValue;
    }

    public boolean empty(){
        return first==null;
    }

    public void printStack(){

        if (first == null) {
            System.out.println("List is empty");
        } else {
            while (first != null) {
                System.out.print(first.value + " ");
                first = first.next;
            }
            System.out.println();
        }
    }
}
