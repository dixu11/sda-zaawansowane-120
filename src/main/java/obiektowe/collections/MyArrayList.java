package obiektowe.collections;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private E[] elements = (E[]) new Object[10];
    private int actualSize = 0;


    @Override
    public boolean add(E e) {
        if (e == null) { //na razie nie akceptujemy nulli
            return false;
        }
        elements[actualSize++] = e;
        if (actualSize == elements.length) { //jeśli koniec miejsca - powiesz zbior
            grow();
        }
        return true;
    }

    private void grow() {  //dodaj 2x tyle miejsca
       /* E[] newArray = (E[]) new Object[elements.length*2];
       c for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
          elements = newArray;
        */

        elements = Arrays.copyOf(elements, elements.length * 2);
    }




   /* @Override
    public boolean add(E e) {
        if (e == null) { //na razie nie akceptujemy nulli
            return false;
        }

        for(int i = 0 ; i <elements.length; i++){ //przegladam wszystkie
            if (elements[i] == null) { // to z nullem oznacza wolne miejsce
                elements[i] = e; // wstawiam
                break;
            }
        }
        actualSize++;
        return true;
    }*/

    @Override
    public void add(int index, E element) {
        // 6 , 3, 4, 8    = 4 actualSize
        // 0   1  2  3

        // 6 , 3, 4, 8, 8
        // 6 , 3, 4, 4, 8
        // 6 , 3, 3, 4, 8
        // 6 , 9, 3, 4, 8
        for (int i = actualSize-1; i >= 0; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        actualSize++;
        if (actualSize == elements.length) { //jeśli koniec miejsca - powiesz zbior
            grow();
        }
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }
   /* @Override
    public int size() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) { // jestem przy ostatnim elemencie wiec i = size
                return i;
            }
        }
        return 0;
    }*/

    @Override
    public int size() {
        return actualSize;
    }


    @Override
    public boolean isEmpty() {
        return actualSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (E element : elements) {
            if (element == null) {
                break;
            }
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= actualSize) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
