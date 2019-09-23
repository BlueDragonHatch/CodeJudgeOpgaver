import java.util.Scanner;

public class Middelværdiogspredning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        float sum = 0;

        for (String i : input) {
            sum += Integer.parseInt(i);
        }

        double mean = ((double) sum) / input.length;

        double sum2 = 0;

        for (String i : input) {
            sum2 += Math.pow(Integer.parseInt(i) - mean, 2);
        }

        double dev = Math.sqrt(sum2/input.length);

        System.out.println("Mean: " + mean);
            System.out.println("Standard deviation: " + dev);
        in.close();
    }
}
