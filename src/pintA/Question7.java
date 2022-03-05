package pintA;

import java.util.Scanner;

/*
输入格式：
输入在一行中给出一个整数，如：1234。

提示：整数包括负数、零和正数。

输出格式：
在一行中输出这个整数对应的拼音，每个数字的拼音之间用空格分开，行末没有最后的空格。如 yi er san si。
    0: ling
    1: yi
    2: er
    3: san
    4: si
    5: wu
    6: liu
    7: qi
    8: ba
    9: jiu
*/
public class Question7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str  = input.next();
        char []arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            switch (arr[i]){
                case '-':
                    System.out.print("fu");
                    break;
                case '0':
                    System.out.print("ling");
                    break;
                case '1':
                    System.out.print("yi");
                    break;

                case '2':
                    System.out.print("er");
                    break;
                case '3':
                    System.out.print("san");
                    break;
                case '4':
                    System.out.print("si");
                    break;
                case '5':
                    System.out.print("wu");
                    break;

                case '6':
                    System.out.print("liu");
                    break;
                case '7':
                    System.out.print("qi");
                    break;
                case '8':
                    System.out.print("ba");
                    break;
                case '9':
                    System.out.print("jiu");
                    break;
            }
            if(i!=arr.length-1){
                System.out.print(" ");
            }

        }
    }
}
