package pintA;

import java.util.Scanner;

public class Question6 {
    /*
 一个正整数 N 的因子中可能存在若干连续的数字。例如 630 可以分解为 3×5×6×7，其中 5、6、7 就是 3 个连续的数字。给定任一正整数 N，要求编写程序求
 出最长连续因子的个数，并输出最小的连续因子序列。

输入格式：
输入在一行中给出一个正整数 N（1<N<2^31）。

输出格式：
首先在第 1 行输出最长连续因子的个数；然后在第 2 行中按 因子1*因子2*……*因子k 的格式输出最小的连续因子序列，其中因子按递增顺序输出，1 不算在内*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long start = 0,length = 0,sum;
        //因数必定小于Math.sqrt()
        for (long i = 2; i < Math.sqrt(num); i++) {

            sum = 1;
            //
            for (long j = i;sum <= num ;j++ ) {
                sum = sum*j;
                if(num % sum == 0 && j - i + 1> length){
                    length = j-i+1;
                    start = i;
                }
            }
        }

        //如果是质数
        if(start ==0){
            start =num;
            length = 1;
        }
        System.out.println(length);
        for (long i = 0; i < length-1; i++) {
            System.out.print(start+i+"*");
        }
        System.out.print(start+length-1);
    }
}
