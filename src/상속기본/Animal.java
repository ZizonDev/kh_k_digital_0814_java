package 상속기본;

public class Animal {                   // 한 클래스 내에 여러 클래스를 둘 수 있지만 public은 한 번만 올 수 있음.
    String name;                        // 부모 클래스에서 private를 걸면 자식 클래스로 상속되지 않는다.
    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {              // Animal을 상속받아 생성된 class Dog.
    void sleep() {
        System.out.println(this.name + " zzz");         // 부모 클래스에서 없던 sleep 메소드를 자식 클래스에 추가 가능.
    }
}

class HouseDog extends Dog {
    void sleep() {                                          // 기존의 sleep 기능을 modify. (재정의, 수정)
       System.out.println(this.name + " zzz in house");     // 부모 Dog의 기능 [overriding].
    }
    void sleep(int hour) {                                  // 매개변수를 추가하여 HouseDog의 기능 [overloading].
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}