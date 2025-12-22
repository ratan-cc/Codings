package switchCase;
/*switch with yield (Block case – Java 17)*/
public class Practice1 {
    static void main(String[] args) {
        int marks = 85;

        String grade = switch (marks / 10) {
            case 10, 9 -> {
                yield "A+";
            }
            case 8 -> {
                yield "A";
            }
            case 7 -> {
                yield "B";
            }
            default -> {
                yield "Fail";
            }
        };

        System.out.println(grade);

    }
}
