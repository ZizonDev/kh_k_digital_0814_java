package generic연습2;

public class GenericEx2 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());        // <T>에서 material을 받기 때문에 Powder()의 괄호 안에는 아무것도 없어도 된다.
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);
    }
}
