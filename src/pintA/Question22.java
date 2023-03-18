package pintA;

import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int oddNumber = 0, evenNumber = 0;
        for (int i = 0; i < N; i++) {
            if (input.nextInt() % 2 == 0) {
                evenNumber++;
            } else oddNumber++;
        }
        System.out.print(oddNumber + " " + evenNumber);
    }
}
