package management;

public class Director extends Manager{
    private Double budget;

    public Director(String name, String nin, Double salary, String departmentName, Double budget){
        super(name, nin, salary, departmentName);
        this.budget = budget;
    }



    public Double getBudget() {
        return budget;
    }

    public Double payBonus(){
        return salary / 100 * 2;
    }
}
