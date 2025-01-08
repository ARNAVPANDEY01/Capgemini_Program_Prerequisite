import java.util.*;
public class selfproblem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextInt();

        double miles = km * 0.621371;

        System.out.println("Miles is:" + miles);
        sc.close();
    }
}
