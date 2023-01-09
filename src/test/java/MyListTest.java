import org.example.ArrayLists.MyArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {

    @Test
    public void testMyListAdd() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("three");

        assertEquals(strings.size(),3);
    }

    @Test
    public void testMyListGet() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("three");

        assertEquals("three", strings.get(2));
    }

    @Test
    public void testMyListSize() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("three");

        assertEquals(3, strings.size());
    }

    @Test
    public void testMyListDelete() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("three");

       strings.delete(1);
       assertSame("three", strings.get(1));
    }

    @Test
    public void testMyListUpdate() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("three");

        strings.update(0,"test");
        assertEquals("Updating 1st element from-fist- to -test- ","test", strings.get(0));
    }
}