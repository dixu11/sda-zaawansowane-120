package obiektowe.enums;

import javax.swing.*;

public class EnumDemo {
    public static void main(String[] args) {

        Shirt shirt1 = new Shirt(Size.XXL);
        Shirt shirt2 = new Shirt(Size.XL);

        System.out.println(shirt1);
        System.out.println(shirt2);

        Shop shop = new Shop();
        shop.pack(shirt1);
        shop.pack(shirt2);

        Size size = Size.S;
        System.out.println(size.getNumericSize());


        for(Size aSize : Size.values()){
            System.out.println(aSize);
            System.out.println(aSize.getNumericSize());
            System.out.println(aSize.name());
            System.out.println(aSize.ordinal());
        }

        System.out.println(size.equals(Size.S));
        System.out.println(size == Size.S);

       // Size size = new Size(); // nie dziala bo prywatny konstruktor!
    }
}
