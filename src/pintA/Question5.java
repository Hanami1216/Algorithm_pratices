package pintA;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[][] record = new String[n][3];
        for (int i = 0; i < n; i++) {
            record[i][0] = input.next();
            record[i][1] = input.next();
            record[i][2] = input.next();

        }
        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            int tem = input.nextInt();
            for (int j = 0; j < n; j++) {
                if (tem == Integer.parseInt(record[j][1])) {
                    System.out.println(record[j][0] + " " + record[j][2]);
                    break;
                }
            }
        }
        input.close();

    }

}
