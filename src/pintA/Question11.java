package pintA;

import Util.ProgramTimeUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/14  22:21
 */
public class Question11 {
    public static void main(String[] args) {
        long elapsedTime1 = ProgramTimeUtil.time(() -> {
            Scanner input = new Scanner(System.in);
            String strA = input.nextLine();
            String strB = input.nextLine();

            // 将字符串B中的字符转换为一个字符数组
            char[] charsToRemove = strB.toCharArray();

            // 遍历字符数组，逐个将字符串A中匹配到的字符删除
            for (char c : charsToRemove) {
                strA = strA.replace(String.valueOf(c), "");
            }

            System.out.println(strA); // 输出结果：Ho or
        });


        System.out.println("时间:" + elapsedTime1);

        //方法2
        long elapsedTime2 = ProgramTimeUtil.time(() -> {
            Scanner input = new Scanner(System.in);
            String strA = input.nextLine();
            String strB = input.nextLine();
            StringBuilder sb = new StringBuilder();

            // 将字符串B中的字符转换为一个字符数组
            char[] charsToRemove = strB.toCharArray();

            // 使用StringBuilder将字符串A中未匹配到的字符拼接起来
            for (int i = 0; i < strA.length(); i++) {
                char c = strA.charAt(i);
                boolean match = false;

                // 判断字符是否出现在字符串B中
                for (char d : charsToRemove) {
                    if (c == d) {
                        match = true;
                        break;
                    }
                }

                // 如果字符未出现在字符串B中，则将其拼接到StringBuilder中
                if (!match) {
                    sb.append(c);
                }
            }

            String result = sb.toString();
            System.out.println(result); // 输出结果：Ho or
        });
        System.out.println("时间:" + elapsedTime2);
//        方法三
        long elapsedTime3 = ProgramTimeUtil.time(() -> {
            PrintWriter printWriter = new PrintWriter(System.out);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            char[] strB;
            char[] strA;
            try {
                strA = input.readLine().toCharArray();
                strB = input.readLine().toCharArray();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            boolean[] flag = new boolean[128];
            for (char i :
                    strB) {
                flag[i] = true;
            }
            for (char i :
                    strA) {
                if (!flag[i]) {
                    printWriter.print(i);
                }
            }
            printWriter.flush();
        });
        System.out.println("时间:" + elapsedTime3);

    }
}
