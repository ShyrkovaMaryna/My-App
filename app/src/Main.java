import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please, enter the name of client");
       String clientName = scanner.next();
       System.out.println("Please, enter the product name");
       String productName = scanner.next();
       System.out.println("Please, enter the product price");
       double priceOfProduct = scanner.nextDouble();
       System.out.println("Please, enter the address of client");
       String addressClient = scanner.next();
       System.out.println("Enter the house of client");
       int houseClient= scanner.nextInt();
       System.out.println("Please, enter the name of client");


       System.out.println ("Order No 1 Client: " + clientName);
       System.out.println("Product:" + productName);
       System.out.println("price EUR"+ " " + priceOfProduct);
       System.out.println("Address:" + " " + addressClient+" " + "Street,"+" "+houseClient);



   }
}
