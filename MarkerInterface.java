interface Serializable {
      // Marker Interface
}

// Define Person class that implements
// the marker interface
class Person implements Serializable {
    public Person() {
        System.out.println("Person object created");
    }
}

// Define Animal class does not
// implement marker interface
class Animal {
    public Animal() {
        System.out.println("Animal object created");
    }
}

public class MarkerInterface
{
    public static void main(String[] args) 
    {
        Person person = new Person();
        Animal animal = new Animal();

        if (person instanceof Serializable)
            System.out.println("Person is serializable");
        else 
            System.out.println("Person is not serializable");
       

        if (animal instanceof Serializable)
            System.out.println("Animal is serializable");
        else
            System.out.println("Animal is not serializable");

    }
}
