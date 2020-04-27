package telran.Linkedlist20200427;

import org.junit.Test;
import telran.arraylist.CustomArrayList;

import static org.junit.Assert.*;

public class CustomLinkedListTest {

    @Test
    public void testSizeZero() {
        CustomLinkedList al = new CustomLinkedList();
        assertEquals(0, al.size());
    }

    @Test
    public void testSizeNotZero() {
        int[] ar = {1, 2, 3};
        CustomLinkedList<Integer> al = new CustomLinkedList<>();
        for (int a : ar) {
            al.append(a);
        }
        assertEquals(3, al.size());
    }

    @Test
    public void appendOneElemTest() {
        CustomLinkedList<String> cl = new CustomLinkedList<>();
        cl.append("test");
        assertEquals("size", 1, cl.size());
    }

    @Test
    public void testGetAll() {
        int[] ar = {1, 2, 3};
        CustomLinkedList<Integer> al = new CustomLinkedList<>();
        for (int a : ar) {
            al.append(a);
        }
        for (int i = 0; i < ar.length; i++) {
            assertEquals(ar[i], al.get(i).intValue());
        }

    }

    @Test
    public void testRemoveById() {
        int[] input = {1, 2, 3, 4};
        CustomLinkedList<Integer> ll = new CustomLinkedList<>();
        for (int a : input) {
            ll.append(a);
        }
        Integer expectedDeletedItem = ll.removeById(2);
        int[] expected = {1, 2, 4};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], ll.get(i).intValue());
        }
        assertEquals(3, ll.size());
        assertEquals(3, expectedDeletedItem.intValue());
    }


    @Test
    public void testRemoveByElementTrue() {
        String[] input = {"aa", "bb", "cc", "dd"};
        CustomLinkedList<String> ll = new CustomLinkedList<>();
        for (String a : input) {
            ll.append(a);
        }
        boolean expectedDeletedItem = ll.remove("cc");
        String[] expected = {"aa", "bb", "dd"};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], ll.get(i));
        }
        assertEquals(3, ll.size());
        assertTrue(expectedDeletedItem);
    }

    @Test
    public void testRemoveByElementFalse() {
        String[] input = {"aa", "bb", "cc", "dd"};
        CustomLinkedList<String> ll = new CustomLinkedList<>();
        for (String a : input) {
            ll.append(a);
        }
        boolean expectedDeletedItem = ll.remove("ff");
        String[] expected = {"aa", "bb", "cc", "dd"};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], ll.get(i));
        }
        assertEquals(4, ll.size());
        assertFalse(expectedDeletedItem);
    }
}