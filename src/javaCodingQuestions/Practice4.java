package javaCodingQuestions;
/*4. Write a program to swap two numbers without using a third variable.*/
public class Practice4 {
     public static void main(String[] args) {
        int a =40, b=6;

        System.out.println("A : " +a);
        System.out.println("B : " +b);

        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("A : " +a);
        System.out.println("B : " +b);
    }
}
