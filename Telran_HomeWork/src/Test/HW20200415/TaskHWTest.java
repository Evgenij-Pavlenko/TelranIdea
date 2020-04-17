package Test.HW20200415;

import org.junit.Test;

import static Test.Task.isStringIsMutationEachOther;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TaskHWTest {


    @Test
    public void testIsStringIsMutationEachOther2True3() {
        String s1 = "hell";
        String s2 = "ohlle";
        assertTrue(isStringIsMutationEachOther(s1, s2));
    }


    @Test
    public void testIsStringIsMutationEachOther2False4() {
        String s1 = "hello";
        String s2 = "hillo";
        assertFalse(isStringIsMutationEachOther(s1, s2));
    }

    @Test
    public void testIsStringIsMutationEachOther2True5() {
        String s1 = "hello";
        String s2 = "hleo";
        assertTrue(isStringIsMutationEachOther(s1, s2));
    }
    @Test
    public void testIsStringIsMutationEachOther2False6() {
        String s1 = "hello";
        String s2 = "hleol";
        assertFalse(isStringIsMutationEachOther(s1, s2));
    }
}
