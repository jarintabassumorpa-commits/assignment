import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = 0;

        if (num <= 1) {
            System.out.println("Not a Prime Number");
        } else {

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }
        }

        input.close();
    }
}



