package l.done;

public class Employee extends Pay {

    public Employee manager;

    Employee() {
        super(12.50, 2.0);
    }

    Employee(Double baseAmount, Double rankRate) {
        super(baseAmount, rankRate);
    }

    public void assignManager(Employee manager){
        this.manager = manager;
    }

    public void calculatePerHourRate(int rank){
        double baseAmount = 12.50;
        salary = baseAmount + (rank * 2);
    }
}
