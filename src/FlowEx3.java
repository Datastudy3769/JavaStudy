import java.util.*;
public class FlowEx3 {
    public static void main(String[] args){
        System.out.println("숫자를 입력해주세요 >>");
        Scanner scanner = new Scanner(System.in); //객체 생성
        String tmp = scanner.nextLine(); //값 입력 받기
        scan(tmp); //입력받은 값을 scan함수에 삽입
    }
    public static void scan(String str){
        int input;
        input = Integer.parseInt(str);
        System.out.printf("%d 를 입력함",input);
    }

}


