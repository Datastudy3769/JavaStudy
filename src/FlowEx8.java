import java.util.*;
public class FlowEx8 {
    public static void main(String[] args){
        System.out.println("주민번호를 입력하세요. >>");
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        char sex_num = regNo.charAt(7);

        switch (sex_num){
            case '1': case '3':
                System.out.println("남자");
                break;

            case '2': case '4':
                System.out.println("여자");
                break;

            default:
                System.out.println("유효하지 않은 주민번호입니다.");

        }
    }
}
