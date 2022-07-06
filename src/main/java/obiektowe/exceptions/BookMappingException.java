package obiektowe.exceptions;

public class BookMappingException extends Exception {

    private String line;

    public BookMappingException(String message, String line){
        super(message);
        this.line = line;
    }

    public String getLine() {
        return line;
    }
}
