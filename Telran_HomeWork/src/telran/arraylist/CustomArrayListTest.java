package telran.arraylist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomArrayListTest {

    @Test
    public void testSizeZero() {
        CustomArrayList al = new CustomArrayList();
        assertEquals(0, al.size());
    }

    @Test
    public void testSizeNotZero() {
        int[] ar = {1, 2, 3};
        CustomArrayList<Integer> al = new CustomArrayList<>();
        for (int a : ar) {
            al.append(a);
        }
        assertEquals(3, al.size());
    }

    @Test
    public void testGetAll() {
        int[] ar = {1, 2, 3};
        CustomArrayList<Integer> al = new CustomArrayList<>();
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
        CustomArrayList<Integer> al = new CustomArrayList<>();
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



}