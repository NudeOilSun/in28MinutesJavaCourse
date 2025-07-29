package introToObjectOriantedProgramming.Section27Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class task extends Thread{
    private int number;

    public task(int number){
        this.number = number;
    }
    public void run(){
        System.out.println("\nTask " + number + "started ");

        for(int i = number*100; i <number*100 + 99;i++){ //RUNNING
            System.out.print(i + " ");
        }

        Thread.yield(); //current thread is allowed to yield its current processing power if needed
        System.out.println("\nTask " + number + " done ");
    }
}

public class ExecutarServiceRunner {
    public static void main(String[] args) {
        //ExecutorService excutorsService = Executors.newSingleThreadExecutor(); //forces only one thread to be excutaed at one time
        ExecutorService excutorsService = Executors.newFixedThreadPool(2); //forces only one thread to be excutaed at one time
        excutorsService.execute(new task(1));
        excutorsService.execute(new task(2));
        excutorsService.execute(new task(3));
        excutorsService.execute(new task(4));

        excutorsService.shutdown();
    }
}
