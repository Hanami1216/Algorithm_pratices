package pintA;


import java.util.Scanner;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2022/11/10  14:33
 */
public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] date = input.next().split(":");
        int hour = new Integer(date[0]);
        int minute = new Integer(date[1]);
        int times = hour;
        if(hour>=12){
            times = hour-12;
        }
        if(minute>0){
            times++;
        }
        if(times == 0 || hour < 12){
            System.out.print("Only "+date[0]+':'+date[1]+".  Too early to Dang.\n");
            // 退出程序
            System.exit(0);
        }
        for (int i = 0; i < times; i++) {
            System.out.print("Dang");
        }

    }
}
