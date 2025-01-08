import java.util.*;
public class selfproblem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int si = (principle * rate * time) / 100;
        System.out.println("Simple Interest is:" + si);  
        sc.close();
    }
}
