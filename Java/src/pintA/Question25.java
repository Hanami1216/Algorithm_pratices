package pintA;

import java.util.Scanner;

public class Question25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        String[] num = s.split("\\s+");//以空格拆分字符串
        int flag1 = 1;
        int flag2 = 1;
        int a = 0, b = 0;

        if (num.length > 2) {    //如果拆分数组的长度大于2说明有多个空格
            flag2 = 0;
        }
        try {
            a = Integer.parseInt(num[0]);
            if (a < 1 || a > 1000) {
                flag1 = 0;
            }
        } catch (Exception e) {
            flag1 = 0;
        }

        try {
            b = Integer.parseInt(num[num.length - 1]);
            if (b < 1 || b > 1000) {
                flag2 = 0;
            }
        } catch (Exception e) {
            flag2 = 0;
        }


        if (flag1 == 0) {
            System.out.print("? + ");
        } else {
            System.out.print(a + " + ");
        }

        if (flag2 == 0) {
            System.out.print("? = ");
        } else {
            System.out.print(b + " = ");
        }

        if (flag1 == 0 || flag2 == 0) {
            System.out.println("?");
        } else {
            System.out.println(a + b);
        }
    }
}