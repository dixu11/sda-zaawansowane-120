package obiektowe.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

   private List<Integer> elements = new MyArrayList<>();

    @Test
    public void addShouldHandleFewElements() {
        elements.add(23);
        elements.add(11);
        elements.add(13);

        assertEquals(3,elements.size());
    }

    @Test
    public void addShouldHandleManyElements(){
        elements.add(23);
        elements.add(11);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);//11 elements

        assertEquals(11,elements.size());
    }

    @Test
    public void itsImpossibleToAddNullValue() {
        elements.add(null);
        assertEquals(0,elements.size());
    }


}