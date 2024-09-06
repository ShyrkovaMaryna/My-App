package App;

public class MainH {

    static String productName;
    static String productPrice;
    static String measure;
    static String output;
    private final static String CURRENCY = "EUR";


    public static void main(String[] args) {

        productName = "Orange";
        productPrice = "2.49";
        measure = "kg";

        double price = Double.parseDouble(productPrice);
        output = productName + ", price " +
                CURRENCY + " " + price + " per " +
                measure + ".";

        System.out.println(output);
    }
}