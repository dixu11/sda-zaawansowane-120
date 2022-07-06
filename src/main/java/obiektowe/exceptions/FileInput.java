package obiektowe.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput {


    public List<Book> readBooks() {
        List<Book> booksList = new ArrayList<>();
        File file = new File("src\\main\\java\\obiektowe\\exceptions\\ksiazki.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Book book = mapLineToBook(line);
                booksList.add(book);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
            e.printStackTrace();
        }

        return booksList;
    }

    private Book mapLineToBook(String line) {
        try{
        String[] elements = line.split(";");
        String title = elements[0];
        int year = Integer.parseInt(elements[1]);
        Book book = new Book(title, year);
            return book;
        }catch (Exception exception){
            System.out.println("Niepoprawny format pliku!!!!");
            System.out.println("Dla linii: " + line);
            return null;
        }

    }


    public static void main(String[] args) {
        FileInput input = new FileInput();
        System.out.println(input.readBooks());
    }

}
