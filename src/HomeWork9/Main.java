package HomeWork9;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int positiveRow = 0;
        int negativeRow = 0;
        long positiveColumn = 1;
        long negativeColumn = 1;
        int array[][] = new int[4][4];
        int rowSumOne = 0;
        int columnSumOne = 0;
        int diagonalSum = 0;
        int sumAllRow =0;
        int sumAllColumn=0;
        int diagonalSumSecond=0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(1,51);
            }
        }
        System.out.println("Матриця 4*4:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            diagonalSumSecond += array[i][array.length -1 - i];
            for (int j = 0; j < array.length; j++) {
                sumAllRow += array[i][j];
                sumAllColumn += array[j][i];
                if (i % 2 == 0) {
                    positiveRow += array[i][j];
                } else {
                    negativeRow += array[i][j];
                }
                if (j % 2 == 0) {
                    positiveColumn *= array[i][j];
                } else {
                    negativeColumn *= array[i][j];
                }
            }
        }
        System.out.println("Сума елементів у парних рядках (рядок 0,2): " + positiveRow);
        System.out.println("Сума елементів у непарних рядках (рядок 1,3): " + negativeRow);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0,2): " + positiveColumn);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1,3): " + negativeColumn);
        for (int i = 0; i < array.length; i++) {
            columnSumOne += array[i][0];
            diagonalSum += array[i][i];
        }
        for (int j = 0; j < array.length; j++) {
            rowSumOne += array[0][j];
        }
        if (columnSumOne != diagonalSum || diagonalSum != rowSumOne||
                sumAllRow!=sumAllColumn|| diagonalSum !=diagonalSumSecond) {

            System.out.println("Матриця не є магічним квадратом.");
        }else {
            System.out.println("Матриця є магічним квадратом.");
        }
    }
}












