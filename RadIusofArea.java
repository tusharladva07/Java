import java.util.Scanner;

public class RadIusofArea {
    public static void main(String[] args)
    {
        double radius, AreaofRadius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        radius = sc.nextDouble();
        AreaofRadius = Math.PI * radius * radius;
        System.out.println(AreaofRadius);
    }
}
