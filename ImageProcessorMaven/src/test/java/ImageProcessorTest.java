import de.telran.ImageProcessor;
import de.telran.entity.DownloadedImage;
import de.telran.entity.ImageDescriptor;
import de.telran.service.DownloadService;
import de.telran.service.FileService;
import de.telran.service.ImageDescriptorService;
import de.telran.service.ImageService;
import org.junit.Before;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ImageProcessorTest {

    ImageDescriptorService imageDescriptorService = mock(ImageDescriptorService.class);
    DownloadService downloadService = mock(DownloadService.class);
    ImageService imageService = mock(ImageService.class);
    FileService fileService = mock(FileService.class);

    ImageProcessor processor;

    @Before
    public void setUp() {
        processor = new ImageProcessor(imageDescriptorService, downloadService, fileService, imageService);

    }

    @Test
    public void testDoProcessing() {
        //configure mock
        List<ImageDescriptor> testImageDescriptors = createTestImageDescriptors();
        when(imageDescriptorService.getImageDescriptor(any())).thenReturn(testImageDescriptors);
        when(downloadService.downloadImages(any())).thenReturn(createDownloadedImage());

//        when(downloadService.downloadImages(any())).thenReturn(); - ничего не надо передавать?
//        when(fileService.loadStringsFromFile(any())).thenReturn();

        //execute test method
        processor.doProcessimg("test.txt");

        //verify
        verify(imageDescriptorService, times(1)).getImageDescriptor("test.txt");
        verify(downloadService, times(1)).downloadImages(testImageDescriptors
                .
        verify(fileService, times(2)).saveImageAsFile(any());
    }

    private static List<DownloadedImage> createDownloadedImage(){
        return Arrays.asList(
                new DownloadedImage(null, true, new ImageDescriptor("http://server.com/image1.jpg", "PREVIEW")),
                new DownloadedImage(null, true,  new ImageDescriptor("http://server.com/image2.jpg", "THRUMBNAIL")));
    }
    private static List<ImageDescriptor> createTestImageDescriptors() {
        return Arrays.asList(
                new ImageDescriptor("http://server.com/image1.jpg", "PREVIEW"),
                new ImageDescriptor("http://server.com/image2.jpg", "THRUMBNAIL"));
    }
//    private  static List<DownloadedImage> createTestUrlList(){ - а тут никак. Похоже и без этого работает.
//        return Arrays.asList(new DownloadedImage(new BufferedImage(ImageIO.read(URL)), true));
//    }
}
