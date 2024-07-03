public class Sum_of_Digits {
    public static void main(String[] args) {
        int number;
        int result;

        result = 0;
        number = 1;
        while (number != 0)
        {
            result = result + number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }
}
