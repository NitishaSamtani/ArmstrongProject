public class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000 are:");

        for (int num = 1; num <= 1000; num++) {
            int originalNum = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            while (originalNum > 0) {
                int digit = originalNum % 10;
                sum += Math.pow(digit, digits);
                originalNum /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
