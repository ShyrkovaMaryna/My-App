package HomeWork7;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[20];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-100, 101);
        }
        System.out.println("Елементи масиву: " + Arrays.toString(numbers));
            int NegSum = 0;
            int result = 0;
            int min = 0;
            int max = 0;
            int maximum = 0;
            int minimum = 0;
            int count = 0;
            int counter = 0;
            boolean negatFirst = false;
            int sum = 0;
            int num = 0;
            double arithmeticOfNumbers = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0 && numbers[i] >= -100) {
                    NegSum += numbers[i];
                }
                result = numbers[i] + result;
                if (numbers[i] > numbers[max]) {
                    max = i;
                } else if (numbers[i] < numbers[min]) {
                    min = i;
                }
                if (numbers[i] > maximum) {
                    maximum = numbers[i];
                } else if (numbers[i] < minimum) {
                    minimum = numbers[i];
                }
                if (numbers[i] % 2 == 0) {
                    count++;
                }
                if (numbers[i] % 2 != 0) {
                    counter++;
                }
                if (numbers[i] < 0) {
                    negatFirst = true;
                    continue;
                }
                if (negatFirst) {
                    sum += numbers[i];
                    num++;
                }
            }
            System.out.println("Сума від'ємних чисел: " + NegSum);
            System.out.println("Кількість парних чисел: " + count);
            System.out.println("Кількість непарних чисел: " + counter);
            System.out.println("Найбільший елемент: " + maximum + " " + "(з індексом " + max + ")");
            System.out.println("Найменший елемент: " + minimum + " " + "(з індексом " + min + ")");
            if (num > 0) {
                arithmeticOfNumbers = (double) sum / num;
                System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f", arithmeticOfNumbers);
            } else {
                System.out.println("В масиві немає від'ємних чисел");

            }

        }


    }


















