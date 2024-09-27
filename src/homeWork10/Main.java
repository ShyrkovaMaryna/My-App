package homeWork10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        printSquareOfNumber(number);
        System.out.println("Enter the radius cylinder:");
        double radius = scanner.nextDouble();
        System.out.println("Enter the height cylinder:");
        double height = scanner.nextDouble();
        double volume = printVolumeCylinder(height, radius);
        System.out.println("Volume of a cylinder with radius " + radius + " and height " + height
                + " is equal to " + volume);
        int[] myNum = {10, 20, 30, 40, 50};
        System.out.println("Array of numbers: "+Arrays.toString(myNum));
        int sumNum = printSumElementsArray(myNum);
        System.out.println("The sum of all array elements is equal: " + sumNum);
        scanner.nextLine();
        System.out.println("Enter the line:");
        String str = scanner.nextLine();
        System.out.println("Row in reverse order: " + reverseLine(str));
        System.out.println("Enter the number to be raised to a power: ");
        int numberA = scanner.nextInt();
        System.out.println("Enter the power to raise the number to:");
        int numberB = scanner.nextInt();
        System.out.println("Result " + numberA+ "^"+numberB+" is equal to "
                + calculatePowerNumber(numberA,numberB));
        System.out.println("Enter the number of times you want to repeat the text:");
        int numberC = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the line you want to repeat:");
        String lines = scanner.nextLine();
        printTextLine(numberC, lines);
    }

    private static void printSquareOfNumber(int number) {
        System.out.println("the square of a number " + number + " is equal to " + number * number);
    }

    private static double printVolumeCylinder(double height, double radius) {
        return Math.PI * radius * radius * height;
    }

    private static int printSumElementsArray(int[] myNum) {
        int sumElements = 0;
        for (int num : myNum) {
            sumElements += num;
        }
        return sumElements;
    }
    private static String reverseLine(String str){
        return new StringBuilder(str).reverse().toString();
    }
    private static int calculatePowerNumber(int numberA, int numberB){
        return(int) Math.pow(numberA, numberB);
    }
    private static String printTextLine(int numberC, String lines){
        for (int i=0; i<numberC; i++) {
            System.out.println(lines);
        }
            return lines;
        }

}
