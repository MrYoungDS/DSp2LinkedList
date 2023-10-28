import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    private MyLinkedList smallMLL;
    private MyLinkedList bigMLL;

    @BeforeEach
    public void setup() {
        smallMLL = new MyLinkedList();
        bigMLL = new MyLinkedList();
    }

    @Test
    public void testEmptySizeGetAddFirstClear() {
        assertTrue(smallMLL.isEmpty(), "Linked list should be empty after being constructed.");
        assertEquals(0, smallMLL.size(), "Linked list should contain zero elements after being constructed.");

        smallMLL.addFirst(99);
        assertFalse(smallMLL.isEmpty(), "Linked list should not be empty.");
        assertEquals(99, smallMLL.get(0), "The element at index 0 should be 99.");
        assertEquals(1, smallMLL.size(), "The linked list should contain one element after addFirst.");

        smallMLL.addFirst(77);
        assertEquals(77, smallMLL.get(0), "The element at index 0 should be 77.");
        assertEquals(99, smallMLL.get(1), "The element at index 1 should be 99.");
        assertEquals(2, smallMLL.size(), "The linked list should contain two elements after addFirst.");

        smallMLL.addFirst(55);
        assertEquals(55, smallMLL.get(0), "The element at index 0 should be 55.");
        assertEquals(77, smallMLL.get(1), "The element at index 1 should be 77.");
        assertEquals(99, smallMLL.get(2), "The element at index 2 should be 99.");
        assertEquals(3, smallMLL.size(), "The linked list should contain three elements after addFirst.");

        smallMLL.clear();
        assertTrue(smallMLL.isEmpty(), "Array list should be empty after clear.");
        assertEquals(0, smallMLL.size(), "Array list should contain zero elements after clear.");
    }

    @Test
    public void testAddLast() {
        smallMLL.addLast(100);
        assertFalse(smallMLL.isEmpty(), "Linked list should not be empty.");
        assertEquals(100, smallMLL.get(0), "The element at index 0 should be 100.");
        assertEquals(1, smallMLL.size(), "The linked list should contain one element after addLast.");

        smallMLL.addLast(101);
        assertEquals(100, smallMLL.get(0), "The element at index 0 should be 100.");
        assertEquals(101, smallMLL.get(1), "The element at index 1 should be 101.");
        assertEquals(2, smallMLL.size(), "The linked list should contain two elements after addLast.");

        smallMLL.addLast(102);
        assertEquals(100, smallMLL.get(0), "The element at index 0 should be 100.");
        assertEquals(101, smallMLL.get(1), "The element at index 1 should be 101.");
        assertEquals(102, smallMLL.get(2), "The element at index 2 should be 102.");
        assertEquals(3, smallMLL.size(), "The linked list should contain three elements after addLast.");
    }

    @Test
    public void testAddSet() {
        smallMLL.add(0, 18);
        smallMLL.add(0, 45);
        smallMLL.add(1, 67);
        smallMLL.add(3, 73);
        smallMLL.add(2, 88); // 45, 67, 88, 18, 73

        assertEquals(5, smallMLL.size());
        assertEquals(45, smallMLL.get(0));
        assertEquals(67, smallMLL.get(1));
        assertEquals(88, smallMLL.get(2));
        assertEquals(18, smallMLL.get(3));
        assertEquals(73, smallMLL.get(4));

        smallMLL.set(0, 12);
        smallMLL.set(1, 22);
        smallMLL.set(4, 82);
        smallMLL.set(1, 37);
        smallMLL.set(4, 71); // 12, 37, 88, 18, 71

        assertEquals(5, smallMLL.size());
        assertEquals(12, smallMLL.get(0));
        assertEquals(37, smallMLL.get(1));
        assertEquals(88, smallMLL.get(2));
        assertEquals(18, smallMLL.get(3));
    }

    @Test
    public void testRemove() {
        smallMLL.addFirst(9);
        smallMLL.addFirst(77);
        smallMLL.addFirst(24);
        smallMLL.addFirst(36);
        smallMLL.addFirst(63);
        smallMLL.addFirst(89);
        smallMLL.addFirst(14); // 14, 89, 63, 36, 24, 77, 9

        assertEquals(7, smallMLL.size());
        assertEquals(14, smallMLL.get(0));
        assertEquals(89, smallMLL.get(1));
        assertEquals(63, smallMLL.get(2));
        assertEquals(36, smallMLL.get(3));
        assertEquals(24, smallMLL.get(4));
        assertEquals(77, smallMLL.get(5));
        assertEquals(9, smallMLL.get(6));

        smallMLL.remove(0); // 89, 63, 36, 24, 77, 9
        assertEquals(6, smallMLL.size());
        assertEquals(89, smallMLL.get(0));
        assertEquals(63, smallMLL.get(1));
        assertEquals(36, smallMLL.get(2));
        assertEquals(24, smallMLL.get(3));
        assertEquals(77, smallMLL.get(4));
        assertEquals(9, smallMLL.get(5));

        smallMLL.remove(5); // 89, 63, 36, 24, 77
        assertEquals(5, smallMLL.size());
        assertEquals(89, smallMLL.get(0));
        assertEquals(63, smallMLL.get(1));
        assertEquals(36, smallMLL.get(2));
        assertEquals(24, smallMLL.get(3));
        assertEquals(77, smallMLL.get(4));

        smallMLL.remove(2); // 89, 63, 24, 77
        assertEquals(4, smallMLL.size());
        assertEquals(89, smallMLL.get(0));
        assertEquals(63, smallMLL.get(1));
        assertEquals(24, smallMLL.get(2));
        assertEquals(77, smallMLL.get(3));

        smallMLL.remove(1); // 89, 24, 77
        assertEquals(3, smallMLL.size());
        assertEquals(89, smallMLL.get(0));
        assertEquals(24, smallMLL.get(1));
        assertEquals(77, smallMLL.get(2));

        smallMLL.remove(2); // 89, 24
        assertEquals(2, smallMLL.size());
        assertEquals(89, smallMLL.get(0));
        assertEquals(24, smallMLL.get(1));

        smallMLL.remove(0); // 24
        assertEquals(1, smallMLL.size());
        assertEquals(24, smallMLL.get(0));

        smallMLL.remove(0);
        assertTrue(smallMLL.isEmpty());
        assertEquals(0, smallMLL.size());
    }

    @Test
    public void testLargeSimple() {
        int max = 100000;
        for(int i = 0; i < max; i++){
            assertEquals(i, bigMLL.size());
            bigMLL.addLast(i);
        }
        for(int i = max; i > 0; i--){
            assertEquals(i, bigMLL.size());
            bigMLL.remove(i - 1);
        }
        for(int i = 0; i < max; i++){
            assertEquals(i, bigMLL.size());
            bigMLL.addFirst(i);
        }
        bigMLL.clear();
        assertTrue(bigMLL.isEmpty());
        assertEquals(0, bigMLL.size());
    }

    @Test
    public void testFinders() {
        smallMLL.addLast(21);
        smallMLL.addLast(-64);
        smallMLL.addLast(94);
        smallMLL.addLast(-72);
        smallMLL.addLast(84);
        smallMLL.addLast(-28);

        assertTrue(smallMLL.contains(21), "Contains cannot find element 21.");
        assertTrue(smallMLL.contains(-64), "Contains cannot find element -64.");
        assertTrue(smallMLL.contains(94), "Contains cannot find element 94.");
        assertTrue(smallMLL.contains(-72), "Contains cannot find element -72.");
        assertTrue(smallMLL.contains(84), "Contains cannot find element 84.");
        assertTrue(smallMLL.contains(-28), "Contains cannot find element -28.");

        assertFalse(smallMLL.contains(0), "Contains thinks it found element 0.");
        assertFalse(smallMLL.contains(-55), "Contains thinks it found element -55.");
        assertFalse(smallMLL.contains(60), "Contains thinks it found element 60.");
        assertFalse(smallMLL.contains(-38), "Contains thinks it found element -38.");
        assertFalse(smallMLL.contains(93), "Contains thinks it found element 93.");
        assertFalse(smallMLL.contains(Integer.MAX_VALUE), "Contains thinks it found a big element.");
        assertFalse(smallMLL.contains(Integer.MIN_VALUE), "Contains thinks it found a big negative element.");

        assertEquals(0, smallMLL.indexOf(21), "IndexOf cannot find element 21.");
        assertEquals(1, smallMLL.indexOf(-64), "IndexOf cannot find element -64.");
        assertEquals(2, smallMLL.indexOf(94), "IndexOf cannot find element 94.");
        assertEquals(3, smallMLL.indexOf(-72), "IndexOf cannot find element -72.");
        assertEquals(4, smallMLL.indexOf(84), "IndexOf cannot find element 84.");
        assertEquals(5, smallMLL.indexOf(-28), "IndexOf cannot find element -28.");

        assertEquals(-1, smallMLL.indexOf(0), "IndexOf thinks it found element 0.");
        assertEquals(-1, smallMLL.indexOf(-55), "IndexOf thinks it found element -55.");
        assertEquals(-1, smallMLL.indexOf(60), "IndexOf thinks it found element 60.");
        assertEquals(-1, smallMLL.indexOf(-38), "IndexOf thinks it found element -38.");
        assertEquals(-1, smallMLL.indexOf(93), "IndexOf thinks it found element 93.");
        assertEquals(-1, smallMLL.indexOf(Integer.MAX_VALUE), "IndexOf thinks it found a big element.");
        assertEquals(-1, smallMLL.indexOf(Integer.MIN_VALUE), "IndexOf thinks it found a big negative element.");
    }

    @Test
    public void testIndexOutOfBoundsException(){
        assertThrows(IndexOutOfBoundsException.class,
                () -> smallMLL.add(-1, 102),
                "Trying to add at index -1 should throw OOB.");
        assertThrows(IndexOutOfBoundsException.class,
                () -> smallMLL.add(2, 102),
                "Trying to add at index 2 after being constructed should throw OOB.");
        smallMLL.addLast(100);
        smallMLL.addLast(101);
        smallMLL.addLast(102);
        assertThrows(IndexOutOfBoundsException.class,
                () -> smallMLL.add(5, 105),
                "Trying to add at index 5 when size is three should throw OOB.");
    }

    @Test
    public void testNullPointerException(){
        smallMLL.addLast(300);
        smallMLL.addLast(301);
        smallMLL.addLast(302);
        assertThrows(NullPointerException.class,
                () -> smallMLL.addFirst(null),
                "Argument to addFirst cannot be null.");
        assertThrows(NullPointerException.class,
                () -> smallMLL.addLast(null),
                "Argument to addLast cannot be null.");
        assertThrows(NullPointerException.class,
                () -> smallMLL.add(1, null),
                "Argument to add cannot be null.");
        assertThrows(NullPointerException.class,
                () -> smallMLL.set(1, null),
                "Argument to add cannot be null.");
        assertThrows(NullPointerException.class,
                () -> smallMLL.indexOf(null),
                "Argument to indexOf cannot be null.");
        assertThrows(NullPointerException.class,
                () -> smallMLL.contains(null),
                "Argument to contains cannot be null.");
    }
}
