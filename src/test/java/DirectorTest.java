import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Maria", "hd747474i", 57.0, "Front End", 50.0);

    }

    @Test
    public void hasName(){
        assertEquals("Maria", director.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("hd747474i", director.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(57.0, director.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Front End", director.getDepartmentName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10.0);
        assertEquals(67.0, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1.14, director.payBonus(), 0.1);
    }

    @Test
    public void hasBudget(){
        assertEquals(50.0, director.getBudget(), 0.1);
    }

}
