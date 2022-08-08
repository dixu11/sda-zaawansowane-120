package obiektowe.powtorka;

public class ThreadDemo {
    public static void main(String[] args) {
        /*Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("hello");
            }
        });

        thread.start();*/

        Thread thread = new Thread(() -> System.out.println("hello"));
        thread.start();
    }
}
