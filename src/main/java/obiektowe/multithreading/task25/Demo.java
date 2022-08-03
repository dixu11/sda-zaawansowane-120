package obiektowe.multithreading.task25;

public class Demo {
    public static void main(String[] args) {
        ConcatenationTask concatenationTask = new ConcatenationTask(200_000,"D");
        concatenationTask.startTask();

        Runnable abortingTask = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    concatenationTask.abort();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(abortingTask);
        thread.start();

        concatenationTask.waitUntilEnd();
        String result = concatenationTask.getResult();
        System.out.println(result.length());
    }

//    Stwórz klasę ConcatenationTask w której będziemy X razy kopiować ten sam tekst (wykorzystaj ‘+=’).   Tzn. tworząc
//    i uruchamiając ConcatenationTask z parametrami: 3 oraz “D” wynikiem pracy wątku powinno być “DDD” zapisane w
//    polu result.
//    Zadanie powinno być możliwe do rozpoczęcia po wywołaniu metody startTask()
//    Zadbaj o to, aby zadanie można było przerwać za pomocą metody abort()


//    w mainie za pomocą anonimowej klasy stwórz i uruchom inny wątek który przerwie zadanie z poprzedniego wątku po
//    sekundzie
//    W mainie na koniec zaprezentuj ile znaków ma wynik konkatenacji. Przetestuj scenariusz w którym ustawiasz tyle
//    razy doklejanie tekstu aby trwało to dłużej niż sekundę i upewnij się, że Twoja metoda abort() działa poprawnie.

}
