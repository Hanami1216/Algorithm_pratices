package LadderMatch2022;
/*输入格式:
首先输入一个正整数T，表示测试数据的组数，然后是T组测试数据。对于每组测试，第一行输入2个整数x，y（1≤ x，y ≤15），
接下来输入x行每行y个字符，用于表示地雷的分布，其中，*表示地雷，.表示该处无雷。

输出格式:
对于每组测试，输出一个x行y列的矩形，其中有地雷的格子显示*，没地雷的格子显示其周围8个格子中的地雷总数。任意两组测试之间留一个空行。*/
import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //大循环 T组测试
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            char[][] test = new char[x][y];
            for (int i1 = 0; i1 < test.length; i1++) {
                test[i1] = input.next().toCharArray();
            }
            for (int j = 0; j < test.length; j++) {
                for (int z = 0; z < test[j].length; z++) {
                    int result = 0;
                    if (test[j][z] == '*'){
                        System.out.print('*');
                    }else {
                        //判断左边和上边的边界要>=0，不然边界值会省略掉
                        if(z+1<y&&test[j][z+1] == '*') result++;
                        if(z-1>=0&&test[j][z-1] == '*') result++;
                        if(j+1<x&&test[j+1][z] == '*') result++;
                        if(j-1>=0&&test[j-1][z] == '*') result++;
                        if(j+1<x&&z+1<y&&test[j+1][z+1] == '*') result++;
                        if(j+1<x&&z-1>=0&&test[j+1][z-1] == '*') result++;
                        if(j-1>=0&&z+1<y&&test[j-1][z+1] == '*') result++;
                        if(j-1>=0&&z-1>=0&&test[j-1][z-1] == '*') result++;
                        System.out.print(result);
                    }
                }
                System.out.println();
            }
            if(i!=T-1)
            System.out.println();
        }
    }
}
