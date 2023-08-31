package properties기본;
// Properties : Map 컬렉션의 일종. key와 value가 모두 String 타입으로 제한된 형태.
// 주로 local storage에 cookie 대신 저장할 때 사용함.

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesMain {
    public static void main(String[] args) throws IOException { // 파일 없으면, 파일이름, 경로, ... 잘못되면 어떡할거냐. Input Output Exception(예외 처리) 필요.
        Properties properties = new Properties();
        String path = PropertiesMain.class.getResource("../커피메뉴만들기/database.properties").getPath();     // 현재 위치에서 뒤로가기 -> ../
        path = URLDecoder.decode(path, "utf-8");    // 한글 패키지명 처리를 위해 uniCode uff-8로 경로 디코딩.
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
