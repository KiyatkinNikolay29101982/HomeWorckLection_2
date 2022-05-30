import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {

            Scanner sca = new Scanner(System.in);


            int x = sca.nextInt();

            sca.close();

            int rezult = 0;

            while(x != 0){
                rezult = rezult + (x % 10);
                x /=10;
            }

            System.out.println(rezult);
        }

    }


