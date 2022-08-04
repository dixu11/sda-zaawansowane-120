package obiektowe.multithreading.synch;

public class CounterTask implements Runnable{

    private Thread thread1;
    private Thread thread2;
    private int counter = 0;


    public CounterTask() {
        thread1 = new Thread(this);
        thread2 = new Thread(this);
    }

    public void start() {
        thread1.start();
        thread2.start();
    }
    

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
    }

    public int getCounter() {
        return counter;
    }




    public static void main(String[] args) {
        CounterTask counterTask = new CounterTask();
        counterTask.start();
        System.out.println(counterTask.getCounter());
    }
}
