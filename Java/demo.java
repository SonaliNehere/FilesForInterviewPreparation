package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;

record RecordStudent(int id, String name) {
	
	public void sum() {
		System.out.println("Sum from record");
	}
}

sealed class Parent permits Child1, Child2{
	void sum() {
		System.out.println("Parent sum");
	}
}

final class Child1 extends Parent{
	
}

final class Child2 extends Parent{
	
}

public class demo {

	private static final Semaphore sp = new Semaphore(2);

	private static Object lock = new Object();
	private static Boolean condition = false;

	private static final ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

	private static final int size = 10;
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(size);

	public static void main(String[] args) throws InterruptedException, ExecutionException, IllegalAccessException {
		// TODO Auto-generated method stub

		// virtual thread
//		List<Thread> threads = new ArrayList<>();
//
//		for (int i = 0; i < 10000; i++) {
//			Thread t = Thread.startVirtualThread(() -> {
//				System.out.println(Thread.currentThread().getName() );
//			});
//			threads.add(t);
//		}
//
//		for (Thread t : threads) {
//			t.join(); // Wait for all to finish
//		}

		// semaphore
//		for (int i = 0; i < 5; i++) {
//			Thread t = new Thread(() -> {
//				try {
//					sp.acquire();
//					System.out.println(Thread.currentThread().getName());
//					sp.release();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//				;
//			});
//			t.start();
//		}

		// yield
//		Runnable r = () -> {
//            int counter = 0;
//            while (counter < 2) {
//                System.out.println(Thread.currentThread()
//                        .getName());
//                counter++;
//                Thread.yield();
//            }
//        };
//        new Thread(r).start();
//        new Thread(r).start();

		// wait , notify
//		Thread producer = new Thread(() -> {
//
//			synchronized (lock) {
//				condition = true;
//				System.out.println("Procuct produced  " + lock.hashCode());
//				lock.notify();
//			}
//		});
//
//		Thread consumer = new Thread(() -> {
//			synchronized (lock) {
//				while (condition == false) {
//					try {
//						lock.wait();
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//
//				System.out.println("Product consumed " + lock.hashCode());
//
//			}
//		});
//
//		consumer.start();
//		producer.start();

		// ThreadLocal
//		new Thread(() -> {
//			threadLocal.set(10);
//			System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
//		}).start();
//
//		new Thread(() -> {
//			System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
//		}).start();

		// Producer Consumer
//		Thread producerThread = new Thread(new Producer());
//		Thread consumerThread = new Thread(new Consumer());
//
//		producerThread.start();
//		consumerThread.start();

		// runnable
//		Runnable r = () -> {
//			System.out.println("Execute runnable");
//		};
//		new Thread(r).start();
//
//		Thread runnable = new Thread(() -> {
//			System.out.println("Execute runnable");
//		});
//		runnable.start();

		// callable
//		Callable<String> callable = () -> {
//			System.out.println("Execute callable");
//			return "callable";
//		};
//		FutureTask<String> f = new FutureTask<>(callable);
//		new Thread(f).start();
//		System.out.println(f.get());

		// executerservice
//		Runnable r = () -> {
//			System.out.println("Execute runnable");
//		};
//		Callable<String> callable = () -> {
//			System.out.println("Execute callable");
//			return "callable";
//		};
//		ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
//		singleThreadPool.execute(r);
//		singleThreadPool.submit(callable);
//		
//		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
//		fixedThreadPool.execute(r);
//		fixedThreadPool.submit(callable);
//		
//		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//		cachedThreadPool.execute(r);
//		cachedThreadPool.submit(callable);
//		
//		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
//		scheduledThreadPool.execute(r);
//		scheduledThreadPool.submit(callable);

		// completable future
//		CompletableFuture<String> cmp = CompletableFuture.supplyAsync(() -> {
//			return "supplyAsync";
//		});
//		System.out.println(cmp.join());

		// optional
//		Optional<String> o1 = Optional.of("Sonali");
//		Optional<String> o2 = Optional.ofNullable(null);
//		Optional<String> o3 = Optional.empty();

//		if(o1.isPresent())
//			System.out.println(o1.get());
//		
//		if(o2.isPresent())
//			System.out.println(o2.get());
//		
//		if(o3.isPresent())
//			System.out.println(o3.get());

//		o1.ifPresent(x-> System.out.println(x));
//		o2.ifPresent(x-> System.out.println(x));
//		o3.ifPresent(x-> System.out.println(x));

//		System.out.println(o1.orElse("Default"));
//		System.out.println(o2.orElse("Default"));
//		System.out.println(o3.orElse("Default"));

//		System.out.println(o1.orElseGet(() -> "Generated Value"));
//		System.out.println(o2.orElseGet(() -> "Generated Value"));
//		System.out.println(o3.orElseGet(() -> "Generated Value"));

//		System.out.println(o1.orElseThrow());
//		System.out.println(o2.orElseThrow());
//		System.out.println(o3.orElseThrow());

//		System.out.println(o1.orElseThrow(() -> new IllegalAccessException("No element")));

//		System.out.println(o2.orElseThrow(() -> new IllegalAccessException("No element")));

//		System.out.println(o3.orElseThrow(() -> new IllegalAccessException("No element")));

//		Optional<String> res = o1.map(String::toUpperCase);
//		System.out.println(res.get());
//		Optional<String> res2 = o2.map(String::toUpperCase);
//		System.out.println(res2.isPresent());

//		System.out.println(o1.filter(x -> x.startsWith("S")).isPresent());
//		System.out.println(o1.filter(x -> x.startsWith("C")).isPresent());

//		String result = o1.filter(n -> n.startsWith("S")).map(String::toUpperCase).orElse("DEFAULT");
//		System.out.println(result);
//		
//		String result2 = o2.filter(n -> n.startsWith("S")).map(String::toUpperCase).orElse("DEFAULT");
//		System.out.println(result2);

//		List<String> names = Arrays.asList("Sonali", null, "Alice", "Bob", "", null, "Eve");
//
//		for (String name : names) {
//			// Wrap each name in Optional
//			Optional<String> optionalName = Optional.ofNullable(name);
//
//			// 1️⃣ Check if value is present
//			optionalName.ifPresentOrElse(n -> System.out.println("Original Name: " + n),
//					() -> System.out.println("No value present"));
//
//			// 2️⃣ Filter names with length > 3
//			String filteredName = optionalName.filter(n -> n.length() > 3).orElse("Filtered Out");
//			System.out.println("Filtered Name (>3 chars): " + filteredName);
//
//			// 3️⃣ Transform name to uppercase using map
//			String upperName = optionalName.map(String::toUpperCase).orElse("DEFAULT");
//			System.out.println("Uppercase Name: " + upperName);
//
//			// 4️⃣ Provide default value if null or empty
//			String defaultName = optionalName.filter(n -> !n.isEmpty()).orElse("No Name Provided");
//			System.out.println("Default Name: " + defaultName);
//
//			System.out.println("-----");
//		}
//
//		// 5️⃣ Throw exception if value is null
//		try {
//			Optional<String> nullName = Optional.ofNullable(null);
//			String mustHaveName = nullName.orElseThrow(() -> new IllegalArgumentException("Name is mandatory!"));
//		} catch (Exception e) {
//			System.out.println("Exception: " + e.getMessage());
//		}
		
		//record
//		RecordStudent recordStudent  = new RecordStudent(1, "Sonali");
//		System.out.println(recordStudent);
//		System.out.println(recordStudent.name());
//		recordStudent.sum();
//		
//		RecordStudent recordStudent1  = new RecordStudent(2, "Snehal");
//		System.out.println(recordStudent1);
//		
//		System.out.println(recordStudent.equals(recordStudent1));
		
		//sealed classes
		Child1 c = new Child1();
		c.sum();
		

	}

	static class Producer implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub

			int i = 0;
			while (true) {
				try {
					queue.put(i++);
					System.out.println("Produced by " + Thread.currentThread().getName() + " " + (i - 1));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}

	static class Consumer implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub

			try {
				while (true) {
					int t = queue.take();
					System.out.println("Consumed by " + Thread.currentThread().getName() + " " + t);
					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
