package pintA;

import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] tags = new int[1001];
        // 标签 次数
        int result1 = 0, result2 = 0;
        for (int i = 0; i < N; i++) {
            int M = input.nextInt();
            for (int j = 0; j < M; j++) {
                int tag = input.nextInt();
                tags[tag]++;
                if (tags[tag] > result2) {
                    result1 = tag;
                    result2 = tags[tag];
                }
                if (tags[tag] == result2 && tag > result1) {
                    result1 = tag;
                }
            }
        }
        System.out.println(result1 + " " + tags[result1]);
    }
}
