package introToObjectOriantedProgramming.Sec34NewJavaFeatures.l;

record Customer (String name, String email){}
record Product (String name, double price){}
record Order (Customer customer, Product product){}

public class PatternMatchingCustinerRecordsRunner {
public static void ProcessOrder(Object obj){
    if (obj
            instanceof Order(
                    Customer(String customerName, String email),
                    Product (String productName, double price))){
        System.out.println("Customer " + customerName + " ordered " + productName + " for price £" + price);

    }
}

    public static void main(String[] args) {
        ProcessOrder(new Order(new Customer("louise", "louise@louise.com"), new Product("red bull", 20)));
    }
}
