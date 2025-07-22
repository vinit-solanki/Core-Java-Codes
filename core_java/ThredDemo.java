
import java.util.concurrent.RunnableScheduledFuture;

class MyThread extends Thread{
    public void run(){
        try{
            System.out.println("Sleeping for 1000ms");
            Thread.sleep(1000);
            System.out.println("Thread is running: "+ Thread.currentThread().getName());
        } catch(InterruptedException e){
            System.out.println("InterruptedException Caught:"+e);
        } finally{
            System.out.println("finally block");
        }
    }
}
class A  extends MyThread implements Runnable {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("A="+i);
            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                System.out.println("InterruptedException Caught:"+e);
            }
        }
    }
}
class B extends MyThread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("B="+i);
            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                System.out.println("InterruptedException Caught:"+e);
            }
        }
    }
}
public class ThredDemo {
    public static void main(String[] args){
        // MyThread t1 = new MyThread();
        // t1.start();
        Runnable a = new A();
        Runnable b = new B();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        // a.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t1.setDaemon(true);
        t2.setDaemon(true);
    }
}
