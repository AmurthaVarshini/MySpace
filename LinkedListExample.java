import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
       
        LinkedList<String> fruits = new LinkedList<>();

      
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial LinkedList: " + fruits);

        
        fruits.addFirst("Mango");

      
        fruits.addLast("Orange");
        System.out.println("After adding Mango and Orange: " + fruits);

        
        fruits.remove("Banana"); 
        fruits.removeFirst();    
        fruits.removeLast();     
        System.out.println("After removals: " + fruits);

      
        String firstFruit = fruits.getFirst(); 
        String lastFruit = fruits.getLast();   
        System.out.println("First fruit: " + firstFruit);
        System.out.println("Last fruit: " + lastFruit);

      
        System.out.println("Iterating through the LinkedList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        
        fruits.clear();
        System.out.println("LinkedList after clearing: " + fruits);
    }
}
