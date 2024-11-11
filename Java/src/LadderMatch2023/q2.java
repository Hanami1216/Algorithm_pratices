package LadderMatch2023;

import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/22  13:49
 */
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.next();
        if (num.contains("+")) {
            String[] str = num.split("\\+");
            System.out.printf("%.2f", Double.parseDouble(str[0]) + Double.parseDouble(str[1]));
        } else if (num.contains("-")) {
            String[] str = num.split("-");
            System.out.printf("%.2f", Double.parseDouble(str[0]) - Double.parseDouble(str[1]));
        } else if (num.contains("*")) {
            String[] str = num.split("\\*");
            System.out.printf("%.2f", Double.parseDouble(str[0]) * Double.parseDouble(str[1]));
        } else if (num.contains("/")) {
            String[] str = num.split("/");
            System.out.printf("%.2f", Double.parseDouble(str[0]) / Double.parseDouble(str[1]));
        } else System.out.println("123");

    }
}
