import java.util.*;
public class selfproblem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();

        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
        int perimeter = 2*(length + breadth);
        System.out.println("Perimeter of Rectangle is:"+ perimeter);
    }
}
