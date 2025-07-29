 package introToObjectOriantedProgramming.Section27Threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallerRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService exServ = Executors.newFixedThreadPool(3);
        List<CallableTask> callableTasks = List.of(new CallableTask("louise"),
                new CallableTask("pepsi"),
                new CallableTask("xeno"),
                new CallableTask("kyle"));

        String results = exServ.invokeAny(callableTasks); //this just gets one result instead of waiting for all results

       System.out.println(results);

        exServ.shutdown();
    }
}
