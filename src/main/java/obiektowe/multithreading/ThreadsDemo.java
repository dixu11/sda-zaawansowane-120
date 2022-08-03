package obiektowe.multithreading;

public class ThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 1_000; i++) {
                    System.out.println("Przygotowuję elementy A");
                }
            }
        };

        Runnable task2 = new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 1_000; i++) {
                    System.out.println("Przygotowuję elementy B");
                }
            }
        };

        Thread worker = new Thread(task);
        Thread worker2 = new Thread(task2);
        worker.start(); // start, nie run!
        worker2.start();

        worker.join(); //będzie tu stał i czekał aż worker skończy pracować
        System.out.println("WĄTEK 1 KONCZY");
        worker2.join();
        System.out.println("WĄTEK 2 KONCZY");

        //dajemy sobie gwarancje że oba wątki skończą już pracować
        for (int i = 0; i < 1_000; i++) {
            System.out.println("Wykorzystujemy wyniki pracy obu wątków, elementy A i B");
        }
    }
}
