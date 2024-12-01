import java.util.Scanner;

public class PrintMonth{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter Month Number:");
        int Monthnum=  sc.nextInt();
        

        switch (Monthnum) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febarury");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Sepetember");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("Novemeber");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
    }
}