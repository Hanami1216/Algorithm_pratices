package pintA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question23 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = input.readLine().toUpperCase().toCharArray();
        LinkedHashMap<Character, Integer> times = new LinkedHashMap<>();
        times.put('G', 0);
        times.put('P', 0);
        times.put('L', 0);
        times.put('T', 0);
        //统计出现次数
        for (char c : arr) {
            if (times.containsKey(c)) {
                times.put(c, times.getOrDefault(c, 0) + 1);
            }
        }
        while (times.get('G') > 0 || times.get('P') > 0 || times.get('L') > 0 || times.get('T') > 0) {
            if (times.get('G') > 0) {
                System.out.print('G');
                times.put('G', times.getOrDefault('G', 0) - 1);
            }
            if (times.get('P') > 0) {
                System.out.print('P');
                times.put('P', times.getOrDefault('P', 0) - 1);
            }
            if (times.get('L') > 0) {
                System.out.print('L');
                times.put('L', times.getOrDefault('L', 0) - 1);
            }
            if (times.get('T') > 0) {
                System.out.print('T');
                times.put('T', times.getOrDefault('T', 0) - 1);
            }
        }
    }
}
