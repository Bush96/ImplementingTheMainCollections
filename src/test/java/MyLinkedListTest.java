import org.example.ArrayLists.MyArrayList;
import org.example.LinkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class MyLinkedListTest {

    @Test
    public void testMyLinkedListAdd() {
        LinkedList myList = new LinkedList();
        myList.addNode(14);
        myList.addNode(2);
        myList.addNode(11);
        myList.addNode(123);

        assertEquals(myList.getSize(),4);
    }

    @Test
    public void testDeleteInLinedList() {
        LinkedList myList = new LinkedList();
        myList.addNode(14);
        myList.addNode(2);
        myList.addNode(11);

        myList.delete(1);
        assertSame(myList.getSize(), 2);
    }

    @Test
    public void testUpdateObjectInLinkedList (){
        LinkedList myList = new LinkedList();
        myList.addNode(14);
        myList.addNode(2);
        myList.addNode(11);

        myList.uploadNodeWithValue(1,2);
        assertEquals(myList.findNodeByPosition(2), 1);
    }

}


