package Model;

public class Stack {
    private int maxSize;
    private int top;
    private long stackArray[];
    
     
    public Stack(int s) {
        stackArray = new long[s];
        maxSize = s; 
        top = -1;
    }

    public void push(long j) {
        if (isFull())
        {
            System.out.println("Overflow");
            System.exit(-1);
        }
 
        stackArray[++top] = j;
        
        
    }
    
    public long pop()  {

        if(isEmpty()){
            System.out.println("Underflow");
            System.exit(-1);
        }
        return stackArray[top--]; 
    }
     
    public long peek() {
        if (!isEmpty()) {
            
            return stackArray[top]; 
        }
        else {
            System.out.println("Pila Vacia");
            System.exit(-1);
        }
        return -1;
        
    }
    
    public boolean isEmpty() {
        return (top == -1); 
    }
     
    public boolean isFull() {
        return (top == maxSize-1); 
    }

    public int size(){
        return maxSize;
    }
}

