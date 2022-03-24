package LadderMatch2022;

import java.util.Arrays;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m ,n;
        m = in.nextInt();
        n = in.nextInt();
        int[][] arr = new int[m][n];
        int[][] result = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        char []s = in.next().toCharArray();
        for (char c : s) {
            switch (c) {
                case 'A':
                    result = A(arr, m, n);
                    break;
                case 'B':
                    result = B(arr, m, n);
                    break;
                case 'C':
                    result = C(arr);
                    break;
                case 'D':
                    result = D(arr);
                    break;
            }
            arr = result;
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if(j == result[i].length-1){
                    System.out.print(result[i][j]);
                    break;
                }
                System.out.print(result[i][j]+" ");
            }

            System.out.println();
        }

    }

    static int[][] A(int[][] arr,int m,int n) {
        int[][] result = new int[n][m];
        int index = m-1;
        for (int i = 0; i < m; i++,index--) {
            for (int j = 0; j < n; j++) {
                result[j][index] = arr[i][j];
            }
        }
        return result;
    }
    //逆时针90旋转矩阵
    static int[][] B(int[][] arr, int m, int n) {
        int[][] result = new int[n][m];
        int dst;
        for (int x = 0; x < m; x++) {
            dst = n -1;//因为要从最后一行向前赋值
            for (int y = 0; y < n ; y++,dst--) {
                result[dst][x] = arr[x][y];
            //在内循环中保持列不变，实现一列一列的赋值，同时也是从最后一行向前赋值
            }
        }
        return result;
    }
    static int[][] C(int[][] arr){
        int index;
        for (int i = 0; i < arr.length; i++) {
            index = arr[i].length-1;
            for (int j = 0; j < arr[i].length/2; j++,index--) {
                if(j!=index){
                    arr[i][j] =arr[i][j]^arr[i][index];
                    arr[i][index] =arr[i][j]^arr[i][index];
                    arr[i][j] =arr[i][j]^arr[i][index];
                }
            }
        }
        return arr;
    }
    static int[][] D(int[][] arr){
        int[][] result = new int[arr.length][];
        for (int i = arr.length-1,j=0; i >=0; i--,j++) {
            result[j] = arr[i];
        }
        return result;
    }
}
