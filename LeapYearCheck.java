import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(year + " is " + ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "" : "not ") + "a leap year.");
        sc.close();
    }
}
