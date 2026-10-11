import java.util.Scanner;
public class product {
    private String product_name;
    private int product_id;
    private double unit_price;
    private int quantity;

    product(String product_name, int product_id, double unit_price, int quantity){
        this.product_name = product_name;
        this.product_id = product_id;
        this.unit_price = unit_price;
        this.quantity = quantity;
    }
    public double calculate_subtotal(){
        return unit_price*quantity;
    }
    public double calculate_discount(){
        double subtotal = calculate_subtotal();
        double discount_percentage = 0;
        if(subtotal<1000){
            discount_percentage = 0;
        }
        else if(subtotal<5000){
            discount_percentage = 5;
        }
        else if(subtotal<10000){
            discount_percentage = 10;
        }
        else{
            discount_percentage = 15;
        }
        return subtotal*discount_percentage/100;
    }
    public double calculate_final_bill(){
        return calculate_subtotal() - calculate_discount();
    }
    public void display(){
        System.out.println("Product Name:"+product_name);
        System.out.println("Product Id:"+product_id);
        System.out.println("Subtotal:"+calculate_subtotal());
        System.out.println("Discount:"+calculate_discount());
        System.out.println("Final bill:"+calculate_final_bill());
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name:");
        String product_name = sc.nextLine();
        System.out.println("Enter product id:");
        int product_id = sc.nextInt();
        System.out.println("Enter unit price:");
        double unit_price = sc.nextDouble();
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        if(unit_price<=0){
            System.out.println("Unit price should be positive");
        }else if(quantity<=0){
            System.out.println("quantity should be greater than 0");
        } 
        else{
            product p1 = new product(product_name, product_id, unit_price, quantity);
            p1.display();
        }
        sc.close();

    }


}
