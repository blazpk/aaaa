import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.List;

public class threadpool {

    /*
    //threadpool
    public static void main(String[] args) {

        ExecutorService Exc = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            myrunnable myRunnable = new myrunnable("Myrunnable "+i);
            Exc.execute(myRunnable);
        }
        Exc.shutdown();*/

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<String>> listFuture = new ArrayList<Future<String>>();

        for (int i = 1; i <= 10; i++) {
            MyCallable myCallable = new MyCallable("Callable " + i);

            Future<String> future = executorService.submit(myCallable);
            listFuture.add(future);
        }

        for (Future future : listFuture) {
            try {
                System.out.println(future.get() + " kết thúc");
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }


}

