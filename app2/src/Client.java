public class Client {
    String name;
    String product;
    double price;
    String address;
    int house;

    public static void main(String[] args){
       Client  client1= new Client();
       client1.name="Alice";
       client1.product="smartphone";
       client1.price=305.99;
       client1.address="Moon Street";
       client1.house=10;

        System.out.println("Order No 1 Client:"+" "+ client1.name+".");
        System.out.println("Product:"+" " + client1.product+",");
        System.out.println("price EUR"+" "+client1.price+".");
        System.out.println("Address:"+" "+ client1.address+","
                +client1.house+".");

        Client  client2= new Client();
        client2.name="Tom";
        client2.product="laptop";
        client2.price=570.95;
        client2.address="Terra Street";
        client2.house=17;

        System.out.println("Order No 2 Client:"+" "+ client2.name+".");
        System.out.println("Product:"+" "+ client2.product+",");
        System.out.println("price EUR"+" "+client2.price+"." );
        System.out.println("Address:"+" "+ client2.address+","
                +client2.house+".");

    }
}
