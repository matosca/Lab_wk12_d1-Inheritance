import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Rob", "jj345678p", 25.0);
    }

    @Test
    public void hasName(){
        assertEquals("Rob", developer.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("jj345678p", developer.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(25.0, developer.getSalary(), 0.1);
    }

}
