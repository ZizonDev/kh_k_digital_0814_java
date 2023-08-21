package 문자열다루기;
// String : java에서 문자열을 나타내는 자료형, 참조 타입 자료형.

public class StringMethod {
    public static void main(String[] args) {
        // equals : 두 개의 문자열의 실제 내용이 동일한지를 비교하여 결과값을 리턴함. ( true / false )
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = "Hello";
        String e = new String("hello");

        System.out.println(a.equals(b));            // false
        System.out.println(a.equals(c));            // true
        System.out.println(a.equals(d));            // false
        System.out.println(a.equalsIgnoreCase(d));  // equalsIgnoreCase() : 문자열을 비교할 때 대소문자를 구분하지 않는 경우.
        System.out.println(a.equals(e));            // true
        System.out.println(a == e);                 // a와 e의 실제 내용은 동일하지만 할당된 주소값은 다름.

        // indexOf : 문자열에서 특정 문자가 시작되는 index를 반환.
        System.out.println(a.indexOf("l"));         // hello에서 l이 시작되는 위치 -> index 2.
        System.out.println(a.indexOf("lt"));        // hello에서 lt가 시작되는 곳은 없음 -> -1.

        // contains : 문자열에서 특정 문자열이 포함되어 있는지 여부를 반환. (공백도 문자열로 인식함.)
        System.out.println(a.contains("lo"));       // true
        System.out.println(a.contains("lt"));       // false

        // charAt : 문자열에서 특정 위치의 문자(char)를 리턴함.
        System.out.println(a.charAt(4));            // o (index는 0부터 시작함.)

        // replaceAll : 문자열 중 특정 문자열을 다른 문자열로 바꿀 때 사용.
        String f = "Hello Java";
        System.out.println(f.replaceAll("Java", "World"));      // (regular expression) 정규식이라는 규칙을 포함하여 바꿀 수 있다.
        System.out.println(f.replace("Java", "World!!!"));      // (target) target 문자열을 다른 문자열로 대체하는 것.
        System.out.println(f.replaceAll("Java", ""));           // 특정 문자 "World" 삭제.

        // substring : 문자열 중 특정 부분을 뽑아낼 때 사용.
        System.out.println(f.substring(4));                             // o Java 출력됨. (index4부터 끝까지 추출.)
        System.out.println(f.substring(4,7));                                     // o J 출력됨. (index 4부터 index 7 미만까지 추출.)

        // toUpperCase / toLowerCase : 문자열 전부를 대문자 / 소문자로 변경할 때 사용.
        System.out.println(f.toUpperCase());                                      // HELLO JAVA
        System.out.println(f.toLowerCase());                                      // hello java

        // trim() : 문자열 앞뒤의 공백을 잘라냄. 로그인 창과 같은 입력 창을 생성할 때 공백을 넣어도 공백 날리고 로그인될 수 있게.
        String oldStr = "      자바 프로그래밍    ";
        String newStr = oldStr.trim();
        System.out.println(oldStr);
        System.out.println(newStr);

        // split : 문자열을 특정 구분자로 분리하는 method.
        String time = "15시:22분:30초";
        String[] modifiedTime = time.split(":");
        for(String element : modifiedTime) System.out.print(element + " ");       // 자주 나오는 문제.
        System.out.println();

        // 문자열 formatting
        System.out.printf("I ate %d apples.\n", 3);                     // 문자열 formatting을 출력을 위해 사용(일회용). 출력 이후 서식 사라짐.
        String test = String.format("I ate %d apples.", 3);             // 서식을 설정해서 test에 저장.
        System.out.println(test);                                       // 서식이 사라지지 않고 출력됨.

        // toCharArray : 문자열을 문자 배열로 변환.
        String testName = "James";
        char[] chName = testName.toCharArray();
        for(char element2 : chName) System.out.print(element2 + " ");
    }
}
