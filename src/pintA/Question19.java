package pintA;

import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt(), B = input.nextInt();
        int round = input.nextInt();
        int count_A = 0, count_B = 0;
        int[] round_record = new int[4];
        for (int i = 0; i < round; i++) {
            for (int j = 0; j < 4; j++) {
                round_record[j] = input.nextInt();
            }
            int result = round_record[0] + round_record[2];
            if (result == round_record[1] && result != round_record[3]) {
                count_A++;
            } else if (result == round_record[3] && result != round_record[1]) {
                count_B++;
            }
            // 题目保证有一个人倒下。
            if (count_A > A) {
                System.out.println("A");
                System.out.println(count_B);
                break;
            } else if (count_B > B) {
                System.out.println("B");
                System.out.println(count_A);
                break;
            }
        }

    }
}
