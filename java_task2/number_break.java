import java.util.Scanner;
public class number_break{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println("Enter the numbers: ");
            int number = sc.nextInt();
            if(number==30){
                System.out.println("You entered 30");
                break;
                
            }
        }
        sc.close();
    }
    
}
