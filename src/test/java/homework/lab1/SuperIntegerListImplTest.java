package homework.lab1;

import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SuperIntegerListImplTest {

    @Test
    public void addGetElements() {
        SuperIntegerListImpl superIntegerList = new SuperIntegerListImpl();
        assertThrows(IndexOutOfBoundsException.class, () -> superIntegerList.get(0), "List is empty");
        superIntegerList.add(1);
        assertEquals("First element is equal to 1", 1, superIntegerList.get(0));
        superIntegerList.add(2);
        assertEquals("Second element is equal to 2", 2, superIntegerList.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> superIntegerList.get(2), "List doesn't have third argument");
    }

    @Test
    public void removeElementsByValue() {
        SuperIntegerListImpl superIntegerList = new SuperIntegerListImpl();
        superIntegerList.add(1);
        superIntegerList.add(1);
        superIntegerList.add(2);
        superIntegerList.add(1);
        superIntegerList.add(2);
        superIntegerList.removeByValue(1);
        assertThrows(IndexOutOfBoundsException.class, () -> superIntegerList.get(2), "List doesn't have third argument after first removal");
        assertEquals("Second element is equal to 2 after first removal", 2, superIntegerList.get(1));
        superIntegerList.removeByValue(3);
        assertThrows(IndexOutOfBoundsException.class, () -> superIntegerList.get(2), "List doesn't have third argument after second removal");
        assertEquals("First element is equal to 2 after second removal", 2, superIntegerList.get(0));
        assertEquals("Second element is equal to 2 after second removal", 2, superIntegerList.get(1));
        superIntegerList.removeByValue(2);
        assertThrows(IndexOutOfBoundsException.class, () -> superIntegerList.get(0), "List is empty");
        superIntegerList.add(1);
        assertEquals("First element is equal to 1 after third removal", 1, superIntegerList.get(0));
    }

    @Test
    public void removeElementsByIndex() {
        SuperIntegerListImpl superIntegerList = new SuperIntegerListImpl();
        superIntegerList.add(1);
        superIntegerList.add(2);
        superIntegerList.add(3);
        superIntegerList.add(4);
        superIntegerList.add(5);
        superIntegerList.removeByIndex(2);
        assertEquals("Second element is equal to 2", 2, superIntegerList.get(1));
        assertEquals("Third element is equal to 4", 4, superIntegerList.get(2));
        assertThrows(IndexOutOfBoundsException.class, () -> superIntegerList.removeByIndex(4), "List doesn't have fifth argument");
        assertThrows(IndexOutOfBoundsException.class, () -> superIntegerList.removeByIndex(-1), "List doesn't have negative arguments");
        superIntegerList.removeByIndex(0);
        assertEquals("First element is equal to 2", 2, superIntegerList.get(0));
    }

    @Test
    public void checkOutput() {
        PrintStream save_out = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        SuperIntegerListImpl superIntegerList = new SuperIntegerListImpl();
        superIntegerList.add(1);
        superIntegerList.add(2);
        superIntegerList.add(3);
        superIntegerList.add(4);
        superIntegerList.add(5);
        superIntegerList.printAll();
        assertEquals("1 2 3 4 5 \n", out.toString());
        System.setOut(save_out);
    }
}
