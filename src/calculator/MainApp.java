package calculator;

import java.util.Stack;

public class MainApp {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();
        String str = "4+2-3*9+5-3/3";
        MainApp app = new MainApp();
        app.countAndAddValuesToStack(str, integerStack);
        System.out.println(app.countAndPrintResult(integerStack));
    }

    private void countAndAddValuesToStack(String str,Stack<Integer> integerStack) {

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (!isOperation(tmp)) {
                integerStack.push((int) tmp - 48);
            } else if (tmp == '*') {
                int nextValue = (int) str.charAt(i + 1) - 48;
                int prevValue = integerStack.pop();
                int newValue = prevValue * nextValue;
                integerStack.push(newValue);
                i++;
            } else if (tmp == '/') {
                int nextValue = (int) str.charAt(i + 1) - 48;
                int prevValue = integerStack.pop();
                int newValue = prevValue / nextValue;
                integerStack.push(newValue);
                i++;
            }else if (tmp == '-') {
                int nextValue = (int) str.charAt(i + 1) - 48;
                integerStack.push(nextValue*-1);
                i++;
            }
        }
    }

    public boolean isOperation(char tmp) {
        return tmp == '+' || tmp == '-' || tmp == '*' || tmp == '/';
    }

    private int countAndPrintResult(Stack<Integer> integerStack){
        int result=0;
        while(!integerStack.empty()){
            result+=integerStack.pop();
        }
        return result;
    }
}
