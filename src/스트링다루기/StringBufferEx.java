package 스트링다루기;
// StringBuffer, StringBuilder : 둘 다 문자열을 추가하거나 변경할 때 사용한다.
// StringBuffer : synchronize(동기화) 지원 / StringBuilder : 동기화 지원 X
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("java");
        System.out.println(sb);

        String st = "";         // String 초기화. "" 대신 null도 가능.
        st += "hello";
        st += " ";
        st += "java";
        System.out.println(st);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("jump to java");
        sb2.insert(1, "hello");        // insert(1, "hello") : index 1 자리부터 "hello"를 삽입한다.
        System.out.println(sb2);                 // jhelloump to java 출력됨.
        sb2.delete(10,12);                       // delete(10, 12) : index 10부터 12 미만까지 삭제한다.
        System.out.println(sb2);                 // jhelloump  java 출력됨.
        System.out.println(sb2.substring(1, 5)); // substring(1, 5) : index 1부터 5 미만까지만 출력한다.
    }
}
