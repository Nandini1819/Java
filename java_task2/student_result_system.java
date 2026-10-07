import java.util.Scanner;
public class student_result_system {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Java: ");
        int m1 = sc.nextInt();
        System.out.println("Enter marks for Python: ");
        int m2 = sc.nextInt();
        System.out.println("Enter marks for OS: ");
        int m3 = sc.nextInt();
        System.out.println("Enter marks for DELD: ");
        int m4 = sc.nextInt();
        System.out.println("Enter marks for CEP: ");
        int m5 = sc.nextInt();
        int total = m1+m2+m3+m4+m5;
        double percentage = total/5;
        System.out.println("Your percentage is: "+percentage);
        if(percentage>=90){
            System.out.println("Your Grade is A+");
        }else if(percentage>=80){
            System.out.println("Your Grade is A");
        }else if(percentage>=70){
            System.out.println("Your Grade is B");
        }else if(percentage>=60){
            System.out.println("Your Grade is C");
        }else if(percentage>=40){
            System.out.println("Your Grade is D");
        }else{
            System.out.println("Your Are Failed");
        }
        sc.close();

    }
}
