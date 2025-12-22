package javaCodingQuestions;

/*3. Write a program to find the largest of three numbers.*/

public class Practice3 {
    public static void main(String[] args) {
        int a=3, b=2, c=5;
        if(a>b && a>c){
            System.out.println(a + " is the largest." );
        }
        else if(b>a && b>c){
            System.out.println(b + " is the largest.");
        }
        else{
            System.out.println(c + " is the largest.");
        }
    }
}
