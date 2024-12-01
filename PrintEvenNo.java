import java.util.Scanner;

public class PrintEvenNo
{
     public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Even Numbers");
        for(int i=0; i <= n;i+=2)
        {
            System.out.println(i);
        }
        
     }
}