// Base class Person
class Person {
  
    // Method that displays the 
    // role of a person
    void role() {
        System.out.println("I am a person.");
    }
}

// Derived class Father that 
// overrides the role method
class Father extends Person {
  
    // Overridden method to show 
    // the role of a father
    @Override
    void role() {
        System.out.println("I am a father.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
      
        // Creating a reference of type Person 
        // but initializing it with Father class object
        Person p = new Father();
        
        // Calling the role method. It calls the 
        // overridden version in Father class
        p.role();  
    }
}
