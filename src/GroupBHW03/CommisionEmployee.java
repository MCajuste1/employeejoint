package GroupBHW03;

public class CommisionEmployee extends Employee {

    private int grossSales;
    private int commissionRate;


    public CommisionEmployee(String firstname, String lastName, String employeeID) {
        super( firstname, lastName, employeeID );
    }


    @Override
    public String toString() {
        return "CommisionEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    @Override
    public void payCheck() {
        super.payCheck();
    }
}

