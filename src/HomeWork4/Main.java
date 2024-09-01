package HomeWork4;

public class Main {

  public static void main(String[] args){

      int firstProduct = 1;
      int secondProduct = 2;

    String firstProductName = "smartphone";
    String secondProductName = "laptop";

    String currencyEur = "EUR";

    double totalSalesFirstProduct = 12153.41;
    double totalSalesSecondProduct = 10486.85;

    int numberDaysFirstProduct = 5;
    int numberDaysSecondProduct = 7;

    double dailyFirstProduct = (double) totalSalesFirstProduct/numberDaysFirstProduct;
    double dailySecondProduct = (double) totalSalesSecondProduct/numberDaysSecondProduct;

    System.out.printf("Product No %d: %s,%n" +
                    "total sales for %d days is %s %.2f,%n" +
                    "sales by day is %s %.2f.%n",
            firstProduct, firstProductName, numberDaysFirstProduct, currencyEur, totalSalesFirstProduct, currencyEur, dailyFirstProduct);

    System.out.printf("Product No %d: %s,%n" +
            "total sales for %d days is %s %.2f,%n" +
            "sales by day is %s %.2f.",
            secondProduct, secondProductName, numberDaysSecondProduct, currencyEur, totalSalesSecondProduct, currencyEur, dailySecondProduct);
  }
}
