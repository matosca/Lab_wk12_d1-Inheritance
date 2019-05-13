import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Lidia", "ra242424d", 25.0);
    }

    @Test
    public void hasName(){
        assertEquals("Lidia", databaseAdmin.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("ra242424d", databaseAdmin.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(25.0, databaseAdmin.getSalary(), 0.1);
    }
}
