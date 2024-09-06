package HW6;

public class Main {


        public static void main(String[] args) {

            int numsSum = 0;

            for (int nums = 1; nums <= 6; nums++) {
                numsSum += nums;

                System.out.println(nums + ")" + "Num is" + " " +
                        nums + " " + "sum is" + " " + numsSum);
            }
            System.out.println("-------------------------");
            System.out.println("Sum of numbers is " + numsSum);
        }
    }
