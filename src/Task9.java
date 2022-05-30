import java.util.Scanner;

public class Task9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = (int) a;
        sc.close();
        if (a - b > 0) {
            System.out.println("число имеет вещественную часть");
        } else {
            System.out.println("число не имеет вещественную часть");
        }
    }
}

