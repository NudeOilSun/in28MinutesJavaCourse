package introToObjectOriantedProgramming.Section27Threads;

class task1 extends Thread{
    public void run(){
        System.out.println("\nTask1 started ");

        for(int i = 101; i <199;i++){ //RUNNING
            System.out.print(i + " ");
        }

        Thread.yield(); //current thread is allowed to yield its current processing power if needed
        System.out.println("\nTask1 done ");
    }
}
class task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("\nTask2 started ");

        for(int i = 201; i <299;i++){ //RUNNING
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 done ");  //THREAD TERMINATED/DEAD
    }
}
public class ThreadsBasicRunner {
    public static void main(String[] args) throws InterruptedException /* for .join*/{
        //task 1
        System.out.println("\nTask1 kicked off    ");
        task1 task1 = new task1(); //NEW STATE
        task1.setPriority(1);
        task1.start();

        //Task 2
        System.out.println("\nTask2 kicked off    ");
        task2 task2 = new task2(); //NEW STATE
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

        //wait for task1 & task2 to complete
        task1.join();
        task2Thread.join();
        //Task3
        System.out.println("\nTask3 kicked off    ");
        for(int i = 301; i <399;i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask3 done ");
        System.out.println("\n main done");

    }
}
