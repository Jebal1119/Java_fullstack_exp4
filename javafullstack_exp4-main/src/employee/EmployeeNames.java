package employee;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeNames {

    public static void main(String[] args) {

        HashSet<String> employeeNames = new HashSet<>();

        employeeNames.add("Pavarna");
        employeeNames.add("Uday");
        employeeNames.add("Sainath");
        employeeNames.add("Pranu");
        employeeNames.add("URK23CS1134");

        Iterator<String> iterator = employeeNames.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
