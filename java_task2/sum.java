import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter:");
        int n = sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            System.out.println("Enter the number");
            int num = sc.nextInt();
            sum = sum+num;
        }
        System.out.println("The sum of the given numbers is:"+sum);
        sc.close();

    }
    
}
