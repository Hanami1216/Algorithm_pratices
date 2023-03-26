package LadderMatch2023;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String[] men = new String[]{"shaolin", "wudang", "kunlun", "emei", "huashan", "kongtong"};
        for (int i = 0; i < N; i++) {
            int sum = 0;
            char[] chars = input.next().toCharArray();
            int a = Integer.parseInt("" + chars[1] + chars[2] + chars[3] + chars[4]);
            int b = Integer.parseInt("" + chars[5] + chars[6] + chars[7] + chars[8]);
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            for (int j = a; j <= b; j++) {
                if (is(j)) {
                    char[] num = String.valueOf(j).toCharArray();
                    for (char c : num) {
                        sum += c - '0';
                    }
                }
            }
            if (sum % 6 == chars[0] - '0') {
                System.out.println(men[chars[0] - '0'] + " " + sum);
            } else System.out.println("Fighting!");
        }


    }


    public static boolean is(int N) {
        if (N <= 2) {
            return true;
        } else if (N > 3) {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}