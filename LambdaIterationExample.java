import java.util.Arrays;
import java.util.List;

public class LambdaIterationExample{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        
        names.forEach(name -> System.out.println(name));
    }
}
