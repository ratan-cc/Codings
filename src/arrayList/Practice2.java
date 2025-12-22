package arrayList;

/*. Count even and odd numbers

Input: [10, 15, 20, 25, 30]*/

import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,15,20,25,30));

        int even = 0, odd = 0;

        for(int n : list){
                if(n%2==0){
                    even++;
                }else {
                    odd++;
                }
        }

        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
