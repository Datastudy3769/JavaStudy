import  java.util.*; //Scanner 클래스를 사용하기 위해 추가
public class FlowEx2 {
    public static void main(String[] args){
        int input;

        System.out.print("숫자 입력 >>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if(input==0){
            System.out.printf("입력하신 숫자는 %d 입니다.%n",input);
            System.out.printf("올바르게 입력하셨습니다.");
        }
        else{
            System.out.printf("입력하신 숫자는 %d 입니다.%n",input);
            System.out.printf("입력하신 숫자는 0이 아닙니다.");
        }

    }
}
