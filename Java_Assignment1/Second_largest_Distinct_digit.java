import java.util.Scanner;
public class Second_largest_Distinct_digit{
    int number;
    Second_largest_Distinct_digit(int number){
        this.number = number;
    }
    int second_largest(){
        int largest = -1;
        int second_largest = -1;

        while(number>0){
            int digit = number % 10;
            if(digit > largest){
                second_largest = largest;
                largest = digit;
            }
            else if(digit<largest && digit>second_largest){
                second_largest = digit;
            }
            number = number/10;
        }
        return second_largest;
    }
    void display(){
        int result = second_largest();
        if(result==-1){
            System.out.println("Second largest distinct digit does not exist");
        }else{
            System.out.println("Second largest distinct digit is: "+result);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if(number<=0){
            System.out.println("Invalid input");
        }
        else{
            Second_largest_Distinct_digit s1 = new Second_largest_Distinct_digit(number);
            s1.display();
        }
        sc.close();
    }    
    

}