import java.util.*;
public class FlowEx9 {
    public static void main(String[] args){
        System.out.println("점수를 입력하세요.(0~100) >>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int score = Integer.parseInt(tmp);
        char grade =' ';

        switch (score/10){
            case 10: case 9:
                grade = 'A';
                break;

            case 8: case 7:
                grade = 'B';
                break;

            case 6:
                grade = 'C';
                break;

            default:
                grade = 'F';

        }
        System.out.printf("성적은 %c 입니다.",grade);
    }
}
