import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome or not:");
        int num = sc.nextInt();
        int reverse = 0;
        int orignal = num;
        while(num != 0){
            int number = num % 10;
            reverse = reverse*10 + number;
            num = num/10;
        }
        if(orignal==reverse){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
        sc.close();
    }
    
}
