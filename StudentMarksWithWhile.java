import java.util.Scanner;

public class StudentMarksWithWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        
        do{
            System.out.print("Enter 1 to input marks or 0 to stop: ");
            num = scanner.nextInt(); 
            if (num == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = scanner.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks! Please enter a number between 0 and 100.");
                }
            } else {
                System.out.println("Invalid number! Enter 1 to continue or 0 to stop.");
            }
        }while (num != 0);
    }
}
