package GroupBHW03;

public class SalariedEmployee extends Employee {


    private int weeklySalary;

    public SalariedEmployee(String firstname, String lastName, String employeeID, int weeklySalary) {
        super( firstname, lastName, employeeID );
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void payCheck() {
        super.payCheck();
    }


}





