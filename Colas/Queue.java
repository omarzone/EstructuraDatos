public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public Queue(int s) {
        maxSize = s+1;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(long j) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = j;
       // System.out.println(j);
    }

    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        //nItems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (rear+1==front || (front+maxSize-1==rear));
    }

    public boolean isFull() {
        return ( rear+2==front || (front+maxSize-2==rear));
    }

    public int size() {
        if(rear >= front) 
            return rear-front+1;
        else
            return (maxSize-front) + (rear+1);
    }

    public void printQueque(){
        int i;
        
        if(isEmpty()){
            System.out.println("La cola no tiene elementos");
        }else{
            for(i= front;i<rear+1;i++){
                long aux = queArray[i];
                System.out.println("Elemento: " + aux);
                
            }
        }
    }
}