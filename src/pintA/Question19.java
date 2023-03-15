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
        int jia = input.nextInt(), yi = input.nextInt();
        int[] bei = new int[]{0, 0};
        int times = input.nextInt();
        int result = 0;
        int[][] record = new int[times][4];
        for (int i = 0; i < times; i++) {
            //输入数据
            for (int j = 0; j < 4; j++) {
                record[i][j] = input.nextInt();
            }
            //判断
            result = record[i][0] + record[i][2];
            if (record[i][1] == record[i][3]) {
                if (result != record[i][1]) {
                    yi--;
                    bei[1]++;
                    if (yi == 0) {
                        System.out.println("A");
                        System.out.println(bei[1]);
                        System.exit(0);
                    }
                    jia--;
                    bei[0]++;
                    if (jia == 0) {
                        System.out.println("B");
                        System.out.println(bei[0]);
                        System.exit(0);
                    }
                }
                continue;
            } else if (result == record[i][1]) {
                yi--;
                bei[1]++;
                if (yi == 0) {
                    System.out.println("A");
                    System.out.println(bei[1]);
                    System.exit(0);
                }
            } else if (result == record[i][3]) {
                jia--;
                bei[0]++;
                if (jia == 0) {
                    System.out.println("B");
                    System.out.println(bei[0]);
                    System.exit(0);
                }
            }
            result = 0;
        }
    }
}
