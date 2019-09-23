import java.util.Scanner;

public class Histogram
{
    public static void main(String[] args)
    {
        int[] values = new int[10];

        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");

        for (String i: input) {
            values[(Integer.parseInt(i) - 1) / 10]++;
        }

        for (int i = 0; i < values.length; i++){
            String out = (1 + 10 * i) + (i == 0 ? " ": "") + " - " + (10 + 10 * i) + (i == 9 ? "": " ") + " | ";
            for (int x = 0; x < values[i]; x++){
                out += "*";
            }
            System.out.println(out);
        }
        in.close();
    }
}