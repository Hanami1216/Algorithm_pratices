package pintA;

import java.util.Scanner;

/**
 * @Description : 这道题关键点在于输入以及条件判断，别忘了有一个绝对值条件（用Math工具类
 * @Author : YokiWare
 * @Date: 2024/11/13  22:21
 */
public class L1_031 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            double tall = input.nextDouble(), weight = input.nextDouble() ;
            double  standWeight = (tall - 100) * 0.9 *2;
            if ( Math.abs(weight - standWeight)< standWeight*0.1 ) {
                System.out.println("You are wan mei!");
            } else if (weight - standWeight > 0) {
                System.out.println("You are tai pang le!");
            } else System.out.println("You are tai shou le!");
        }
    }
}
