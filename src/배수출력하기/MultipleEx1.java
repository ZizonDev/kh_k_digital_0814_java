package 배수출력하기;

public class MultipleEx1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++){
            if(i % 7 == 0) {
                System.out.printf("%4d", i);
                if(i % 70 == 0) System.out.println();
            }
        }

        int count = 0;
        for(int i = 7; i <= 1000; i += 7) {
            count++;
            System.out.printf("%4d", i);
            if(count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }

//      int n;
//      for(n = 1; n <= 1000; n++){
//          if(n % 7 == 0) { System.out.printf("%4d", n); }
//          if(n % 70 == 0) { System.out.println(); }
//      }
//  }
}
