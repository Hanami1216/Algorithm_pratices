package pintA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
每个 PAT 考生在参加考试时都会被分配两个座位号，一个是试机座位，一个是考试座位。正常情况下，考生在入场时先得到试机座位号码，入座进入试机状态后，系统会显示该考生的考试座位号码，考试时考生需要换到考试座位就座。但有些考生迟到了，试机已经结束，他们只能拿着领到的试机座位号码求助于你，从后台查出他们的考试座位号码。

输入格式：
输入第一行给出一个正整数 N（≤1000），随后 N 行，每行给出一个考生的信息：准考证号 试机座位号 考试座位号。其中准考证号由 16 位数字组成，座位从 1 到 N 编号。输入保证每个人的准考证号都不同，并且任何时候都不会把两个人分配到同一个座位上。

考生信息之后，给出一个正整数 M（≤N），随后一行中给出 M 个待查询的试机座位号码，以空格分隔。

输出格式：
对应每个需要查询的试机座位号码，在一行中输出对应考生的准考证号和考试座位号码，中间用 1 个空格分隔。
 */
public class Question5 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String N = input.readLine();
        int N_int = Integer.parseInt(N);
        String [][]arr  = new String[N_int][3];
        //输入
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.readLine().split(" ");
        }
        String M = input.readLine();
        int  M_int  = Integer.parseInt(M);
        String[] M_num = input.readLine().split(" ");

        //判断输出
        for (int i = 0; i < M_num.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(M_num[i].equals(arr[j][1])){
                    System.out.println(arr[j][0]+" "+arr[j][2]);
                }
            }
        }

    }

}
