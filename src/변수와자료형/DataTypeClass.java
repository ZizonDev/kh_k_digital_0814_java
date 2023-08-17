package 변수와자료형;
// 변수 : 값을 저장할 수 있는 메모리 공간에 이름을 붙인 것.
public class DataTypeClass {
    public static void main(String[] args) {
        int age;            // 정수형 변수 선언, 4Byte(=32bit) 공간을 확보, 초기값은 아직 없음, 정수 값(소수점 이하가 없는 값)을 저장하는 목적.
        double value;       // 실수 값을 저장하기 위한 변수 선언.

//        int st1;          // 변수명 가장 앞에 숫자는 올 수 없음. class와 같은 예약어도 변수명이 될 수 없음.
//        int $$$___;       // 변수명에 특수문자는 _, $만 가능.
//        int ___123;       // okay.
//        int textRate;     // java는 camel 표기법 사용함.

        char gender = 'M';  // 선언과 동시에 초기화, gender라는 변수에 문자 값 M을 대입한다는 의미, 2Byte(=16bit) 공간을 확보(java는 유니코드 쓰기 때문에 2Byte).

        // 논리형 변수 선언 : 참과 거짓을 판별하기 위해서 사용하는 자료형.
        boolean isTrue = true; // java에서는 true를 1, false를 0으로 간주하지 않음. 키워드(true/false) 예약어만 사용할 수 있음.

        // 정수형 변수 선언 : 소수점 이하 자리가 없고, 양수와 음수가 존재.
        byte bNum;             // 1byte 크기의 변수 선언. 1Byte == 8bit. (-128 ~ 127)
        short sNum;            // 2byte 크기의 변수 선언.
        int iNum;              // 4byte, compiler는 int형으로 설계되어 있어서 일반적으로 int 많이 씀.
        long lNum;             // 8byte, 값이 약 21억보다 클 것 같으면 long 쓰자. 900경까지 표현 가능. 근데 뒷 자리 끊어버리는 요령도 있음.

        // 실수형 변수 선언
        float fNum;            // 4byte.
        double dNum;           // 8byte. 일반적으로 double 많이 씀. 근데 실수는 근사치로 계산하므로 정확하게 0, 1로 표현되지 않아서 프로그래밍에서는 실수 계산 지양.


        int num1, num2;        // 같은 타입의 변수를 동시에 선언할 수 있음. 콤마로 구분.
        double num3 = 3.14;    // 선언과 동시에 값을 초기화.
        double num4 = 1.23, num5 = 4.56;
        int hour = 4;
        int minute = 50;
        System.out.println(hour + "시 " + minute + "분 입니다.");

    }

    class nameCard {
        String name;
        String address;
        String eMail;
        String phoneNum;
    }
}