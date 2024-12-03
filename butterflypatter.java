public class butterflypatter {
    public static void main(String[] args)
    {
        int n=4;
        //Butterfly Pattern
        //upperpart
        for(int i = 1;i<=n;i++)
        {
            //upper left
            for(int j = 1;j<=i;j++)
            {
            System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            //uppser right
            for(int j = 1;j<=i;j++)
            {
            System.out.print("*");
            }
            System.out.println();
        }   
        for(int i = n;i>=1;i--)
        {
            for(int j = 1;j<=i;j++)
            {
            System.out.print("*");
            }

            int spaces = 2 * (n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
            System.out.print("*");
            }
            System.out.println();
        }

        //Solid Rhombus
        //spaces
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Number Pyramid
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println(i);
        }
        //Palindrom Pattern
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
