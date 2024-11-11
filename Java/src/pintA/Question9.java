package pintA;
import java.util.*;
/*本题的要求很简单，就是求N个数字的和。麻烦的是，这些数字是以有理数分子/分母的形式给出的，你输出的和也必须是有理数的形式。

输入格式：
输入第一行给出一个正整数N（≤100）。随后一行按格式a1/b1 a2/b2 ...给出N个有理数。题目保证所有分子和分母都在长整型范围内。另外，负数的符号一定出现在分子前面。

输出格式：
输出上述数字和的最简形式 —— 即将结果写成整数部分 分数部分，其中分数部分写成分子/分母，要求分子小于分母，且它们没有公因子。如果结果的整数部分为0，则只输出分数部分。*/
public class Question9 {

    //此题解不出来，答案奉上

    //求最大公约数
    public static long gcd(long n, long m) {
        long t;
        //要求大数取模小数
        if(n < m) {
            t = n;
            n = m;
            m = t;
        }
        //辗转相除法  r为余数
        long r = n % m;
        while(r != 0) {
            n = m;
            m = r;
            r = n % m;
        }
        return m;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n != 0) {  //输入个数为0则直接输出0，否则执行以下计算过程
            long fz[] = new long[n];
            long fm[] = new long[n];
            long zsum = 0, m = 1;//zsum为分子总和，m为分母乘积
            for(int i = 0; i < n; i++) {
                String fs = sc.next();
                String[] split = fs.split("/");

                fz[i] = Long.parseLong(split[0]);
                fm[i] = Long.parseLong(split[1]);

                m *= fm[i];// 把所有分母相乘，作为公倍数
            }
            for(int i = 0; i < n; i++){
                // fz[i] * (m / fm[i])  总分母除以各自分母等于一个倍数，再去乘分子
                // 最终加为总分子，这样分子前的负号不用管，直接运算
                zsum = zsum + fz[i] * (m / fm[i]);//求通分后的分子 ( 总分子 )
            }
            if(zsum != 0) {  //若分子之和为0则直接输出0，否则执行以下计算过程
                long g = gcd(zsum, m);//求最大公因数以便化简这个分数
                //如果分母等于最大公因数，说明可以整除
                if(g == m){
                    System.out.print(zsum / m);
                }
                else { //化简分子和分母
                    //分子、分母同除最大公因数
                    zsum = zsum / g;
                    m = m / g;
                    //如果分子大于分母，则为带分数，即假分数
                    if(zsum > m){
                        System.out.printf("%d %d/%d", zsum / m, zsum % m, m);
                    }
                    else{
                        System.out.printf("%d/%d", zsum, m);
                    }
                }
            }
            else{
                System.out.print(0);
            }
        }
        else{
            System.out.print(0);
        }
    }
}
