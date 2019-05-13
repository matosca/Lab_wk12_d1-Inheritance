package management;

import staff.Employee;

public class Manager extends Employee {

    private String departmentName;

    public Manager(String name, String nin, Double salary, String departmentName) {
        super(name, nin, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
