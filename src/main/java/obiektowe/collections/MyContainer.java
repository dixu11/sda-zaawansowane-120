package obiektowe.collections;

public class MyContainer<E> {

    private E data;

    public void setData(E e){
        data = e;
    }

    public E getData() {
        return data;
    }
}
