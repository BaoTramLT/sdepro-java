package lab_09;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee A = new Fulltime();
        Employee B = new Fulltime();
        Employee C = new Contractor();
        Employee D = new Contractor();

        List<Employee> employeeList = Arrays.asList(A, B, C, D);

        int totalSalary = new EmployeeController().caculateTotalSalary(employeeList);
        System.out.println("Total salary is: " +totalSalary);
    }
}
