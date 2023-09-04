package 예외처리1;
// Unchecked Exception : 컴파일러가 체크하지 않는 예외. 주로 런타임 에러.

public class ExceptionEx1 {
    public static void main(String[] args){
        int[] arr = new int[5];
        try {                                       // try{의심가는 코드}
            for(int i = 0; i <= 5; i++) {           // Exception in thread "main" ... : Index 5 out of bounds for length 5 ... (Unchecked Exception)
                arr[i] = i;
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {   // catch(예외처리할 변수) {변수에 대한 예외처리 실행 방법}
            System.out.println(e);
            System.out.println("배열의 인덱스를 초과하였습니다. 값을 다시 확인하세요!!!");
        }
        System.out.println("프로그램 끝");
    }
}
