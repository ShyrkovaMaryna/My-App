public class Main {

    static String productName;
    static double productPrice;
    static String measure;
    private final static String CURRENCY = "EUR";
    static String output;

    public static void main(String[] args) {

        productName = "Orange";
        double productPrice = Double.parseDouble("2.49");
        measure = "kg";

        double price= productPrice;

        output = productName + ", price " +
                CURRENCY + " " + price + " per " +
                measure + ".";

        System.out.println(output);
    }
}