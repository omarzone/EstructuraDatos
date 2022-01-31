package Test;

import Model.Stack;

public class MainTest {
    public static void main(String args[]){
        Stack stackPrueba = new Stack(4);


        stackPrueba.push(20);
        stackPrueba.push(20);
        stackPrueba.push(20);
        stackPrueba.pop();
        stackPrueba.pop();
        stackPrueba.pop();
        stackPrueba.pop();

        System.out.println(stackPrueba.peek());

    }
}
