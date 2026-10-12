package employee;

public class Main {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(
                101,
                "Pavarna",
                "pavarna@gmail.com",
                "Female",
                50000
        );

        Employee e2 = new Employee(
                102,
                "Uday",
                "uday@gmail.com",
                "Male",
                45000
        );

        Employee e3 = new Employee(
                103,
                "Pranu",
                "pranu@gmail.com",
                "Female",
                55000
        );

        System.out.println("URK23CS1134");

        System.out.println("Employee 1 added : " + db.addEmployee(e1));
        System.out.println("Employee 2 added : " + db.addEmployee(e2));
        System.out.println("Employee 3 added : " + db.addEmployee(e3));

        System.out.println();

        System.out.println("Employee Details:");

        e1.GetEmployeeDetails();
        e2.GetEmployeeDetails();
        e3.GetEmployeeDetails();

        System.out.println("Payslip:");
        System.out.println(db.showPaySlip(102));

        System.out.println();

        System.out.println("Deleting Employee 102...");
        System.out.println("Deleted : " + db.deleteEmployee(102));

        System.out.println();

        System.out.println("Searching Employee 102:");
        System.out.println(db.showPaySlip(102));
    }
}