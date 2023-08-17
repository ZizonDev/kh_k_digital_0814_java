package 형변환;
// 형 변환 : 하나의 데이터 타입을 다른 타입으로 변환하는 것.
// 명시적 형 변환 : 개발자가 의도를 갖고 형 변환하는 것.
// 묵시적 형 변환 : 컴파일러가 자동으로 형 변환해주는 것. (유리한 방향으로 변환)
public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
//        double result1 = num1 / num2;           // 묵시적 형 변환이 발생하지 않음.
//        double result2 = (double)num1 / num2;   // 명시적(num1), 묵시적(num2) 형 변환이 발생.
//
//        System.out.println(result2);

//        int kor = 90;           // if String kor = "90"이면 숫자 90이 아님. 더할 수가 없는 값.
        String kor = "90";
//        int intKor = Integer.parseInt(kor);         // 문자열을 숫자로 변환하는 method.
        int mat = 88;
        int eng = 55;
        int total = Integer.parseInt(kor) + mat + eng;             // 총점
        double avg = (double)total / 3;             // 평균, 만약 명시적 형 변환 안해줬다면 값은 소수점 이하로 다 버린 값으로 출력.

        System.out.println(avg);
    }
}
