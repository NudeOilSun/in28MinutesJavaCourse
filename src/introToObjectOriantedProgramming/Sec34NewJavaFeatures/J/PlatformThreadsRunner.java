package introToObjectOriantedProgramming.Sec34NewJavaFeatures.J;

import introToObjectOriantedProgramming.Sec34NewJavaFeatures.SleepingThread;

public class PlatformThreadsRunner {
    public static void main(String[] args) {
        for (int i =  0; 1<1000000; i++){
            System.out.println(i);
             new Thread(new SleepingThread()).start();
        }
    }
}
