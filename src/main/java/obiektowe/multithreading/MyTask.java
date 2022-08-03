package obiektowe.multithreading;

public class MyTask implements Runnable {

    private boolean running = true;

   /* @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
                if (!running) {
                    System.out.println("Kończę pracę");
                    break;
                }
                System.out.println("Tik...");

            }catch (InterruptedException e){
                //...
            }
        }
    }*/

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("Tik...");
            }catch (InterruptedException e){
                System.out.println("Kończę pracę!");
                break;
            }
        }
    }

    public void stopRunning() {
        running = false;
    }
}
