package pintA;

import java.util.Scanner;

/*输入格式：
输入在一行中给出一个不超过 10 的正整数 n。

输出格式：
在一行中按照格式 2^n = 计算结果 输出 2
n
  的值。*/
public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.printf("2^%d = "+(int)Math.pow(2,n),n);
    }
}
