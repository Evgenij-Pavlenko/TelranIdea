import de.telran.service.ConfigService;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConfigServiceTest {
    ConfigService service;

    @Before
    public void setUp() throws Exception{
        service = new ConfigService();
    }

    @Test
    public void testGetPathSeparator(){
        String pathSeparator = service.getPathSeparator();
        assertTrue(";". equals(pathSeparator));
    }

    @Test
    public void testGetToPathToSavedImages(){
        String pathSeparator = service.getToPathToSavedImages();
        assertTrue("c:\\Users\\evgen\\Downloads\\images\\". equals(pathSeparator));
    }
}
