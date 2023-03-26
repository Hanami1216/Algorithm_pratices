package pintA;

import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            int flag = input.nextInt();
            if (is(flag)) {
                System.out.println("Yes");
            } else System.out.println("No");
        }

    }

    public static boolean is(int N) {
        if (N < 2) {
            return false;
        } else if (N > 3) {
            for (int i = 3; i < Math.sqrt(N); i++) {
                if (N % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }


}

