import java.util.Scanner;
public class calculator {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fist Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        System.out.println("Enter Operation:");
        System.out.println("A:Addition");
        System.out.println("S:Subtraction");
        System.out.println("M:Multiplication");
        System.out.println("D:Division");
        System.out.println("R:remainder");
        String operation = sc.next();

        switch(operation) {
            case "A" :
                System.out.println("Addition: "+ (a+b));
                break;
            case "S" :
                System.out.println("Subtraction: "+ (a-b));
                break;
            case "M" :
                System.out.println("Multiplication: "+ (a*b));
                break;
            case "D" :
                System.out.println("Division: "+ (a/b));
                break;
            case "R" :
                System.out.println("remainder: "+ (a%b));
                break;
            default :
                System.out.println("Invalid Operation");
                break;
         

    }
}
}
