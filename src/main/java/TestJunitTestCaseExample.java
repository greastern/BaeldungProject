import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestJunitTestCaseExample {

    JunitTestCaseExample obj = new JunitTestCaseExample();

    @Test
    void remove() {
        obj.add("Antonio");
        obj.add("Paul");
        obj.remove("Paul");
        assertEquals(1, obj.sizeOfStudent());
    }

    @Test
    void add() {
        obj.add("Emma");
        obj.add("Ronan");
        obj.add("Antonio");
        obj.add("Paul");
        assertEquals( 4, obj.sizeOfStudent());
    }

    @Test
    void removeAll() {
        obj.removeAll();
    }

    @Test
    void sizeOfStudent() {
        obj.add("Emma");
        obj.add("Ronan");
        obj.add("Antonio");
        assertEquals(3, obj.sizeOfStudent());
    }
}