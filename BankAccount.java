class BankAccount {
    String Accountholder;
    double balance;
    void transfer_to(BankAccount receiver, double amount){
        if(balance>=amount){
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
        }else{
            System.out.println("Amount is greater than balance");
        }
    }
    public class Main{
        public static void main(String[] args){
            BankAccount a1 = new BankAccount();
            BankAccount a2 = new BankAccount();
            a1.balance = 20000;
            a2.balance = 15000;
            a1.transfer_to(a2,5000);
            System.out.println("new balance of 1 account: "+a1.balance);
            System.out.println("new balance of 2 account: "+a2.balance);
        }
    }
}
