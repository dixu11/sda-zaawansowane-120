package obiektowe.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(null);
        list1.add(null);
        list1.add(null);
        System.out.println(list1);
        System.out.println(list1.size());




        //[0][0][0]
        //add(10)
        //[10][0][0]
        //add(20)
        //[10][20][0]
        //add(30)
        //[10][20][30]
        //add(35)
        //[10][20][30][35][0][0]
       // list1.add(0,7);
        //[10][20][30] {[35][35]} [0]
        //[10][20] {[30][30]} [35][0]
        //[10] {[20][20]} [30][35][0]
        // {[10][10]} [20][30][35][0]
        // {[7]} [10][20][30][35][0]

        List<Integer> list2 = new LinkedList<>();
        //null
        //add(10)
        //([10])>null
        //add(20)
        // ([20]) (tworzy nowy element łańcucha)
        //([10])>([20])>null (odnajduje ostatni element i ustawia mu, ten nowy jako jego następny)
        //add(30)
        // ([30]) (tworzy nowy element łańcucha)
        //([10])>([20])>([30])>null (odnajduje ostatni element i ustawia mu, ten nowy jako jego następny)
        //add(35)
        // ([35]) (tworzy nowy element łańcucha)
        //([10])>([20])>([30])>([35])>null

        // list1.add(1,7);
        //([10])>([20])>([30])>([35])>null  //Odnajdujemy odpowiednie miejsce (pozycja 1 czyli element z 20)
        //([7])>null tworzymy nowy element łańcucha
        // ([7])>([20])>([30])>([35])>null     ustawiamy że nowy element wskazuje na ten na indexie 1
        // ([10])>([7])>([20])>([30])>([35])>null   przestawiamy że 10 wskazuje na 7

        //czyli dana ma informacje co jest przed nia i co za nia oraz jaki ma indeks?


        MyContainer<Integer> intContainer = new MyContainer<>();
        intContainer.setData(10);
        System.out.println(intContainer.getData());

        MyContainer<String> stringContainer = new MyContainer<>();
        stringContainer.setData("abc");
        System.out.println(stringContainer.getData());

        List<Integer> myList = new MyArrayList<>();



    }
}
