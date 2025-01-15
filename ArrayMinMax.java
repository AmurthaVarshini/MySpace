import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

      
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0], max = array[0];

        // Find min and max in the array
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

      
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);

        scanner.close();
    }
