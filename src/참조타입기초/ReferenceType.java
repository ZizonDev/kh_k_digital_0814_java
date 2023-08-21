package 참조타입기초;
// java의 data type은 기본 타입과 참조 타입으로 나누어진다.
// 기본 타입은 실제 값이 변수에 저장됨. (정수, 실수, 문자, 논리값 등)
// 참조 타입은 객체의 주소를 변수에 저장. (배열, 열거형, 인터페이스, 클래스, 문자열)

public class ReferenceType {
    public static void main(String[] args) {
        // 기본 타입
        int age = 25;           // int형으로 선언된 변수 age에 25라는 정수값을 저장. (크기는 4Byte)
        double price = 100.5;   // double형으로 선언된 변수 price에 100.5라는 실수값을 저장. (크기는 8Byte)

        // 참조 타입
        String name = "곰돌이사육사";  // 문자열형으로 선언된 변수 name에 '곰돌이사육사'가 저장된 메소드 영역의 주소값을 저장. (크기 알 수 없음. but 운영체제가 64bit임. -> 주소 체계가 64bit = 8Byte임.)
        // if 참조 타입 변수를 초기화하지 않는 경우
        String address;             // 참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null 값을 가질 수 있다.

//        int unboxed = 0;            // 정수형으로 선언된 기본 타입 변수 -> 값을 대입해야 오류가 발생하지 않음.
//        Integer boxedValue = null;  // int형의 참조 타입 변수 -> 정수값 대신 주소값이 할당되어 있음. null의 경우에는 할당된 주소가 없다는 의미. 모든 자료형에는 객체타입이 있다.
//        int intValue = boxedValue;      // 객체 타입을 기본 타입으로 바꾸어 주는 형 변환 발생.
//        System.out.println(intValue);   // intValue가 가리키는 대상이 없음. [NullPointerException]

        String strVal1 = "나희도";                         // 리터럴 상수로 고정됨.
        String strVal2 = "나희도";
        String strVal3 = new String("나희도");     // Heap 영역에 메모리 공간을 확보함.

        // 참조 변수에서 ==와 != -> 값이 같냐 다르냐가 아니라 주소가 같냐 다르냐를 의미함.
        if (strVal1 == strVal3) {            // 참조하는 주소값이 같은지를 물어보는 것.
            System.out.println("strVal1과 strVal3는 참조하는 주소값이 같음.");
        } else {
            System.out.println("strVal1과 strVal3는 참조하는 주소값이 다름.");
        }

        if (strVal1 == strVal2) {            // 참조하는 주소값이 같은지를 물어보는 것.
            System.out.println("strVal1과 strVal2는 참조하는 주소값이 같음.");
        } else {
            System.out.println("strVal1과 strVal2는 참조하는 주소값이 다름.");      // strVal1과 strVal2는 내용은 같지만 각각 다른 주소값을 할당받고 있음.
        }

        if (strVal1.equals(strVal3)) {       // 포함된 내용, 즉 나타내는 문자열이 같은지를 물어보는 것.
            System.out.println("strVal1과 strVal3의 내용 자체가 같음.");
        } else {
            System.out.println("strVal1과 strVal3의 내용이 다름.");
        }

        if (strVal2.equals(strVal3)) {       // 포함된 내용, 즉 나타내는 문자열이 같은지를 물어보는 것.
            System.out.println("strVal1과 strVal3의 내용 자체가 같음.");
        } else {
            System.out.println("strVal1과 strVal3의 내용이 다름.");
        }
    }
}
