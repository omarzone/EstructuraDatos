package Test;

import java.util.Stack;

public class StackJavaTest {
    public static void main(String args[]){
        Stack<Integer> prueba = new Stack<Integer>();
        prueba.push(4);
        prueba.push(5);
        prueba.push(8);
        prueba.push(6);
        prueba.pop();

        System.out.println(prueba.peek());
        
    }
}
