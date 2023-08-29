package enum클래스2;

enum DevType {
    MOBILE, FRONTEND, BACKEND, DBA, BIGDATA
}
enum Career {
    JUNIOR, SENIOR
}
enum Gender {
    MALE, FEMALE
}

public class Developer {
    private String name;
    private DevType devType;
    private Career career;
    private Gender gender;

    public Developer(String name, DevType devType, Career career, Gender gender) {
        this.name = name;
        this.devType = devType;
        this.career = career;
        this.gender = gender;
    }

    public void DevInfo() {
        System.out.println("=".repeat(5) + "Developer" + "=".repeat(5));
        System.out.println("이 름 : " + name);
        System.out.println("업 무 : " + devType);
        System.out.println("경 력 : " + career);
        System.out.println("성 별 : " + gender);
        System.out.println();
    }
}
