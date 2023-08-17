package 스위치문;
// 조건문의 일종이지만 조건에 조건식이 올 수 없고, 조건의 값이 와야 함.
// 조건 값이 가능한 자료형 : 정수, 문자, 문자열 가능. (실수는 불가능, 조건이 명확하지 않기 때문)
// cf) if-else문의 경우 조건에 조건식, 조건값 둘 다 가능함.
// 스위치문의 장점 : if-else문에 비해 가독성이 좋음. 성능이 약간 좋음.
// 스위치문의 단점 : 조건식이나 조건의 범위를 설정할 수 없음.
// 주의할 점 : case에 따른 실행문이 종료될 때 반드시 'break;'!!!!!

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ");
        String season = sc.next();
        switch(season) {
            case "Spring" :
            case "spring" :
            case "SPRING" :
            case "봄" :
                System.out.println("꽃이 피는 봄이 왔어요.");
                break;
            case "Summer" :
                System.out.println("무더운 여름입니다.");
                break;
            case "Fall" :
            case "Autumn" :                                 // Fall 이거나 Autumn이면 가을. (OR 조건과 비슷함)
                System.out.println("천고마비의 가을입니다.");
                break;
            case "Winter" :
                System.out.println("드디어 겨울이다!!!");
                break;
            default :
                System.out.println("계절을 잘못 입력하였습니다.");  // default는 위의 어떠한 case도 아닌 경우. break 안 걸어도 됨.

        }
    }
}
