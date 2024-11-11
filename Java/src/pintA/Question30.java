package pintA;

import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] sex = new int[N];
        String[] name = new String[N];
        for (int i = 0; i < N; i++) {
            sex[i] = input.nextInt();
            name[i] = input.next();
        }
        for (int i = 0; i < N / 2; i++) {
            for (int j = N - 1; j >= N / 2; j--) {
                if (sex[i] != sex[j] && sex[j] != -1) {
                    System.out.println(name[i] + " " + name[j]);
                    sex[j] = -1;
                    break;
                }
            }

        }
    }
}
