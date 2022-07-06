package obiektowe.inheritance.exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {
        System.out.println("Start");
        String text = "abc";
        try{
           String result= text.toUpperCase();
            System.out.println(result);
        }catch (NullPointerException e ){
            System.out.println("Wystąpił nullpointer!");
        }finally {
            System.out.println("Zawsze wystąpi");
        }

        System.out.println(".......");

    }
}
