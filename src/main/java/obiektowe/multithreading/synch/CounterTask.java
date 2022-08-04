package obiektowe.multithreading.synch;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterTask implements Runnable{

    private Thread thread1;
    private Thread thread2;
    private AtomicInteger atomicCounter = new AtomicInteger(0);
//    private int counter = 0;


    public CounterTask() {
        thread1 = new Thread(this);
        thread2 = new Thread(this);
    }

    public void startAll() {
        thread1.start();
        thread2.start();
    }

    public void joinAll(){
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    

    @Override
    public void run() {
        for (int i = 0; i < 10_000; i++) {
           atomicCounter.getAndIncrement();
//            count();
            // String text = "abc";
            //int number = text.toUpperCase().toLowerCase().toUpperCase().substring(1, 2).charAt(0) + 100;
           /*int newNumber= counter + 1;
            counter = newNumber;*/
        }
    }


    private synchronized void count() {
//        counter++;
    }


    /*
    *  Counter: 2
    *  T1: jest 0
    *  T1: ma być 1
    *  T1: zmieniam na 1
    *  T2: jest 1
    *  T2: ma być 2
    *  T1: jest 1
    *  T1: ma być 2
    *  T1: zmianiam na 2
    *  T1: jest 2
    *  T1: ma być 3
    *  T1: zmieniam na 3
    *  T2: zmieniam na 2
    * */


   /* public int getCounter() {
        return counter;
    }*/
   public int getCounter() {
       return atomicCounter.get();
   }




    public static void main(String[] args) {
        CounterTask counterTask = new CounterTask();//przygotuj wątki i zadanie
        counterTask.startAll();//sygnał do rozpoczęcia pracy
        counterTask.joinAll();//idź dalej dopiero jak skończą
        System.out.println(counterTask.getCounter()); // jaki wynik?
    }
}
