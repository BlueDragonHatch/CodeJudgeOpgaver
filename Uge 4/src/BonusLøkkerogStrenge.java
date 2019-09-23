import java.util.Scanner;

public class BonusLøkkerogStrenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] input = in.nextLine().toCharArray();
        int tal = Character.getNumericValue(input[input.length - 1]);

        char[] output = new char[(input.length - 1) * tal];

        for (int i = 0; i < input.length - 1; i++){
            for (int x = 0; x < tal; x++){
                output[i * tal + x] = input[i];
            }
        }
        System.out.println(output);
    }
}
