package 해시맵기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();         // <String>은 key, <Integer>는 value.
        map.put("우영우", 99);                               // list.add()와 비슷한 개념. map에 값을 저장함.
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 70);                             // Map interface에서 Key는 중복을 허용하지 않음.(key는 내부적으로 set, 집합 개념) -> 나중에 저장된 값으로 설정됨.
        System.out.println("총 Entry 수 : " + map.size());  // key 동그라미가 중복되었으므로 map.size() == 4;

        System.out.println(map.get("최수연"));              // map.get(key) : 객체 찾기, key에 대한 값을 반환한다. (cf. list에서는 index로 검색했음.)
        System.out.println(map.get("동그라미"));

        for(String key : map.keySet()) {                   // map은 key와 value의 entry 구조이므로, key 부분만 돌리려면 map.keySet()을 입력해야 함! (그냥 map XXX)
            System.out.println(key + "\t" + map.get(key));
        }
        System.out.println();

        Set<String> keySet = map.keySet();                 // iterator(반복자) 사용하는 방법. key를 set 구조로 정의해 주고 시작함.
        Iterator<String> iter = keySet.iterator();         // keySet를 순회할 iterator를 찾아주는 것.
        while(iter.hasNext()) {                            // hasNext : keySet 안에 iter로 순회할 다음 값이 있냐 없냐.
            String key = iter.next();
            Integer value = map.get(key);
            System.out.println(key + "\t" + value);
        }
        System.out.println();

        map.remove("이준호");                          // map.remove(key) : 해당 Key 값이 속한 해당 entry를 삭제함.

        System.out.println(map.entrySet());
    }
}
