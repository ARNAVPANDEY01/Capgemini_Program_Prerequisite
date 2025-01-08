import java.util.*;
public class selfproblem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int m = sc.nextInt();

        System.out.println("Enter exponenet");
        int n = sc.nextInt();

        int power = (int)Math.pow(m,n);
        System.out.println("Poweer Calculation is:" + power);


    }
}
