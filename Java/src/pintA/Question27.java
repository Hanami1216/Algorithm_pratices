package pintA;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] tel = input.next().toCharArray();
        int[] num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (char c : tel) {
            num[Integer.parseInt(String.valueOf(c))]++;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] >= 1) {
                arrayList.add(i);
            }
        }
        Integer[] arr = arrayList.toArray(new Integer[0]);
        ArrayList<Integer> index = new ArrayList<>();

        for (char c : tel) {
            for (int j = 0; j < arr.length; j++) {
                if (c - '0' == arr[j]) {
                    index.add(j);
                }
            }
        }
        System.out.print("int[] arr = new int[]{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println((int) arr[i] + "};");
                break;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.print("int[] index = new int[]{");
        for (int i = 0; i < index.size(); i++) {
            if (i == index.size() - 1) {
                System.out.println(index.get(i) + "};");
                break;
            }
            System.out.print(index.get(i) + ",");
        }


    }
}
