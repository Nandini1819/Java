import java.util.Scanner;
public class Armstrong_numbers{
    int count_digits(int number){
        int count = 0;
        while(number >0){
            count++;
            number/=10;
        }
        return  count;
    }
    int power(int base, int exponent){
        int result = 1;
        for(int i=1; i<=exponent; i++){
            result*=base;
        }
        return result;
    }
    int is_Armstrong(int number){
        int original =number;
        int digits = count_digits(number);
        int sum = 0;
        while(number>0){
            int digit = number%10;
            sum = sum+power(digit,digits);
            number = number/10;
        }
        if(sum==original){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Armstrong_numbers a1 = new Armstrong_numbers();
        System.out.println("Start:");
        int start = sc.nextInt();
        System.out.println("End:");
        int end = sc.nextInt();
        if(start<=0 || end<=0 || start>end){
            System.out.println("Invalid Range");
        }else{
            System.out.println("Armstrong numbers: ");
            for(int i=start;i<=end;i++){
                if(a1.is_Armstrong(i)==1){
                    System.out.println(i+" ");
                }
            }
        }
        sc.close();

    }
}