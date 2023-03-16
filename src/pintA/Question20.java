package pintA;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> id = new ArrayList<>();
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            int K = input.nextInt();
            for (int j = 0; j < K; j++) {
                id.add(input.next());
            }
        }
        int M = input.nextInt();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < M; i++) {
            map.put(input.next(), 0);

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            for (String s : id) {
                if (entry.getKey().equals(s)) {
                    map.put(s, map.getOrDefault(s, 0) + 1);
                }
            }
        }
        int times = 0;
        // 找出只出现一次的字符串
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                times++;
            }

        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.print(entry.getKey());
                if (times > 1) {
                    System.out.print(" ");
                    times--;
                }
            }
        }
        if (times == 0) {
            System.out.println("No one is handsome");
        }

    }
}
