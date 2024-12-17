package pryanimales;

import org.junit.Test;
import static org.junit.Assert.*;

public class proAnimalesTest {
    
    public proAnimalesTest() {
    }

    @Test
    public void testEdad() {
        System.out.println("edad");
        int edad =-1;
        proAnimales instance = new proAnimales("capybara",edad);
        instance.edad();
      // fail("The test case is a prototype.");
    }
}
