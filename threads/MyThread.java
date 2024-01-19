public class MyThread extends Thread {
  // MultiThreadThing mythread = new MultiThreadThing();
  // MultiThreadThing mythread1 = new MultiThreadThing();
  // mythread1.run();
  // mythread.start();
  // mythread1.start();
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("THIS OOPERATION IS RUNNUING from MYTHREAD" + i);
    }
  }
}
