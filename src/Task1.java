import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();

        int y = sc.nextInt();

        sc.close();

        System.out.println(x / y);

        System.out.println(x % y);

        System.out.print(Math.sqrt(x));
    }
}