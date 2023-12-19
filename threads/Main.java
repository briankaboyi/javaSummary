public class Main implements Runnable {

    public static void main(String args[]) {
        Main threadA = new Main();
        // Main threadB = new Main();
        // Main threadC = new Main();
        Thread thread = new Thread(threadA);
        thread.start();
        // threadB.start();
        // threadC.start();
        for (int i = 0; i <= 3; i++) {
            MultiThreadThing mythread = new MultiThreadThing(i);
            Thread mything = new Thread(mythread);
            mything.start();
            System.out.println(mything.isAlive());

            try{

                mything.join();
            }catch(Exception e){

            }
                        System.out.println(mything.isAlive());


        }


        // MultiThreadThing mythread = new MultiThreadThing();
        // MultiThreadThing mythread1 = new MultiThreadThing();
        // mythread1.run();
        // mythread.start();
        // mythread1.start();
    }

    public void run() {
        System.out.println("THIS OOPERATION IS RUNNUING");
    }
}
