package myStack;

public class MainApp {

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);

        stack.printStack();
    }
}
