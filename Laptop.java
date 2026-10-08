class Shop{
    String component;
    double price;
}
    public class Laptop{
        public static void main(String[] args){
            Shop p1 = new Shop();
            p1.component = "Laptop";
            p1.price = 50000;
            Shop p2 = p1;        
            p2.price = 45000;
            System.out.println("The first price of the laptop is:"+p1.price);
            System.out.println("The Second price of the laptop is:"+p2.price);

        }
    }
   
