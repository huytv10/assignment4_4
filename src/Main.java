import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static int interval;
    static Timer timer;
    static int minute;

    public static void main(String[] args) {
        int delay = 1000;
        int period = 1000;
        minute = 9;
        timer = new Timer();
        interval = 0;
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(minute + ":" + setInterval());

            }
        }, delay, period);
    }

    private static final int setInterval() {
        if (interval == 1 && minute == 0) {
            timer.cancel();
        }
        if (interval == 1) {
            --minute;
        }
        if (interval == 0) {
            interval = 60;
        }
        return --interval;
    }
} 