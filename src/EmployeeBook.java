import java.util.Scanner;

public class EmployeeBook {
    private static Employee[] employees;

    public void getEmployees() {
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
    }

    public void employeesData() {
        for (Employee value : employees) {
            System.out.println(value);
        }
    }

    public float sumExpensesOfSalariesInMonth() {
        float sumExpensesForSalaries = 0;
        for (Employee value : employees) {
            if (value != null) {
                sumExpensesForSalaries += value.getSalary();
            }
        }
        return sumExpensesForSalaries;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee minSalaryOfEmployee = employees[0];
        for (Employee value : employees) {
            if (value != null && value.getSalary() < minSalaryOfEmployee.getSalary()) {
                minSalaryOfEmployee = value;
            }
        }
        return minSalaryOfEmployee;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryOfEmployee = employees[0];
        for (Employee value : employees) {
            if (value != null && value.getSalary() > maxSalaryOfEmployee.getSalary()) {
                maxSalaryOfEmployee = value;
            }
        }
        return maxSalaryOfEmployee;
    }

    public void averageSalaryOfEmployee() {
        float averageSalaryOfEmployee = sumExpensesOfSalariesInMonth() / employees.length;
        System.out.println("Average salary of employee: " + averageSalaryOfEmployee);
    }

    public void printNamesOfEmployees() {
        for (Employee value : employees) {
            if (value != null) {
                System.out.println(value.getFullName());
            }
        }
    }

    public void indexingSalariesAndPrint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter percent of indexing: ");
        float percent = scanner.nextFloat();
        System.out.println("Indexing salaries of employees: ");
        for (Employee value : employees) {
            if (value != null) {
                float upSalary = value.getSalary() + (value.getSalary() * (percent / 100));
                value.setSalary(upSalary);
                System.out.println(value.getFullName() + ": " + value.getSalary());
            }
        }
    }

    public void findMinSalaryInDepartment(int department) {
        Employee minSalaryEmployeeInDepartment = findEmployeeWithMaxSalary();
        for (Employee value : employees) {
            if (value != null && value.getDepartment() == department && value.getSalary() < minSalaryEmployeeInDepartment.getSalary()) {
                minSalaryEmployeeInDepartment = value;
            }
        }
        if (minSalaryEmployeeInDepartment.getDepartment() != department) {
            minSalaryEmployeeInDepartment = null;
        }
        System.out.println("Employee with min salary in " + department + " department: " + minSalaryEmployeeInDepartment);
    }

    public void findMaxSalaryInDepartment(int department) {
        Employee maxSalaryEmployeeInDepartment = findEmployeeWithMinSalary();
        for (Employee value : employees) {
            if (value != null && value.getDepartment() == department && value.getSalary() > maxSalaryEmployeeInDepartment.getSalary()) {
                maxSalaryEmployeeInDepartment = value;
            }
        }
        if (maxSalaryEmployeeInDepartment.getDepartment() != department) {
            maxSalaryEmployeeInDepartment = null;
        }
        System.out.println("Employee with max salary in " + department + " department: " + maxSalaryEmployeeInDepartment);
    }

    public void calculateSumExpensesForDepartment(int department) {
        float sumSalariesInDepartment = 0;
        for (Employee value : employees) {
            if (value != null && value.getDepartment() == department) {
                sumSalariesInDepartment += value.getSalary();
            }
        }
        System.out.println("Total salary costs in " + department + " department: " + sumSalariesInDepartment);
    }

    public void calculateAverageSalaryInDepartment(int department) {
        int count = 0;
        float sumSalariesInDepartment = 0;
        for (Employee value : employees) {
            if (value != null && value.getDepartment() == department) {
                count++;
                sumSalariesInDepartment += value.getSalary();
            }
        }
        float averageSalaryInDepartment = sumSalariesInDepartment / count;
        System.out.println("Average salary in " + department + " department: " + averageSalaryInDepartment);
    }

    public void indexingSalariesInDepartment(int department, float percent) {
        System.out.println("Indexing salaries of employees: ");
        for (Employee value : employees) {
            if (value != null && value.getDepartment() == department) {
                float upSalary = value.getSalary() + (value.getSalary() * (percent / 100));
                value.setSalary(upSalary);
                System.out.println(value.getFullName() + ": " + value.getSalary());
            }
        }
    }

    public void employeesInDepartment(int department) {
        for (Employee value : employees) {
            if (value != null && value.getDepartment() == department) {
                System.out.println("Name: " + value.getFullName() + "; salary: " + value.getSalary() + "; id: " + value.getId());
            }
        }
    }

    public void employeesWhichSalaryLessANumber(float number) {
        for (Employee value : employees) {
            if (value != null && value.getSalary() < number) {
                System.out.println("Name: " + value.getFullName() + "; salary: " + value.getSalary() + "; id: " + value.getId());
            }
        }
    }

    public void employeesWhichSalaryMoreANumber(float number) {
        for (Employee value : employees) {
            if (value != null && value.getSalary() >= number) {
                System.out.println("Name: " + value.getFullName() + "; salary: " + value.getSalary() + "; id: " + value.getId());
            }
        }
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Employee " + employees[i].getFullName() + " was deleted");
                employees[i] = null;
                break;
            }
        }
    }

    public void getEmployee(int id) {
        for (Employee value : employees) {
            if (value != null && value.getId() == id) {
                System.out.println(value);
            }
        }
    }
}