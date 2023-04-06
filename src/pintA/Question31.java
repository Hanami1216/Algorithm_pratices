package pintA;

import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            int tall = input.nextInt(), weight = input.nextInt() / 2;
            if (weight - (tall - 100) * 0.9 < (tall - 100) * 0.9 * 0.1) {
                System.out.println("You are wan mei!");
            } else if (weight - (tall - 100) * 0.9 > (tall - 100) * 0.9 * 0.1) {
                System.out.println("You are tai pang le!");
            } else System.out.println("You are tai shou le!");
        }
    }
}
