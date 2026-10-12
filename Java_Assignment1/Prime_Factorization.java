import java.util.Scanner;
public class Prime_Factorization {
    int is_Prime(int number) {
        if (number < 2) {
            return 0;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return 0;
            }
        }
         return 1;
    }
    void factorization(int number) {
        if (number == 1) {
            System.out.println("Prime factorization is 1");
            return;
        }
        System.out.print("Prime factorization: ");
        int factor = 2;
        int first = 1;
        while (number > 1) {
            int count = 0;
            if (is_Prime(factor) == 1) {
                while (number % factor == 0) {
                    count++;
                    number = number / factor;
                }
                if (count > 0) {
                    if (first == 0) {
                        System.out.print(" x ");
                    }

                    System.out.print(factor + "^" + count);
                    first = 0;
                }
            }
            factor++;
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prime_Factorization p1 = new Prime_Factorization();
        System.out.print("Number: ");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Invalid input");
        } else {
            p1.factorization(number);
        }

        sc.close();
    }
}


        

        
        



           
        

    