package javaCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*2. Write a program to check whether a number is even or odd.*/
public class Practice2 {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for(int n : list){

            if(n%2==0){
                System.out.println(n + " = Even number");
            }else {
                System.out.println(n + " = Odd number");
            }
        }
    }
}
