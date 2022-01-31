
 class MainTest{

    
public static void main(String[] args) {
    Queue cola = new Queue(4);

    cola.insert(2);
    cola.insert(4);
    cola.insert(6);
    cola.printQueque();
    cola.remove();

    System.out.println( "Size:  " + cola.size());
    System.out.println( "Frente:  " + cola.peekFront());

    
    
}
}