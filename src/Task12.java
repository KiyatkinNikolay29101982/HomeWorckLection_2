import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numberOfchildren = sc.nextInt();
        sc.close();
        double voluemOfMilk = 0.9;
        double voluemOfcup = 0.2;
        // Условие 1. 100% детей имеют вес меньше 30 кг.
        double  numberOfMilk1 = Math.round((numberOfchildren * voluemOfcup)/ voluemOfMilk);

        // Условие 2. 30% детей имеют вес меньше 30 кг.

        double numberOfMilk2 = Math.round((numberOfchildren * voluemOfcup * 0.3)/ voluemOfMilk);

        //Условие 3. 1 % процент детей весит меньше 30 кг

        double numberOfMilk3 = Math.ceil((numberOfchildren * voluemOfcup * 0.01)/ voluemOfMilk);

        System.out.println("количество пакетов млока если 100% детей " + numberOfMilk1 + " количество пакетов молока при 30% детей с весом меньше 30 кг "
                + numberOfMilk2 + " количество пакетов молока при 1 % детей с весом меньше 30 кг " + numberOfMilk3);
    }
}
