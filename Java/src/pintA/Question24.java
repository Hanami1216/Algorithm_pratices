package pintA;

import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int D = input.nextInt() + 2;
        if (D > 7) {
            D -= 7;
        }
        System.out.print(D);
    }
}
