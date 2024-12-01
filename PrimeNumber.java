import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean flag = false;

        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num ==1 || num == 0)
        {
            System.out.println(num +" is Non Prime Number");
        }
        else{
            int middlenum =  num / 2;
            for(int i= 2;i <=middlenum;i++)
            {
                if(num %i==0)
                {
                 System.out.println(num +" is Non Prime Number");
                 flag = true;
                 break;
                }
            }
            if(flag != true)
            System.out.println(num +" is Prime Number");
        }
    }
}
