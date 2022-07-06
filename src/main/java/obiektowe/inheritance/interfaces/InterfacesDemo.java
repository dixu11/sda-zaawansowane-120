package obiektowe.inheritance.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InterfacesDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("bbb");
        list.add("abc");
        list.add("aaa");
       // System.out.println(list.get(1));
        list.remove(1);

        System.out.println(list);




    }
}
