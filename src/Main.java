public class Main {
    public static void main(String[] args) {
        System.out.println("Employee Book");
        Employee[] employees = new Employee[10];
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

        System.out.println("Employees data:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        int sumExpensesForSalaries = 0;
        for (Employee employee : employees) {
            sumExpensesForSalaries += employee.getSalary();
        }
        System.out.println("Sum expenses for salaries: " + sumExpensesForSalaries);

        int maxSalaryOfEmployee = 0;
        for (Employee value : employees) {
            if (value.getSalary() > maxSalaryOfEmployee) {
                maxSalaryOfEmployee = value.getSalary();
            }
        }
        int minSalaryOfEmployee = maxSalaryOfEmployee;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryOfEmployee) {
                minSalaryOfEmployee = employee.getSalary();
            }
        }
        System.out.println("Minimum salary of an employee: " + minSalaryOfEmployee);
        System.out.println("Maximum salary of an employee: " + maxSalaryOfEmployee);

        float averageSalaryOfEmployee = (float) sumExpensesForSalaries / employees.length;
        System.out.println("Average salary of employee: " + averageSalaryOfEmployee);

        System.out.println("Names of employees: ");
        printNamesOfEmployees(employees);
    }

    public static void printNamesOfEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}