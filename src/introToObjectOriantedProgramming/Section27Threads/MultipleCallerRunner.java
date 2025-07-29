package introToObjectOriantedProgramming.Section27Threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallerRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService exServ = Executors.newFixedThreadPool(3);
        List<CallableTask> callableTasks = List.of(new CallableTask("louise"),
                new CallableTask("pepsi"),
                new CallableTask("xeno"),
                new CallableTask("kyle"));

        List<Future<String>> results = exServ.invokeAll(callableTasks);

        for(Future<String> result:results){
            System.out.println(result.get());
        }

        exServ.shutdown();
    }
}
