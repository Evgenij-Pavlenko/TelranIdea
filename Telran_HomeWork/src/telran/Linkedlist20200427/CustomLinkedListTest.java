package telran.Linkedlist20200427;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        CustomLinkedList<Integer> al = new CustomLinkedList<>();
        for (int a : input) {
            al.append(a);
        }
        Integer expectedDeletedItem = al.removeById(2);
        int[] expected = {1, 2, 4};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], al.get(i).intValue());
        }
        assertEquals(3, al.size());
        assertEquals(3, expectedDeletedItem.intValue());
    }
    @Test
    public void appendOneElemTest(){
        CustomLinkedList<String> cl = new CustomLinkedList<>();
        cl.append("test");
        assertEquals("size",1, cl.size());
    }
}