package introToObjectOriantedProgramming.Section27Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CallableTask implements Callable<String>{
    private final String name;

    public CallableTask(String name) throws InterruptedException {
        Thread.sleep(1000);
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        return "hello " + name;
    }
}
public class CallableRunner  {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService exServ = Executors.newFixedThreadPool(1);
        var welcomeFuture = exServ.submit(new CallableTask("louise")); //futures are promises that the code will be excuted
        System.out.println("new CallableTask excuted");

        String result = welcomeFuture.get(); //rest of the code will only be executed once this has been completed
        System.out.println(result);

        System.out.println("main completed");
        exServ.shutdown();
    }
}
