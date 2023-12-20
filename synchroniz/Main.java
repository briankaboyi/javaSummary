package synchroniz;

public class Main {
    public static void main (String args[]){
        Counter counter = new Counter();

        Thread thread1 = new Thread(()->{
            for(int i = 0;i<5;i++){
                counter.increment();
            }
        },"Thread-1");
        Thread thread2 = new Thread(()->{
            for(int i = 0;i<5;i++){
                counter.increment();
            }
        },"Thread-2");//the string is the thread name, if ommited the names will start at Thread-0;
        thread1.start();
        thread2.start();
    }
}
class Counter{
    private int count=0;
    private final Object lockObject = new Object();

public synchronized void increment(){
    // count++;
    // System.out.println(Thread.currentThread().getName() + ": Count is now " + count);

synchronized (lockObject){
    count++;
    System.out.println(Thread.currentThread().getName() + ": Count is now " + count);
}
}
}