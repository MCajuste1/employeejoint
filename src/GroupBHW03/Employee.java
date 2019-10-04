package GroupBHW03;

public class Employee {

    private String firstname;
    private String LastName;
    private String EmployeeID;

    public Employee(String firstname, String lastName, String employeeID) {
        this.firstname = firstname;
        LastName = lastName;
        EmployeeID = employeeID;

    }

    public void payCheck(){




    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", LastName='" + LastName + '\'' +
                ", EmployeeID='" + EmployeeID + '\'' +
                '}';
    }
}
