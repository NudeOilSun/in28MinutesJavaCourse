package introToObjectOriantedProgramming.Sec34NewJavaFeatures.J;

import introToObjectOriantedProgramming.Sec34NewJavaFeatures.SleepingThread;

public class VirtualThreadsRunner {
    public static void main(String[] args) {
        for (int i =  0; 1<1000000; i++){
            System.out.println(i);
             //new Thread(new SleepingThread()).start();
            Thread.startVirtualThread(new SleepingThread()); //virtual threads use java VMs to run light weight threads that use much less memory
            Thread.ofVirtual().start(new SleepingThread());
        }
    }
}
