public class Task11 {
    public static void main(String [] args) {
        int second = 670000;

        int day = second/86400;
        int hour = (second % 86400)/ 3600;
        int minute = ((second % 86400) % 3600)/60;
        int seconds = ((second % 86400 ) % 3600 ) % 60;

        System.out.println("До нового года осталось " + day + " дней " + hour + " часов " + minute + " минут " + seconds + " секунд");

    }
}
