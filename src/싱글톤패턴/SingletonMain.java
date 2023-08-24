package 싱글톤패턴;
// Singleton : 객체가 단 한 번만 생성되는 것.

public class SingletonMain {
    public static void main(String[] args) {
////        Singleton test = new Singleton();                 // 객체 생성 불가능!
//        Singleton object1 = Singleton.getSingleton();       // get 이용해서 생성해야 함.
//        Singleton object2 = Singleton.getSingleton();       // object1과 object2는 같은 주소를 갖는 동일한 값일 것임.
//        System.out.println(object1.id);
//        System.out.println(object1.name);
//        System.out.println(object2.id);
//        System.out.println(object2.name);
//        object1.id = 1004;
//        object1.name = "김예령";
//        System.out.println(object2.id);                     // object1이 수정되면 object2도 같이 수정됨.
//        System.out.println(object2.name);

        TestObject1 member1 = new TestObject1();
        TestObject2 member2 = new TestObject2();
        member1.setInfo("김예령", 330);               // TestObject1과 TestObject2가 모두 Singleton을 갖고있기 때문에 member1을 수정하면 member2도 동일하게 수정되어 출력된다.
        member2.viewInfo();
        for(int i = 0; i < 1000; i++){
            member1.setInfo("김예령", 330);
            member2.setInfo("김현호", 617);
        }
        member1.viewInfo();                                   // member1이 singleton에 먼저 진입했는데 syncronized 되지 않아(locking 안됨) member2가 sigleton 받은 경우임.
    }
}
