package 연산자;
// 비트 연산자 : bit 단위의 연산을 수행합니다.
// AND : & (비교 대상인 두 bit가 모두 1이어야 결과값이 1.)   // & : 비트 연산자, && : 논리 연산자
// OR : | (비교 대상인 두 bit가 하나만 1이어도 결과값은 1.)
// XOR : ^ (비교 대상인 두 bit가 서로 다른 경우에만 결과값이 1.)
// NOT : ~ (현재의 bit 값을 반전시킴.)
// Left Shift : << (bit를 왼쪽으로 이동시킴.)
// Right Shift : >> (bit를 오른쪽으로 이동시킴.)

public class BitOperator {
    public static void main(String[] args) {
        int num1 = 10;                      // 십진법 10 = 이진법 00001010
        int num2 = 12;                      // 십진법 12 = 이진법 00001100
        System.out.println(num1 & num2);    // AND 연산 -> 이진법 00001000 = 십진법 8
        System.out.println(num1 | num2);    // OR 연산 --> 이진법 00001110 = 십진법 14
        System.out.println(num1 ^ num2);    // XOR 연산 -> 이진법 00000110 = 십진법 6
        System.out.println(~num1);          // NOT 연산 -> 10을 bit만 반전하면 부호 반대, 1씩 차이남. -> -11
        System.out.println(~num2);          // NOT 연산 ->  -13
        System.out.println(num1 << 1);      // Left Shift -> 이진법 00010100 = 십진법 20, 즉 [ <<1 == *2 ]
        System.out.println(num1 >> 1);      // Right Shift -> 이진법 00000101 = 십진법 5, 즉 [ >>1 == /2 ]
    }
}