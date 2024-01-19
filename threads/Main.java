class Mains {

  public static void main(String args[]) {
    MyThread threadA = new MyThread();
    MyThread threadb = new MyThread();
    threadA.start();
    // Main threadB = new Main();
    // Main threadC = new Main();
    // Thread thread = new Thread(threadA);
    // thread.start();
    // threadB.start();
    // threadC.start();
    // for (int i = 0; i <= 3; i++) {
    //   MultiThreadThing mythread = new MultiThreadThing(i);
    //   Thread mything = new Thread(mythread);
    //   mything.start();
    //   System.out.println(mything.isAlive());

    //   try {
    //     mything.join();
    //   } catch (Exception e) {}
    //   System.out.println(mything.isAlive());
    // }
  }
}
