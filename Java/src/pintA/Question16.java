package pintA;

import java.util.Scanner;

/*一个合法的身份证号码由17位地区、日期编号和顺序编号加1位校验码组成。校验码的计算规则如下：

首先对前17位数字加权求和，权重分配为：{7，9，10，5，8，4，2，1，6，3，7，9，10，5，8，4，2}；然后将计算的和对11取模得到值Z；最后按照以下关系对应Z值与校验码M的值：

Z：0 1 2 3 4 5 6 7 8 9 10
M：1 0 X 9 8 7 6 5 4 3 2
现在给定一些身份证号码，请你验证校验码的有效性，并输出有问题的号码。

输入格式：
输入第一行给出正整数N（≤100）是输入的身份证号码的个数。随后N行，每行给出1个18位身份证号码。

输出格式：
按照输入的顺序每行输出1个有问题的身份证号码。这里并不检验前17位是否合理，只检查前17位是否全为数字且最后1位校验码计算准确。如果所有号码都正常，则输出All passed。*/
public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] value=new int[]{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        char[] M=new char[]{'1','0','X','9','8','7','6','5','4','3','2'};
        int N  =input.nextInt();
        Boolean print = true;
        String[] arr  = new String[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
            char[] judge = arr[i].toCharArray();
            int Z = 0;
            for (int j = 0; j < judge.length-1; j++) {
                if(judge[j]<'0'&&judge[j]>'9'){
                    System.out.println(arr[i]);
                    print = false;
                    break;
                }
                Z += (judge[j]-'0')*value[j];
            }
            Z=Z%11;
            if(judge[17]!=M[Z]){
                System.out.println(arr[i]);
                print = false;
            }

        }
        if(print){
            System.out.println("All passed");
        }


    }

}
/*import java.util.Scanner;

class Main{
    public static void main(String[] args)  {
        Scanner in =new Scanner(System.in);
        boolean flag=true;
        int n=in.nextInt();
        in.nextLine();
        int[] value=new int[]{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        char[] M=new char[]{'1','0','X','9','8','7','6','5','4','3','2'};
        for(int i=0;i<n;i++){
            int sum=0;
            char b[]=in.nextLine().toCharArray();
            for(int j=0;j<value.length&&j<b.length;j++){
                sum+=(b[j]-'0')*value[j];
            }
            if(b[17]!=M[sum%11]){
                System.out.println(b);
                flag=false;
            }
        }
        if(flag)
            System.out.println("All passed");
    }
}
*/
