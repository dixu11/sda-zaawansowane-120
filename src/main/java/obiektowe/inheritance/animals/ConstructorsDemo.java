package obiektowe.inheritance.animals;

public class ConstructorsDemo {

    public static void main(String[] args) {
        O o = new B();
    }

}

class O{

    public O(int number){
        System.out.println("Constructor O " + number);
    }

}

class A extends O{

    public A(String text) {
        super(100);
        System.out.println("Constructor A " + text);
    }

}

class B extends A {

    public B() {
        super("aaa");
        System.out.println("Constructor B");
    }

}
