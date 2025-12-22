package arrayList;
/*Find the sum of elements in an ArrayList

Input: [1, 2, 3, 4, 5]
Output: 15*/

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int sum = 0;

        for (int n : list ){
            sum += n;
        }

        System.out.println(sum);
    }
}
