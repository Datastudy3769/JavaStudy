import java.util.*;
public class FlowEx7 {
    public static void main(String[] args){
        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. >");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int user = Integer.parseInt(tmp);
        int com =(int) (Math.random()*3) + 1; //1,2,3 중 하나가 com에 저장됨, Math.random은 0과 1.0사이의 double 난수 발생
        System.out.println("당신은 "+ user + " 입니다.");
        System.out.println("컴퓨터는 "+ com + " 입니다.");
        switch (user-com){
            case -2: case 1:
                System.out.println("당신의 승리");
                break;

            case -1: case 2:
                System.out.println("컴퓨터의 승리");
                break;

            case 0:
                System.out.println("비김");
                break;
        }
    }
}
