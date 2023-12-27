// NEED TO INTEGRATE THIS INTO MATH TEST CLASS
public class Timer {
    public static void Time() {
        int seconds = 0;

        while (true) {
            System.out.print("\r" + seconds + " seconds");
            seconds++;

            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
