package pintA;

import java.util.Arrays;
import java.util.Scanner;

/*本题要求将输入的任意3个整数从小到大输出。

输入格式:
输入在一行中给出3个整数，其间以空格分隔。

输出格式:
在一行中将3个整数从小到大输出，其间以“->”相连*/
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0]+"->");
        System.out.print(arr[1]+"->");
        System.out.print(arr[2]);
    }
}
