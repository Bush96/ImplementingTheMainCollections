import org.example.Map.MyMap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMapTest {


    @Test
    public void testMyMapPut(){
        MyMap mm = new MyMap();
        mm.put("testKey1", 1);
        mm.put("testKey2", 2);
        mm.put("testKey3", 3);
        assertEquals(1, mm.get("testKey1"));

    }
    @Test
    public void testMyMapSize(){
        MyMap mm = new MyMap();
        mm.put("testKey1", 1);
        mm.put("testKey2", 2);
        mm.put("testKey3", 3);
        assertEquals(3, mm.size());

    }

    @Test
    public void testMyMapRemove(){
        MyMap mm = new MyMap();
        mm.put("testKey1", 1);
        mm.put("testKey2", 2);
        mm.put("testKey3", 3);
        mm.remove("testKey2");
        assertEquals(2, mm.size());

    }
}
