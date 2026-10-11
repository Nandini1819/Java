import java.util.Scanner;
public class Bank_Account {
    private String account_holder;
    private int account_number;
    private double balance;

    Bank_Account (String account_holder, int account_number, double balance){
        this.account_holder = account_holder;
        this.account_number = account_number;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid amount");
        }else{
            balance = balance + amount;
            System.out.println("Deposit Successful");
        }
    }
    public void withdrawal(double amount){
        if(amount<=0){
            System.out.println("Invalid amount");
        }else if(amount>balance){
            System.out.println("Insufficient balance");
        }else{
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        }
    }
    public void display(){
        System.out.println("Account Holder:"+account_holder);
        System.out.println("Account Number:"+account_number);
        System.out.println("Final Balance:"+balance);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account holder name:");
        String account_holder = sc.nextLine();
        System.out.println("Enter account number:");
        int account_number = sc.nextInt();
        System.out.println("Enter Initial balance:");
        double initial_balance = sc.nextDouble();
        if(initial_balance<0){
            System.out.println("initial balance cannot be negative");
        }else{
            Bank_Account a1 = new Bank_Account(account_holder, account_number, initial_balance);
            System.out.println("Enter deposit amount:");
            double deposit_amount = sc.nextDouble();
            a1.deposit(deposit_amount);
            System.out.println("Enter Withdrawal amount:");
            double withdrawal_amount = sc.nextDouble();
            a1.withdrawal(withdrawal_amount);
            a1.display();
        }
        sc.close();
    }
}
