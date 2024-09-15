package homeWork8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[15];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }
        System.out.println("Початковий вигляд масиву: " + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
        System.out.println("Відсортований масив: " + Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число для пошуку:");
        int target = scanner.nextInt();
        int left = 0;
        boolean number = false;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > target) {
                right = mid - 1;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else if (numbers[mid] == target) {
                System.out.println("Індекс числа " + target + " у відсортованому масиві " + mid);
                number = true;
                break;
            }
        }
             if (!number){
                System.out.println("Число " + target + " не знайдено.");
            }
            scanner.close();
        }
    }






