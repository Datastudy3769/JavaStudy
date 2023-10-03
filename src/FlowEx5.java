import java.util.*;
public class FlowEx5 {
    public static void main(String[] args){

        System.out.println("점수를 입력하세요. >>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int score = Integer.parseInt(tmp);


        System.out.printf("입력한 점수는 %d 입니다.%n",score);

        char grade;
        char opt = '0';
        if (score >=90) {
            grade = 'A';
            if(score >= 98) opt = '+';
            else if(score < 94) opt = '-';
        }else if (score >=80) {
            grade = 'B';
            if(score >= 88) opt = '+';
            else if(score < 84) opt = '-';
        }else grade = 'C';

        System.out.printf("학점은 %c%c 입니다.%n",grade,opt);




    }
}
