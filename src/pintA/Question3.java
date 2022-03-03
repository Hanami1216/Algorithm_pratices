package pintA;

import java.util.Scanner;

/*
请编写程序统计每种不同的个位数字出现的次数。例如：给定 N=100311，则有 2 个 0，3 个 1，和 1 个 3。

输入格式：
每个输入包含 1 个测试用例，即一个不超过 1000 位的正整数 N。

输出格式：
对 N 中每一种不同的个位数字，以 D:M 的格式在一行中输出该位数字 D 及其在 N 中出现的次数 M。要求按 D 的升序输出。*/
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.next();
        char[] arr = num.toCharArray();
        char[] numJudge = {'0','1','2','3','4','5','6','7','8','9'};
        int[] reslut={0,0,0,0,0,0,0,0,0,0};
        //判断
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < numJudge.length; j++) {
                if(numJudge[j]==arr[i]){
                    reslut[j]++;
                }
            }
        }
        //结果
        for (int i = 0; i < reslut.length; i++) {
            if(reslut[i]>0){
                System.out.println(i+":"+reslut[i]);
            }
        }
    }
}
