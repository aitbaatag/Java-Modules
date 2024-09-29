import java.util.Scanner;

public class Statistics {
    public static final int MAX_WEEKS = 18;
    public static final int END = 42;
    static boolean istrue = true;
    static int buff = 0;
    public static void store_grade(int min_score)
    {
        if (istrue)
            buff = (buff * 10) + min_score;
    }
    public static int return_min_score(String inputline)
    {
        int min;
        int i ;
        String[] inputStrings = inputline.split(" ");

        i = 0;
        min = 9;
        if (Integer.parseInt(inputStrings[0]) == END)
        {
            istrue = false;
            return (0);
        }
        while (inputStrings.length > i)
        {
            if ((Integer.parseInt(inputStrings[i]) > 9 || Integer.parseInt(inputStrings[i]) <= 0) || !(inputStrings.length == 5))
            {
                System.err.print("IllegalArgument\n");
                System.exit(-1);
            }
            if (min >= Integer.parseInt(inputStrings[i]))
                min = Integer.parseInt(inputStrings[i]);
            i++;
        }
        return (min);
    }
    public static void chart_showing(int n, int num_week)
    {
        if (n == 0)
            return ;
        chart_showing(n / 10, num_week - 1);
        int i;

        System.out.printf("Week %d ", num_week);
        i = n % 10;
        while (i != 0)
        {
            System.out.print("=");
            i--;
        }
        System.out.print(">\n");
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count;
        int end;

        count = 1;
        end = 0;
        while (istrue)
        {
            if (count - 1 == MAX_WEEKS)
                break;
            System.out.println("-> Week " + count);
            System.out.print("-> ");
            String inputline = reader.nextLine();
            store_grade(return_min_score(inputline));
            count++;
        }
        chart_showing(buff, String.valueOf(buff).length());
    }
}