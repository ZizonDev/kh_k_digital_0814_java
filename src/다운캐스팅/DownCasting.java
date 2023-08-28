package 다운캐스팅;

import java.util.ArrayList;

// 상위 클래스형으로 변환되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것.
public class DownCasting {
    ArrayList<Animal> animalList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        downCasting.testCasting();
    }

    public void addAnimal() {
        animalList.add(new Animal());
        animalList.add(new Human());
        animalList.add(new Tiger());
        animalList.add(new Eagle());
        for (Animal animal : animalList) {
            animal.move();
        }
    }

    public void testCasting() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);  // 업캐스팅 됐음.
            if (animal instanceof Human) {      // animal이 Human형으로 다운캐스팅 되는지 여부를 확인하는 것.
                Human h = (Human) animal;       // h는 원래 자기 자신의 클래스 Human에 대한 참조 변수이기 때문에 다운캐스팅 성공적.
                h.readBooks();                  // 다운캐스팅이 성공적으로 되면 readbooks 쓸 수 있음.
            } else if (animal instanceof Tiger) {
                Tiger t = (Tiger) animal;
                t.hunting();
            } else if (animal instanceof Eagle) {
                Eagle e = (Eagle) animal;
                e.flying();
            } else {
                System.out.println("지원되지 않는 자료형입니다.");
            }
        }
    }
}
