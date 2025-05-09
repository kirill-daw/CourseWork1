import java.util.Objects;

public class Employee {
    private final String fullName;
    private int department;
    private float salary;
    private final int id;
    private static int count;

    public Employee(String fullName, int department, float salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++count;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(fullName, employee.fullName) && id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Name: " + fullName + "; department: " + department + "; salary: " + salary + "; id: " + id;
    }
}
