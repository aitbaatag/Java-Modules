import java.util.Scanner;
public class PrimeChecker {
    public static void main(String[] args) {
        long dev;
        long iterations;

        dev = 2;
        boolean isPrime = true;
        iterations = 1;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an integer:-> ");
        long number = reader.nextLong();
        if (number <= 1)
        {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }
        while (dev < Math.sqrt(number))
        {
            if (number % dev == 0)
            {
                isPrime = false;
                break;
            }
            dev++;
            iterations++;
        }
        System.out.println(isPrime + " " + iterations);
    }
}
    