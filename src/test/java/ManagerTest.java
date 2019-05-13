import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Ben", "AA999245J", 14.5, "Artificial Intelligence");
    }

    @Test
    public void hasName(){
        assertEquals("Ben", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Barker");
        assertEquals("Barker", manager.getName());
    }

    @Test
    public void cannotChangeName(){
        manager.setName(null);
        assertEquals("Ben", manager.getName());
    }

    @Test
    public void hasNIN(){
        assertEquals("AA999245J", manager.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(14.5, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Artificial Intelligence", manager.getDepartmentName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.5);
        assertEquals(16.0, manager.getSalary(), 0.1);
    }

    @Test
    public void cannotDecreaseSalary(){
        manager.raiseSalary(-1.5);
        assertEquals(14.5, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.145, manager.payBonus(), 0.1);
    }

}
