package 배열기본;
// 자바의 배열은 동일한 데이터 타입 요소들을 연속적으로 저장하는 자료 구조. (연속적인 메모리 공간에 할당됨. -> index를 알면 탐색에 용이함. but 정해진 배열 사이에 값을 추가하기 어려움.(중간에 삽입과 삭제가 불리함.))
// 중간 삽입, 삭제를 용이하게 하고 싶은 경우, array 대신 linkedlist 사용.
// index를 사용하여 각 요소에 접근할 수 있음. (index는 0부터 시작함.)
// 배열은 크기를 사전에 지정해야 함. (arraylist, vector는 크기가 가변적이므로 크기를 지정하지 않아도 괜찮음.)
// type[] 배열이름 = new type[배열 길이];
public class ArrayBasic {
    public static void main(String[] args) {
        int[] grade1 = new int[3];          // Heap 영역에 정수 3개를 저장할 메모리 공간을 확보.
        grade1[0] = 85;
        grade1[1] = 99;
        grade1[2] = 77;
//        grade1[3] = 33;                     // index 3 out of bounds for length 3.

        // 먼저 배열의 크기를 할당하고 이후에 초기화하는 방법.
        // 기본 for문
        for(int i = 0; i < grade1.length; i++){
            System.out.println(grade1[i] + " ");
        }
        // 향상된 for문 : 주어진 배열 등의 크기를 자동 순회함. 향상된 for문의 경우 내부의 배열 값을 변경할 수 없음. -> 오히려 빅데이터를 다룰 때 원본 데이터가 손상될 위험 적음.
        for(int e : grade1) {
            System.out.println(e + " ");
        }

        // 배열 만드는 또 다른 방법. 배열 값을 먼저 주기 때문에 크기를 할당할 필요 없음.
        int[] odd = {1, 3, 5, 7, 9};    // 이미 정해진 값을 배열에 대입하는 경우. 크기와 new를 사용하지 않아도 됨.
        String[] weeks = {"월요일", "화요일", "수", "목", "금", "토", "일"};  // weeks가 Stack 공간에 할당됨. -> Heap에 문자열의 주소값이 저장되어 있음. -> Static/Heap에 한 번 더 찾아가서 문자열 값 끌고 옴. [=이중 pointer]
        char[] weeks2 = {'월', '화', '수', '목', '금', '토', '일'};         // weeks2가 Stack 공간에 할당됨. -> Heap에 char형 문자값이 저장되어 있음.

        int[] grade2 = {88, 99, 56};    // 이미 값을 알고 있는 경우.
        int[] grade3 = new int[] {99, 88, 77};
        int[] grade4;                   // 객체 타입의 참조 변수이므로 실제 객체의 주소를 받아야 함.
        grade4 = new int[4];
        grade4[0] = 100;
        grade4[1] = 88;
        grade4[2] = 77;
        grade4[3] = 55;
        int sum = 0;    // 총점을 구하기 위한 정수형 변수 생성.

//        for (int i = 0; i < grade4.length; i++) {
//            grade4[i] += 10;                // 기본 for문에서는 원본 데이터를 변경할 수 있음.
//            sum += grade4[i];
//        }

//        for (int val : grade4) {            // 향상된 for문은 원본 데이터를 변경할 수 없음.
//            val += 10;
//            sum += val;
//        }
//        sum = 0;
//        for(int i = 0; i < grade4.length; i++) {  // grade4.length -> grade4의 배열 길이 확인.
//            grade4[i] += 10;
//            sum += grade4[i];
//        }
//        System.out.println("총점 : " + sum);
//        System.out.printf("평균 : %.2f\n", (double)sum/grade4.length);

        for (int e : grade4) sum += e;      // 총점 구하기, e에 저장된 4개의 배열 값 전체를 자동 순회하면서 sum 값에 더해줌.
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", (double)sum/grade4.length);        //%.2f는 실수값을 소수점 이하 두 자리까지. \n은 공백으로 구분하겠다.
    }
}
