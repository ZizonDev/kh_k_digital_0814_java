package 예외처리2;
// Checked Exception : 컴파일러가 컴파일 타임에 예외를 체크. throw or try-catch로 예외처리 반드시 해야 함.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionEx2 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));     // checked 예외 (FileNotFoundException)
            br.readLine();                                                                  // checked 예외 (IO Exception) -> throw or try-catch로 예외처리하게끔 자바에서 강제.
            br.close();                                                                     // 일반적으로 IOException으로 포괄하여 예외처리한다.
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("파일이 존재하지 않습니다. 다시 첨부하세요!!!");
        }
    }
}
