import java.util.Scanner;

public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        System.out.println("Employee Book");
        employees = new Employee[10];
        employees[0] = new Employee("Вивальди Антонио Борисович", 2, 32000);
        employees[1] = new Employee("Паганини Николо Иванович", 1, 38000);
        employees[2] = new Employee("Моцарт Амадей Филиппович", 4, 50000);
        employees[3] = new Employee("Бетховен Людвиг Борисович", 5, 40000);
        employees[4] = new Employee("Гайдн Йозев Петрович", 3, 66000);
        employees[5] = new Employee("Шуберт Франц Германович", 3, 49000);
        employees[6] = new Employee("Шуман Роберт Андреевич", 2, 55500);
        employees[7] = new Employee("Визе Робер Павлович", 1, 62000);
        employees[8] = new Employee("Ганц Циммер Олегович", 4, 50000);
        employees[9] = new Employee("Бах Иоганн Себастьянович", 5, 70000);
        System.out.println();

        System.out.println("Employees data:");
        employeesData();
        System.out.println();

        System.out.println("Sum expenses of salaries: " + sumExpensesOfSalaries());
        System.out.println();

        System.out.println("Minimum salary of an employee: " + minSalaryOfEmployee());
        System.out.println();

        System.out.println("Maximum salary of an employee: " + maxSalaryOfEmployee());
        System.out.println();

        float averageSalaryOfEmployee = sumExpensesOfSalaries() / employees.length;
        System.out.println("Average salary of employee: " + averageSalaryOfEmployee);
        System.out.println();

        System.out.println("Names of employees: ");
        printNamesOfEmployees();
        System.out.println();
    }

    public static void employeesData() {
        for (Employee value : employees) {
            System.out.println(value);
        }
    }

    public static float sumExpensesOfSalaries() {
        float sumExpensesForSalaries = 0;
        for (Employee value : employees) {
            if (value != null) {
                sumExpensesForSalaries += value.getSalary();
            }
        }
        return sumExpensesForSalaries;
    }

    public static float minSalaryOfEmployee() {
        float minSalaryOfEmployee = employees[0].getSalary();
        for (Employee value : employees) {
            if (value != null && value.getSalary() < minSalaryOfEmployee) {
                minSalaryOfEmployee = value.getSalary();
            }
        }
        return minSalaryOfEmployee;
    }

    public static float maxSalaryOfEmployee() {
        float maxSalaryOfEmployee = employees[0].getSalary();
        for (Employee value : employees) {
            if (value != null && value.getSalary() > maxSalaryOfEmployee) {
                maxSalaryOfEmployee = value.getSalary();
            }
        }
        return maxSalaryOfEmployee;
    }

    public static void printNamesOfEmployees() {
        for (Employee value : employees) {
            if (value != null) {
                System.out.println(value.getFullName());
            }
        }
    }
}