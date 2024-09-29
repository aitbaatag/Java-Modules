import java.util.Scanner;

public class Endless_Sequence {
    static long sum_of_digits(long number) {
        long result;

        result = 0;
        while (number != 0)
        {
            result = result + number % 10;
            number = number / 10;
        }
        return (result);
    }
    static boolean prime_checker(long number) {
        long dev;
        long iterations;

        dev = 2;
        boolean isPrime = true;
        iterations = 1;
        while (dev <= Math.sqrt(number))
        {
            if (number % dev == 0)
            {
                isPrime = false;
                break;
            }
            dev++;
            iterations++;
        }
        return (isPrime);
    }
    public static void main(String[] args) {
        int count;
        long number;
        Scanner reader = new Scanner(System.in);

        count = 0;
        System.out.print("-> ");
        while((number = reader.nextLong()) != 42)
        {
            if (number <= 1)
            {
                System.err.print("invalid number : must be greater 1\n");
                System.exit(1);
            }
            if (prime_checker(sum_of_digits(number)))
                count++;
            System.out.print("-> ");
        }
        System.out.println("Count of coffee-request : " + count);
    }
}
