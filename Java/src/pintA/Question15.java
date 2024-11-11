package pintA;

import java.util.Scanner;

/*输入格式：
输入在一行中给出正方形边长N（3≤N≤21）和组成正方形边的某种字符C，间隔一个空格。

输出格式：
输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输出的行数实际上是列数的50%（四舍五入取整）。*/
public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N =  input.nextInt();
        String c = input.next();
        int row;
        if(N%2==0){
            row = N/2;
        }else row = N/2+1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
