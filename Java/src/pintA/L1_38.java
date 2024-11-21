package pintA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2024/11/21  下午8:26
 */
public class L1_38 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while (!(line = reader.readLine()).equals(".")){
            list.add(line);
        }
        if(list.size() <2){
            System.out.println("Momo... No one is for you ...");
        }else if(list.size() <14){
            System.out.println(list.get(1)+" is the only one for you...");
        }else {
            System.out.println(list.get(1)+" and "+list.get(13)+" are inviting you to dinner...");
        }
    }
}
