public class patternprogram {
    public static void main(String[] args) {
        int n= 5;
       // int m= 5;

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=m;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //pattern2
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=m;j++) //2 
        //     {
        //         if(i==1 || j==1|| j==m || i==n)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");    
        //         }
        //     }
        //     System.out.println();
        // }

        // //pattern 3
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++) //2 
        //     {
        //       System.out.print("*");
        //     }
        //     System.out.println();
        // }

          //pattern 4
        //   for(int i=n;i>=1;i--)
        //   {
        //       for(int j=1;j<=i;j++) 
        //       {
        //         System.out.print("*");
        //      }
        //       System.out.println();
        //   }
        // //pattern 5
        // for(int i=1;i<=n;i++)
        //   {
        //     for(int k=1;k<=n-i;k++)
        //     {
        //         System.out.print(" ");
        //     }
        //       for(int j=1;j<=i;j++) 
        //       {
        //         System.out.print("*");
        //      }
        //       System.out.println();
        //   }



          for(int i=n;i>=1;i--)
          {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
              for(int j=1;j<=i;j++) 
              {
                System.out.print("*");
             }
              System.out.println();
          }

         //pattern 5
        //  for(int i=1;i<=n;i++)
        //  {
        //      for(int j=1;j<=i;j++) 
        //      {
        //        System.out.print(j + " ");
        //     }
        //      System.out.println();
        //  }

          //pattern 6
        //   for(int i=n;i>=1;i--)
        //   {
        //       for(int j=1;j<=i;j++) 
        //       {
        //         System.out.print(j + " ");
        //      }
        //       System.out.println();
        //   }
        //pattern 6
        //   int num=1;
        //   for(int i=1;i<=n;i++)
        //   {
        //       for(int j=1;j<=i;j++) 
        //       {
        //         System.out.print(num+" ");
        //         num++;
        //      }
        //       System.out.println();
        //   }

       
        //   for(int i=n;i>=1;i--)
        //   {
        //     // for(int k = n; k <=n-i;k++)
        //     // {
        //     //     System.out.print(" ");
        //     // }
        //       for(int j=1;j<=i;j++) 
        //       {
        //         int sum = i+j;
        //         if(sum % 2 ==0)
        //         {
        //             System.out.print("1"+" ");
        //         }
        //         else{
        //             System.out.print("0"+" ");
        //         }
        //     }
        // System.out.println();
        // }
        //       //System.out.println();
          
    }
}
