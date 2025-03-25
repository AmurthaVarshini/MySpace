import java.util.Vector;

public class VectorExample 
{
    public static void main(String[] args) 
    {
      
        Vector<Integer> v = new Vector<>(3, 2);
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.insertElementAt(0, 1);
        v.removeElementAt(2);
        for (int i : v) {
            System.out.println(i);
        }
    }
