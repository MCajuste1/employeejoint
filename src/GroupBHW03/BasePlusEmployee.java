package GroupBHW03;

public class BasePlusEmployee extends CommisionEmployee {

    private int baseSalary;




    public BasePlusEmployee(String firstname, String lastName, String employeeID) {
        super( firstname, lastName, employeeID );
    }

    @Override
    public String toString() {
        return "BasePlusEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public void payCheck() {
        super.payCheck();
    }
}
