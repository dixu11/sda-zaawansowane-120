package obiektowe.multithreading.task25;

public class ConcatenationTask implements Runnable{
    private int count;
    private String text;
    private String result = "";
   private Thread thread;
    private boolean running = true;

    public ConcatenationTask(int count, String text) {
        this.count = count;
        this.text = text;
      thread = new Thread(this);
    }

    public void startTask() {
        thread.start();
    }

    public void abort() {
        running = false;
    }


    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            result += text;
            if (!running) {
                System.out.println("Aborting");
                break;
            }
        }
    }

    public String getResult() {
        return result;
    }

    public void waitUntilEnd() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
