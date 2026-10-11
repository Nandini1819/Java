import java.util.Scanner;
public class Student {
    private String student_name;
    private int roll_number;
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;
    private int mark5;

    public Student (String student_name, int roll_number, int mark1, int mark2, int mark3, int mark4, int mark5){
    this.student_name = student_name;
    this.roll_number = roll_number;
    this.mark1 = mark1;
    this.mark2 = mark2;
    this.mark3 = mark3;
    this.mark4 = mark4;
    this.mark5 = mark5;
    }
    public int calculate_total(){
        return mark1+mark2+mark3+mark4+mark5;
    }
    public double calculate_percentage(){
        return calculate_total()/5;
    }
    public String calculate_result(){
        if(mark1>=40 && mark2>=40 && mark3>40 && mark4>40 && mark5>40){
            return "Pass";
        }
        else{
            return "Fail";
        }
    } 
    public void display(){
        System.out.println("Student name:"+student_name);
        System.out.println("Roll number:"+roll_number);
        System.out.println("Total marks:"+calculate_total()+"/500");
        System.out.println("Percentage:"+calculate_percentage()+"%");
        System.out.println("Result:"+calculate_result());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name:");
        String name = sc.nextLine();
        System.out.println("Enter roll number:");
        int roll_number = sc.nextInt();
        System.out.println("Enter marks for five subject:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        if(m1<0 || m1>100 || m2<0 || m2>100 || m3<0 || m3>100 || m4<0 || m4>100 || m5<0 || m5>100  ){
            System.out.println("Invalid Marks");

        }
        else{
            Student s1 = new Student(name, roll_number, m1, m2, m3, m4, m5);
            s1.display();
        }
        sc.close();
    }


}
