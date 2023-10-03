import java.util.*;
public class ScannerEx {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //Scanner 클래스의 객체를 생성

        System.out.print("두자리 정수를 입력>>");

        String input = scanner.nextLine();//입력받은 내용을 input에 저장
        int num =Integer.parseInt(input); //input 값을 Integer로 변환

        System.out.printf("입력한수 : %d",num);


    }
}