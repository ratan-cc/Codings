package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Find the second largest element

Input: [22,33,43,11,55,70,66]
Output: 66*/
public class Practice5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(22,33,43,11,55,70,66));

        Collections.sort(list);
        int secondLargest = list.get(list.size()-2);
        System.out.println(secondLargest);
    }
}
