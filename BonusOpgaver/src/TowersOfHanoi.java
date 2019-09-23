import java.util.Scanner;

public class TowersOfHanoi {

    char[] positions;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amountOfDiscs = in.nextInt();
        TowersOfHanoi tower = new TowersOfHanoi(amountOfDiscs);
        tower.moveTower(amountOfDiscs - 1, 'C');
    }

    TowersOfHanoi(int height){
        positions = new char[height];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = 'A';
        }
    }

    void moveTower(int disc, char toPile){
        char discToMovePos = positions[disc];
        char clearPos = toPile != 'A' && discToMovePos != 'A' ? 'A' : (toPile != 'B' && discToMovePos != 'B' ? 'B' : 'C');
        for (int i = disc - 1; i >= 0; i++) {
            if (positions[i] == discToMovePos){
                moveTower(i, clearPos);
                break;
            }
        }
        positions[disc] = toPile;
        System.out.println("Disk " + (disc + 1) + " from " + discToMovePos + " to " + toPile);
        for (int i = disc - 1; i >= 0; i++) {
            if (positions[i] == clearPos){
                moveTower(i, toPile);
                break;
            }
        }
    }

}
