import org.example.Queue.MyQueue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyQueueTest {


    @Test
    public void TestMyListAddEl() {
        MyQueue mq = new MyQueue(3);
        mq.push(1);
        mq.push(2);
        mq.push(3);

        assertEquals(1, mq.peek());
    }


    @Test
    public void TestMyQueueDeleteEl() {
        MyQueue mq = new MyQueue(3);
        mq.push(1);
        mq.push(2);
        mq.push(3);
        mq.deleteFront();
        mq.deleteFront();
        assertEquals(1, mq.size());
    }


    @Test
    public void TestMyListIsFull() {
        MyQueue mq = new MyQueue(3);
        mq.push(1);
        mq.push(2);
        mq.push(3);
        assertEquals(true, mq.isFull());
    }
}
