import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Employee Book");
        Scanner scanner = new Scanner(System.in);
        EmployeeBook employeeBook = new EmployeeBook();

        System.out.println("Employees data:");
        employeeBook.employeesData();
        System.out.println();

        System.out.println("Sum expenses of salaries in month: " + employeeBook.sumExpensesOfSalariesInMonth());
        System.out.println();

        System.out.println("Employee with min salary: " + employeeBook.findEmployeeWithMinSalary());
        System.out.println();

        System.out.println("Employee with max salary: " + employeeBook.findEmployeeWithMaxSalary());
        System.out.println();

        employeeBook.averageSalaryOfEmployee();
        System.out.println();

        System.out.println("Names of employees: ");
        employeeBook.printNamesOfEmployees();
        System.out.println();

        System.out.println("Enter percent of indexing: ");
        float percent = scanner.nextFloat();
        employeeBook.indexingSalariesAndPrint(percent);
        System.out.println();

        System.out.println("Enter department: ");
        int department = scanner.nextInt();
        employeeBook.findMinSalaryInDepartment(department);
        employeeBook.findMaxSalaryInDepartment(department);
        employeeBook.calculateSumExpensesForDepartment(department);
        employeeBook.calculateAverageSalaryInDepartment(department);

        System.out.println("Enter department: ");
        department = scanner.nextInt();
        System.out.println("Enter percent of indexing: ");
        percent = scanner.nextFloat();
        employeeBook.indexingSalariesInDepartment(department, percent);
        System.out.println();

        System.out.println("Enter department: ");
        department = scanner.nextInt();
        employeeBook.employeesInDepartment(department);
        System.out.println();

        System.out.println("Enter a number: ");
        float number = scanner.nextFloat();
        System.out.println("Employees which salary less a number: ");
        employeeBook.employeesWhichSalaryLessANumber(number);
        System.out.println();
        System.out.println("Employees which salary more a number: ");
        employeeBook.employeesWhichSalaryMoreANumber(number);
        System.out.println();

        Employee employee = new Employee("Мусоргский Модест Петрович", 3, 100000);
        System.out.println(employeeBook.addEmployee(employee));
        System.out.println();

        System.out.println("Enter the employee's id: ");
        int id = scanner.nextInt();
        employeeBook.deleteEmployee(id);
        System.out.println();

        System.out.println(employeeBook.addEmployee(employee));
        System.out.println();

        System.out.println("Enter employee's id: ");
        id = scanner.nextInt();
        employeeBook.getEmployee(id);
    }
}