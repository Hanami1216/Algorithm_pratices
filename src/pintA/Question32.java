package pintA;

import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        String c = input.next();
        input.nextLine();
        char[] str = input.nextLine().toCharArray();
        if (str.length < length) {
            for (int i = 0; i < length - str.length; i++) {
                System.out.print(c);
            }
            System.out.print(str);
        } else if (str.length == length) {
            for (char value : str) {
                System.out.print(value);
            }
        } else {
            for (int i = str.length - length; i < str.length; i++) {
                System.out.print(str[i]);
            }
        }
    }
}
