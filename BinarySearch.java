import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        char[] charArr = {'a', 'c', 'e', 'g'};
        
        int key = 5;
        char charKey = 'e';

        System.out.println(Arrays.binarySearch(arr, key) >= 0 ? "Found" : "Not Found");
        System.out.println(Arrays.binarySearch(charArr, charKey) >= 0 ? "Found" : "Not Found");
    }
}
