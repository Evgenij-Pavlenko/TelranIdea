import de.telran.entity.ImageDescriptor;
import de.telran.service.FileService;
import de.telran.service.ImageDescriptorService;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class ImageDescriptorServiceTest {

    //mock creation
    FileService fileService = mock(FileService.class);

    @Test
    public void testGetEmptyImageDescriptors(){
        //configure mocks
        when(fileService.loadStringsFromFile("testFile.txt")).thenReturn(Collections.emptyList());

        //execute testing code

        ImageDescriptorService service = new ImageDescriptorService(fileService);
        List<ImageDescriptor> imageDescriptors = service.getImageDescriptors("testFile.txt");
        //assert result
        assertTrue(imageDescriptors.isEmpty());
        verify(fileService, times(1)).loadStringsFromFile("testFile.txt");
    }

    @Test
    public void testGetImageDescriptors(){
        //configure mocks
        when(fileService.loadStringsFromFile("testFile.txt")).thenReturn(createTestString());

        //execute testing code

        ImageDescriptorService service = new ImageDescriptorService(fileService);
        List<ImageDescriptor> imageDescriptors = service.getImageDescriptors("testFile.txt");
        //assert result
        System.out.println(imageDescriptors);
        assertFalse(imageDescriptors.isEmpty());
        assertEquals(2, imageDescriptors.size());
        assertEquals("abc", imageDescriptors.get(0).getImageUrlName());
        assertEquals("PREVIEW", imageDescriptors.get(0).getActionName());
        assertEquals("defr", imageDescriptors.get(1).getImageUrlName());
        assertEquals("THRUMBNAIL", imageDescriptors.get(1).getActionName());
    }
    public static List<String> createTestString(){
        return Arrays.asList("abc;PREVIEW", "defr;THRUMBNAIL");
    }
    private static List<ImageDescriptor> createTestImageDescriptors(){
         return Arrays.asList(
                new ImageDescriptor("abc", "PREVIEW"),
                new ImageDescriptor("defr", "THRUMBNAIL"));
    }
}
