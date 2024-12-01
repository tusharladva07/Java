import java.util.Scanner;

public class MultiplicationTable  {
    public static void Printtable(int num,int multi)
    {
        if(multi > 10)
        {
            return;
        }
        System.out.println(num +" * "+ multi +" = "+(num * multi));
        Printtable(num,multi+1);
    }
    public static void main(String[] args)
    {
       
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        Printtable(number,1);
        sc.close();

    }
}
