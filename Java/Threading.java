class CustomThread extends Thread {
	public void run() {
		System.out.println("CustomThread running : " + Thread.currentThread().getName());
	}
}

class CustomThread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("CustomThread1 running : " + Thread.currentThread().getName());
	}

}

public class Threading {

	public static void main(String[] args) {
//		CustomThread c = new CustomThread();
//		c.start();
//		
//		CustomThread1 c1 = new CustomThread1();
//		Thread t = new Thread(c1);
//		t.start();
//		
		
		//traditional way
//		🔍 What is an Anonymous Inner Class?
//		An anonymous inner class is a way to provide the implementation of an interface or an abstract class on the
//		spot—without explicitly creating a separate subclass.
//		So, this:
		
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Runnable : " + Thread.currentThread().getName());
//			}
//		};
//		new Thread(r).start();
		
//		is actually Java creating an unnamed class that implements Runnable, and immediately instantiating it.
//This is equivalent to:
		
//		class MyRunnable implements Runnable {
//		    @Override
//		    public void run() {
//		        System.out.println("Runnable : " + Thread.currentThread().getName());
//		    }
//		}
//
//		Runnable r = new MyRunnable();
//		new Thread(r).start();
		
		
		//using lambda
//		Runnable r1 = () -> System.out.println("Runnable1 : " + Thread.currentThread().getName());
//		new Thread(r1).start();
		
//		Multiple Threads with Lambdas
//		for (int i = 1; i <= 3; i++) {
//            int taskId = i;
//            new Thread(() -> {
//                System.out.println("Task " + taskId + " is running in thread: " + Thread.currentThread().getName());
//            }).start();
//        }
		
		
		
//		💡 Lambda Equivalent (Java 8+)
//		If the interface is a functional interface (has just one abstract method), like Runnable, we can use a lambda expression:

//		Runnable r = () -> System.out.println("Running...");
//		new Thread(r).start();
		
//		Or directly in a thread:
		
//		Thread t = new Thread(() -> System.out.println("Running in a thread using lambda!"));
//		t.start();

	}

}
