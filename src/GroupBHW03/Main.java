package GroupBHW03;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee( "Malcolm","Cajuste","01234" );
        SalariedEmployee salariedEmployee = new SalariedEmployee( "Marcus","Cajuste","02468",35000 );
        CommisionEmployee commisionEmployee = new CommisionEmployee( "David","Cajuste","013579" );
        BasePlusEmployee basePlusEmployee = new BasePlusEmployee( "Ruth","Cajuste","13456" );
        Employee [] employees ={salariedEmployee, commisionEmployee, basePlusEmployee};



        for(Employee x :employees){
            System.out.println(x);
        }





    }


}
