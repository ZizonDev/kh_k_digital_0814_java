package hashSet기본;
// Hash Set : 중복 허용 X, 순서 보장 X, 집합과 유사한 개념.
// Collection(List, Set) -> add // Map(Hash Map) -> put

import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add ("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java");            // set은 중복을 허용하지 않으므로 add 되지 않음.
        for(String e : set) System.out.print(e + " ");
    }
}
