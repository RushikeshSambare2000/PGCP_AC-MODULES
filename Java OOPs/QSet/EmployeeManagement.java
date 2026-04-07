import java.util.*;

class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display method
    void display() {
        System.out.println(name + ":" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> empList = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Dynamic input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // consume newline

            empList.add(new Employee(name, salary));
        }

        // Display employees
        System.out.println("\nEmployee List:");
        for (Employee e : empList) {
            e.display();
        }
    }
}