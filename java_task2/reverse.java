import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int num = sc.nextInt();
        int reverse=0;
        while (num !=0){
            int number = num % 10;
            reverse = reverse * 10 + number;
            num = num/10;
        }
        System.out.println("The reversed number is: "+reverse);
        sc.close();
    } 
    
}
