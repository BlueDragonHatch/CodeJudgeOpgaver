import java.util.Scanner;

public class BonusFibonaccital {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        long[] nums = new long[count];

        for (int i = 0; i < count; i++){
            if (i < 2)
                nums[i] = 1;
            else
                nums[i] = nums[i-1] + nums[i-2];
            System.out.println(nums[i]);
        }
    }
}
