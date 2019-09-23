import java.util.Scanner;

public class GætMitNavn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String correctName = in.nextLine().toLowerCase();

        while (true){
            String guess = in.nextLine().toLowerCase();

            int val = guess.compareTo(correctName);
            if (val == 0){
                System.out.println("Du gættede rigtigt.");
                break;
            } else if (val > 0)
                System.out.println("Mit navn er før i alfabetet.");
            else if (val < 0)
                System.out.println("Mit navn er efter i alfabetet.");
            else
                System.out.println("You Fucked up");
        }
    }
}