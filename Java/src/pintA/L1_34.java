package pintA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Description : 找出出现次数最多的标签，如果有多个，取标签值较大的那个。
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class L1_34 {
    public static void main(String[] args) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bu.readLine());

        int[] tags = new int[1001];  // 标签次数数组
        int mostFrequentTag = 0;      // 出现次数最多的标签
        int maxCount = 0;             // 最大出现次数

        for (int i = 0; i < N; i++) {
            String[] k = bu.readLine().split(" ");
            for (int j = 1; j < k.length; j++) {
                int tag = Integer.parseInt(k[j]);
                tags[tag]++;
            }
        }

        for (int i = 0; i < tags.length; i++) {
            if (tags[i] >= maxCount) {
                maxCount = tags[i];
                mostFrequentTag = Math.max(i, mostFrequentTag);
            }
        }

        // 输出结果
        System.out.println(mostFrequentTag + " " + maxCount);
    }
}
