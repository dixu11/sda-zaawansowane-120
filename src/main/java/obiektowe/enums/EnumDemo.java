package obiektowe.enums;

import javax.swing.*;

public class EnumDemo {
    public static void main(String[] args) {

        Shirt shirt1 = new Shirt(Sizes.XXL);
        Shirt shirt2 = new Shirt(Sizes.XL);

        System.out.println(shirt1);
        System.out.println(shirt2);

        Shop shop = new Shop();
        shop.pack(shirt1);
        shop.pack(shirt2);
    }
}
