public class Task8 {
    final int SOUND_SPEED = 343; //  m/s
    int time;  // s

    public Task8(int time) {
        this.time = time;

    }

    public int compute() {
        return (time * SOUND_SPEED);
    }

    public static void main(String[] args) {
        Task8 a = new Task8(3);
        System.out.println(a.compute());
    }
}
