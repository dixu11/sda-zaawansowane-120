package obiektowe.multithreading;

public class StopThreadDemo {
    public static void main(String[] args) throws InterruptedException {


        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();

        Thread.sleep(3000);
//        myTask.stopRunning();
        thread.interrupt();









    }
}
