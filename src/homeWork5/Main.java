package homeWork5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double income;
        double tax;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the income");
        income = scanner.nextDouble();

        if (income <=10000) {
            tax = income * 2.5 / 100;
        } else if (income >10000&& income <=25000){
            tax = income*4.3/100;
        }else{
            tax= income*6.7/100;
        }
        System.out.println("The tax amount is equal to: " + tax);

    }
}
