import java.util.Scanner;
public class do_while{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your balance:");
        float balance = sc.nextFloat();
        int choice;
        do{
            System.out.println("1: To Withdraw");
            System.out.println("2: To Deposit");
            System.out.println("3 : To check balance");
            System.out.println("4 :To Exit");
            System.out.println(("Enter your choice:"));
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the amount to withdraw:");
                    float withdrawl = sc.nextFloat();
                    balance = balance-withdrawl;
                    System.out.println("Your new balance is:"+balance);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    float deposit = sc.nextFloat();
                    balance = balance + deposit;
                    System.out.println("Your new balance is:"+balance);
                    break;
                case 3:
                    System.out.println("Your balance is:"+balance);
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }while(choice<=4);
        sc.close();
    } 
}