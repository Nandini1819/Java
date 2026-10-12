import java.util.Scanner;
class Employee {
    private String name;
    private int employee_Id;
    private double monthly_Salary;

    Employee(String name, int employee_Id, double monthly_Salary) {
        this.name = name;
        this.employee_Id = employee_Id;
        this.monthly_Salary = monthly_Salary;
    }
    double calculate_AnnualSalary() {
        return monthly_Salary * 12;
    }
    void compare_Salary(Employee e) {
        if (this.calculate_AnnualSalary() > e.calculate_AnnualSalary()) {
            System.out.println(this.name + " earns more than " + e.name + ".");
        } else if (this.calculate_AnnualSalary() < e.calculate_AnnualSalary()) {
            System.out.println(e.name + " earns more than " + this.name + ".");
        } else {
            System.out.println(this.name + " and " + e.name
                    + " have equal annual salaries.");
        }
    }
    Employee Higher_Salary_Employee(Employee e) {
        if (this.calculate_AnnualSalary() >= e.calculate_AnnualSalary()) {
            return this;
        } else {
            return e;
        }
    }
    void display() {
        System.out.println("Highest-paid employee: " + name);
        System.out.println("Annual Salary: " + calculate_AnnualSalary());
    }
}

public class Compare_Employe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name1 = sc.next();
        System.out.print("Employee ID: ");
        int id1 = sc.nextInt();
        System.out.print("Monthly Salary: ");
        double salary1 = sc.nextDouble();
        
        Employee e1 = new Employee(name1, id1, salary1);
        System.out.print("Name: ");
        String name2 = sc.next();
        System.out.print("Employee ID: ");
        int id2 = sc.nextInt();
        System.out.print("Monthly Salary: ");
        double salary2 = sc.nextDouble();

        Employee e2 = new Employee(name2, id2, salary2);
        System.out.print("Name: ");
        String name3 = sc.next();
        System.out.print("Employee ID: ");
        int id3 = sc.nextInt();
        System.out.print("Monthly Salary: ");
        double salary3 = sc.nextDouble();

        Employee e3 = new Employee(name3, id3, salary3);
        e1.compare_Salary(e2);
        e2.compare_Salary(e3);

        Employee highest = e1.Higher_Salary_Employee(e2);
        highest = highest.Higher_Salary_Employee(e3);

        highest.display();

        sc.close();
    }
}
