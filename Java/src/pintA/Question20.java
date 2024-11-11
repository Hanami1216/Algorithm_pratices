package pintA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question20 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        // 使用 HashSet 存储所有有朋友的人
        HashSet<String> friend = new HashSet<>();

        // 处理每个朋友圈
        for (int i = 0; i < n; i++) {
            String[] ids = bf.readLine().split(" ");
            int k = Integer.parseInt(ids[0]);

            // 如果 k > 1，将这些人加入 friend 集合
            if (k > 1) {
                friend.addAll(Arrays.asList(ids).subList(1, ids.length));
            }
        }

        // 处理待查询的人的信息
        int m = Integer.parseInt(bf.readLine());
        String[] number = bf.readLine().split(" ");

        // 使用 HashSet 存储没有朋友的人，避免重复输出
        HashSet<String> handsome = new HashSet<>();

        // 查询每个人是否有朋友
        for (String person : number) {
            if (!friend.contains(person)) {
                handsome.add(person);
            }
        }

        // 如果没有帅到没朋友的人，输出指定信息
        if (handsome.isEmpty()) {
            System.out.println("No one is handsome");
        } else {
            // 输出帅到没朋友的人的 ID，按照输入顺序输出
            System.out.println(String.join(" ", handsome));
        }
    }
}
