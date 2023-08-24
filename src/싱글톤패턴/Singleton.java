package 싱글톤패턴;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();   // static 안 붙여도 됨. static을 넣어줌으로써 명시적으로 한 번만 생성하겠다 선언 & 정적 메모리에 생성하겠다.
    private Singleton() {                                   // 생성자가 외부에서 호출되지 않도록 접근 제한함.
        name = "test";
        id = 100;
    }
    static Singleton getSingleton() {                       // 한 번 생성된 객체에 대한 주소를 반환하는 참조 변수 getSingleton 필요. (위에서 접근 제한했으니까)
        return singleton;
    }
}
