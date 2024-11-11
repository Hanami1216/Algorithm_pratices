package pintA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        //定义HashSet集合,将朋友圈中的人放入
        HashSet<String> friend = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] ids = bf.readLine().split(" ");
            //没有朋友的人可以是根本没安装“朋友圈”，也可以是只有自己一个人在朋友圈的人
            int k = Integer.parseInt(ids[0]);
            //如果k=1,即朋友圈中只有一个人,那么他也是没有朋友的,所以当k>1,将这些人的id加入HashSet中
            if (k != 1) {
                friend.addAll(Arrays.asList(ids).subList(1, ids.length));
            }
        }
        //输入代查询的人
        int m = Integer.parseInt(bf.readLine());
        String[] number = bf.readLine().split(" ");
        //将没有朋友的人放入Arraylist,并去重
        ArrayList<String> handsome = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            //没有朋友并且钱没没有查询过这个人
            if (!friend.contains(number[i]) && !handsome.contains(number[i])) {
                handsome.add(number[i]);
            }
        }
        //没有人帅到没朋友
        if (handsome.size() == 0) {
            System.out.println("No one is handsome");
        } else {
            //输出帅到没朋友的人
            for (int i = 0; i < handsome.size(); i++) {
                System.out.print(handsome.get(i));
                if (i != handsome.size() - 1) {
                    System.out.print(" ");
                }
            }
        }


    }
}


