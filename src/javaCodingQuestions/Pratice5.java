package javaCodingQuestions;

public class Pratice5{
    public static void main(String[] args) {

        int number = 13231;
        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;      // get last digit
            reverse = reverse * 10 + digit;
            number = number / 10;         // remove last digit
        }

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
