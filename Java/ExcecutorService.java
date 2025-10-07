import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// 1 Single Thread Executor
		ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        singleExecutor.submit(() -> {
            System.out.println(Thread.currentThread().getName() + " executing single-thread task");
        });

		// 2️ Fixed Thread Pool (size = 3)
//        ExecutorService fixedExecutor = Executors.newFixedThreadPool(3);
//        for (int i = 1; i <= 5; i++) {
//            int taskId = i;
//            fixedExecutor.submit(() -> {
//                System.out.println(Thread.currentThread().getName() + " processing fixed-pool task " + taskId);
//            });
//        }

		// 3️ Cached Thread Pool
//		ExecutorService cachedExecutor = Executors.newCachedThreadPool();
//		for (int i = 1; i <= 3; i++) {
//			int taskId = i;
//			cachedExecutor.submit(() -> {
//				System.out.println(Thread.currentThread().getName() + " executing cached-pool task " + taskId);
//			});
//		}

		// 4️ Scheduled Thread Pool (size = 2)
//		ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(2);
//		scheduledExecutor.schedule(() -> {
//			System.out.println(Thread.currentThread().getName() + " executing delayed task");
//		}, 2, TimeUnit.SECONDS);
//
//		scheduledExecutor.scheduleAtFixedRate(() -> {
//			System.out.println(Thread.currentThread().getName() + " executing periodic task");
//		}, 1, 3, TimeUnit.SECONDS);

		// Shutdown after some time
		Thread.sleep(8000);
//        singleExecutor.shutdown();
//        fixedExecutor.shutdown();
//		cachedExecutor.shutdown();
//		scheduledExecutor.shutdown();
		
//		✅ Key Takeaways
//		All four executors manage threads differently.
//		Always call shutdown() (or shutdownNow()) to release resources.
//		Use Future if you need results from submitted tasks.
//		For recurring tasks, use ScheduledExecutorService.

		/////////////////////////////////////////////////////////////////////////////
		//using runnable and callable
		  // 1️⃣ SINGLE THREAD EXECUTOR
//        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
//
//        Runnable singleRunnable = () ->
//                System.out.println(Thread.currentThread().getName() + " -> SingleThreadExecutor running Runnable task");
//
//        Callable<String> singleCallable = () -> {
//            Thread.sleep(500);
//            return Thread.currentThread().getName() + " -> SingleThreadExecutor Callable result";
//        };
//
//        singleExecutor.submit(singleRunnable);
//        Future<String> singleFuture = singleExecutor.submit(singleCallable);
//        System.out.println("Result: " + singleFuture.get());

        // 2️⃣ FIXED THREAD POOL (size = 3)
//        ExecutorService fixedExecutor = Executors.newFixedThreadPool(3);
//
//        for (int i = 1; i <= 3; i++) {
//            int taskId = i;
//            Runnable task = () ->
//                    System.out.println(Thread.currentThread().getName() + " -> FixedThreadPool Runnable task " + taskId);
//            fixedExecutor.submit(task);
//        }
//
//        Callable<String> fixedCallable = () ->
//                Thread.currentThread().getName() + " -> FixedThreadPool Callable executed";
//        Future<String> fixedFuture = fixedExecutor.submit(fixedCallable);
//        System.out.println("Result: " + fixedFuture.get());

        // 3️⃣ CACHED THREAD POOL
//        ExecutorService cachedExecutor = Executors.newCachedThreadPool();
//
//        for (int i = 1; i <= 2; i++) {
//            int id = i;
//            cachedExecutor.submit(() ->
//                    System.out.println(Thread.currentThread().getName() + " -> CachedThreadPool Runnable " + id));
//        }
//
//        Callable<Integer> cachedCallable = () -> {
//            Thread.sleep(300);
//            return 100 + 200;
//        };
//        Future<Integer> cachedFuture = cachedExecutor.submit(cachedCallable);
//        System.out.println("Cached Callable Result: " + cachedFuture.get());

        // 4️⃣ SCHEDULED THREAD POOL (size = 2)
//        ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(2);
//
//        Runnable scheduledRunnable = () ->
//                System.out.println(Thread.currentThread().getName() + " -> Scheduled task executed");
//
//        Callable<String> scheduledCallable = () ->
//                Thread.currentThread().getName() + " -> Scheduled Callable result";
//
//        scheduledExecutor.schedule(scheduledRunnable, 1, TimeUnit.SECONDS);
//        ScheduledFuture<String> scheduledFuture =
//                scheduledExecutor.schedule(scheduledCallable, 2, TimeUnit.SECONDS);
//        System.out.println("Scheduled Callable Result: " + scheduledFuture.get());

        // Periodic task demonstration
//        scheduledExecutor.scheduleAtFixedRate(() ->
//                System.out.println(Thread.currentThread().getName() + " -> Periodic task running"), 1, 3, TimeUnit.SECONDS);

        
        
        // Give time for periodic tasks
        Thread.sleep(8000);

        // Shutdown executors
//        singleExecutor.shutdown();
//        fixedExecutor.shutdown();
//        cachedExecutor.shutdown();
//        scheduledExecutor.shutdown();
	}

}
