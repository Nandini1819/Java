import java.util.Scanner;
public class Strong_number {
    int number;
    Strong_number(int number){
        this.number = number;
    }
    int factorial(int digit){
        int factorial = 1;
        for(int i=1; i<=digit;i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    int calculate_sum(){
        int num = number;
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum = sum + factorial(digit);
            num = num/10;
        }
        return sum;
    }
    void display(){
        int sum = calculate_sum();
        if(sum==number){
            System.out.println(number+ " is a strong number");
        }else{
            System.out.println(number + " is not a strong number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if(number<=0){
            System.out.println("Invalid input");
        }else{
            Strong_number n1 = new Strong_number(number);
            n1.display();
        }
        sc.close();
    }
}
