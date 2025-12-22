package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*Remove duplicates from ArrayList

Input: [1,2,2,3,3,4]
Output: [1,2,3,4]*/
public class Practice3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,3,4));
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer n : list){
            if(!uniqueList.contains(n)){
                uniqueList.add(n);
            }
        }

        System.out.println(uniqueList);
    }
}
