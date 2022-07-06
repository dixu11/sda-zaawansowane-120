package obiektowe.exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {
        System.out.println("Start");
        String text = "abc";
        try{
           String result= text.toUpperCase();
            System.out.println(result);
           // System.out.println(text.charAt(100));
            System.out.println(10/0);
        }catch (StringIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Oj oj, oj..");
        } catch (Exception e){
            System.out.println("Jakiś nieprzewidziany wyjątek!");
            e.printStackTrace();
        } finally {
            System.out.println("Zawsze wystąpi");
        }
        System.out.println(".......");

    }
}
