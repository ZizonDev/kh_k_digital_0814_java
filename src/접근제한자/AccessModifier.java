package 접근제한자;

public class AccessModifier {
    public static void main(String[] args) {
        Modifier modifier = new Modifier();
        modifier.seoul();                   // public 접근
        modifier.busan();                   // protected 접근
        modifier.daegu();                   // default 접근
//        modifier.incheon();                 // private 접근 : Modifier가 아닌 다른 클래스에서 접근할 수 없음.
    }
}
