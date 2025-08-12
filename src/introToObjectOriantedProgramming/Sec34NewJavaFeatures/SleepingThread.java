package introToObjectOriantedProgramming.Sec34NewJavaFeatures;

import java.util.concurrent.TimeUnit;

public class SleepingThread implements Runnable{

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}