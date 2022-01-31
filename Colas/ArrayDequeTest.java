import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {
    public static void main(String[] args)
    {
        // Creating and initializing deque
        // Declaring object of integer type
        Deque<Integer> cola = new ArrayDeque<Integer>(10);
 
        // Operations 1
        // add() method
 
        // Adding custom elements
        // using add() method to insert
        cola.add(10);
        cola.add(20);
        cola.add(30);
        cola.add(40);
        cola.add(50);


        cola.addFirst(2);
        cola.add(60);
        cola.addLast(1000);
 
        // Iterating using for each loop
        for (Integer element : cola) {
            // Print the corresponding element
            System.out.println("Elemento : " + element);
        }

        cola.clear();
        System.out.println(cola.size());

    }
}