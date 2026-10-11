import java.util.Scanner;
public class Employee {
    private String employe_name;
    private int employe_id;
    private double monthly_salary;
    private int perfomance_rating;

    Employee(String employe_name, int employe_id, double monthly_salary, int perfomance_rating){
        this.employe_name = employe_name;
        this.employe_id = employe_id;
        this.monthly_salary = monthly_salary;
        this.perfomance_rating = perfomance_rating;
    }
    public double calculate_annual_salary(){
        return monthly_salary*12;
    }
    public double calculate_bonus(){
        double bonus_percentage = 0;
        if(perfomance_rating==5){
            bonus_percentage = 20;
        }
        else if(perfomance_rating==4){
            bonus_percentage = 15;
        }
        else if(perfomance_rating==3){
            bonus_percentage = 10;
        }
        else if(perfomance_rating==2){
            bonus_percentage = 5;
        }
        else if(perfomance_rating==1){
            bonus_percentage=0;
        }
        return calculate_annual_salary()*bonus_percentage/100;
    }
    void display(){
        double annual_salary = calculate_annual_salary();
        double annual_bonus = calculate_bonus();
        double total_compensation = annual_salary + annual_bonus;
        System.out.println("Employee Name:"+employe_name);
        System.out.println("Employee ID:"+employe_id);
        System.out.println("Monthly Salary:"+monthly_salary);
        System.out.println("Annual Salary:"+annual_salary);
        System.out.println("Annual bonus:"+annual_bonus);
        System.out.println("Total Annual Compensation:"+total_compensation);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String employe_Name = sc.nextLine();
        System.out.println("Enter Employee ID:");
        int employe_id = sc.nextInt();
        System.out.println("Enter monthly Salary:");
        double monthly_salary = sc.nextDouble();
        System.out.println("Enter perfomance rating:");
        int perfomance_rating = sc.nextInt();
        if(monthly_salary<0){
            System.out.println("Invalid Monthly salary");
        }else if(perfomance_rating<1 || perfomance_rating>5){
            System.out.println("Perfomance Rating must be between 1 and 5");
        }else{
            Employee e1 = new Employee(employe_Name, employe_id, monthly_salary, perfomance_rating);
            e1.display();
        }
        sc.close();

    }
}
