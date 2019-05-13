package staff;

public abstract class Employee {
    private String name;
    private String nin;
    public Double salary;

    public Employee(String name, String nin, Double salary) {
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNin() {
        return nin;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void raiseSalary(Double increment) {
        if (!(increment < 0)) {
            this.salary += increment;
        }
    }

    public Double payBonus(){
        return this.salary / 100;
    }


}
