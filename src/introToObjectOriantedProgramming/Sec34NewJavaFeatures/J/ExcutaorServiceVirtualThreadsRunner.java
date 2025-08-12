package introToObjectOriantedProgramming.Sec34NewJavaFeatures.J;

import introToObjectOriantedProgramming.Sec34NewJavaFeatures.SleepingThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutaorServiceVirtualThreadsRunner {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        for (int i =  0; 1<1000000; i++){
            System.out.println(i);
            executor.execute(new SleepingThread());
        }
    }
}
