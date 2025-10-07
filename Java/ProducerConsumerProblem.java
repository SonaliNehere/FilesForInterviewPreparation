import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class Buffer {
	private int capacity;
	private Queue<Integer> buffer = new LinkedList<>();

	Buffer(int capacity) {
		this.capacity = capacity;
	}

	public synchronized void produce(int value) throws InterruptedException {

		while (buffer.size() >= capacity) {
			wait();
		}

		buffer.add(value);
		System.out.println(Thread.currentThread().getName() + " : produce " + value);
		notify();

	}

	public synchronized void consume() throws InterruptedException {

		while (buffer.size() == 0) {
			wait();
		}

		int value = buffer.poll();
		System.out.println(Thread.currentThread().getName() + " : consume " + value);
		notify();

	}
}

class BufferMultiple {
	private int capacity;
	private Queue<Integer> buffer = new LinkedList<>();

	BufferMultiple(int capacity) {
		this.capacity = capacity;
	}

	public synchronized void produce(int value) throws InterruptedException {

		while (buffer.size() >= capacity) {
			wait();
		}

		buffer.add(value);
		System.out.println(Thread.currentThread().getName() + " : produce " + value);
		notifyAll();

	}

	public synchronized void consume() throws InterruptedException {

		while (buffer.size() == 0) {
			wait();
		}

		int value = buffer.poll();
		System.out.println(Thread.currentThread().getName() + " : consume " + value);
		notifyAll();

	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Buffer buffer = new Buffer(5);
//
//		Thread producer = new Thread(() -> {
//			int value = 0;
//			while(true) {
//				try {
//					buffer.produce(value++);
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
//		});
//
//		Thread consumer = new Thread(() -> {
//			while(true){
//				try {
//					buffer.consume();
//					Thread.sleep(5000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		});
//		
//		producer.start();
//		consumer.start();

		// using blocking queue
//		BlockingQueue<Integer> bufferBlock = new ArrayBlockingQueue<>(5);
//
//		Thread producer = new Thread(() -> {
//			int value = 1;
//			while (true) {
//				try {
//					bufferBlock.put(value);
//					System.out.println(Thread.currentThread().getName() + " : produce " + value);
//					value++;
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//		});
//
//		Thread consumer = new Thread(() -> {
//			while (true) {
//				try {
//					int value = bufferBlock.take();
//					System.out.println(Thread.currentThread().getName() + " : consume " + value);
//					Thread.sleep(5000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		});
//
//		producer.start();
//		consumer.start();

		// multiple producer and consumer using blockingqueue
//		BlockingQueue<Integer> bufferBlock = new ArrayBlockingQueue<>(5);
//		AtomicInteger counter = new AtomicInteger(1);
//
//		Runnable produce = () -> {
//			while (true) {
//				try {
//					int value = counter.getAndIncrement();
//					bufferBlock.put(value);
//					System.out.println(Thread.currentThread().getName() + " : produce " + value);
//					value++;
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//
//		};
//
//		Runnable consume = () -> {
//			while (true) {
//				int value;
//				try {
//					value = bufferBlock.take();
//					System.out.println(Thread.currentThread().getName() + " : consume " + value);
//					Thread.sleep(5000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//		};
//		
//		Thread p1 = new Thread(produce, "producer1");
//		Thread p2 = new Thread(produce, "producer2");
//		Thread p3 = new Thread(produce, "producer3");
//		
//		Thread c1 = new Thread(consume, "consumer1");
//		Thread c2 = new Thread(consume, "consumer2");
//		
//		p1.start();
//		p2.start();
//		p3.start();
//		
//		c1.start();
//		c2.start();

		// If asked "Why use AtomicInteger?", you can say:
//“Because each producer thread must share a single counter to ensure a consistent sequence of values. AtomicInteger provides
//		thread-safe increments without requiring explicit synchronization.”

		// multiple producer consumer
		BufferMultiple buffer = new BufferMultiple(5);
		AtomicInteger i = new AtomicInteger(1);
		Runnable produce = () -> {
			while (true) {
				int value = i.getAndIncrement();
				try {
					buffer.produce(value);
					Thread.sleep(2000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable consume = () -> {
			while(true) {
				try {
					buffer.consume();
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread p1 = new Thread(produce, "producer1");
		Thread p2 = new Thread(produce, "producer2");
		Thread p3 = new Thread(produce, "producer3");
		
		Thread c1 = new Thread(consume, "consumer1");
		Thread c2 = new Thread(consume, "consumer2");
		
		p1.start();
		p2.start();
		p3.start();
		
		c1.start();
		c2.start();
		
		

	}

}
