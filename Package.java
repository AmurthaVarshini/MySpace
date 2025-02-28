
import java.util.Vector;

public class Package {
  
    public Package() {
      
        // java.util.Vector is imported, hence we are
        // able to access it directly in our code.
        Vector v = new Vector();

        // java.util.ArrayList is not imported, hence
       
        java.util.ArrayList l = new java.util.ArrayList();
    }

    public static void main(String[] args) {
      
        // Creating an instance of Geeks 
        // class to invoke the constructor
        new Package();
    }
}
