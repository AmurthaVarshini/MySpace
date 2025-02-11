import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadExample {
    // Shared resources (locks)
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        // Creating threads
        Thread thread1 = new Thread(() -> {
            lock1.lock();
            try {
                System.out.println("Thread 1 acquired Lock 1");
                lock2.lock();
                try {
                    System.out.println("Thread 1 acquired Lock 2");
                } finally {
                    lock2.unlock();
                }
            } finally {
                lock1.unlock();
            }
            System.out.println("Thread 1 released both locks");
        });

        Thread thread2 = new Thread(() -> {
            lock1.lock(); // Locks acquired in the same order
            try {
                System.out.println("Thread 2 acquired Lock 1");
                lock2.lock();
                try {
                    System.out.println("Thread 2 acquired Lock 2");
                } finally {
                    lock2.unlock();
                }
            } finally {
                lock1.unlock();
            }
            System.out.println("Thread 2 released both locks");
        });

        // Start threads
        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
