package generic연습1;

public class GenericEx1 {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("안유진");
        System.out.println(p1.info);
        Person<Integer> p2 = new Person<>(22);      // 타입 T 자리에는 int와 같은 기본형은 올 수 없고 객체 타입만 가능함.
        System.out.println(p2.info);

        Product<String, Integer> pr1 = new Product<>();
        pr1.setName("Smart TV");
        pr1.setYear(2023);
        System.out.println(pr1.getName() + " " + pr1.getYear());
        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(123123);
        pr2.setYear("2023");
        System.out.println(pr2.getName() + " " + pr2.getYear());
    }
}

class Person <T> {       // 기존의 String 이라는 데이터 타입을 T로 generic 함으로써 데이터 타입 자체가 변수가 될 수 있음. 즉 T 자리에 int,String,... 다 가능하다는 것.
    public T info;
    Person(T info) {
        this.info = info;
    }
}

class Product<T, M> {
    private T name;
    private M year;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }
}