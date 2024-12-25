import java.util.Scanner;
class StudentGPA {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();
	        double[] grades = new double[numSubjects];
	        double total = 0;
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter grade for subject " + (i + 1) + ": ");
	            grades[i] = scanner.nextDouble();
	            total += grades[i];
	        }
	        double average = total / numSubjects;

	        // Determine the letter grade
	        char letterGrade;
	        if (average >= 90) {
	            letterGrade = 'A';
	        } else if (average >= 80) {
	            letterGrade = 'B';
	        } else if (average >= 70) {
	            letterGrade = 'C';
	        } else if (average >= 60) {
	            letterGrade = 'D';
	        } else {
	            letterGrade = 'F';
	        }
	        double gpa;
	        if (average >= 90) {
	            gpa = 10.0;
	        } else if (average >= 80) {
	            gpa = 8.0;
	        } else if (average >= 70) {
	            gpa = 6.0;
	        } else if (average >= 60) {
	            gpa = 4.0;
	        } else {
	            gpa = 0.0;
	        }

	        System.out.println("\n--- Grade Summary ---");
	        System.out.println("Average Grade: " + average);
	        System.out.println("Letter Grade: " + letterGrade);
	        System.out.println("GPA: " + gpa);
	        scanner.close();
	    }
	}
