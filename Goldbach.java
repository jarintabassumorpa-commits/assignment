import java.util.Scanner;

public class Goldbach {

    // Prime number check করার function
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an even number greater than 2: ");
        int num = input.nextInt();

        if (num <= 2 || num % 2 != 0) {
            System.out.println("Invalid input! Please enter an even number greater than 2.");
        } 
        else {
            boolean found = false;

            for (int i = 2; i <= num / 2; i++) {
                if (isPrime(i) && isPrime(num - i)) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No Goldbach pair found.");
            }
        }

        input.close();
    }
}


