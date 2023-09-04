package 스트림3;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("민지", 100),
                new Student("다니엘", 99),
                new Student("해린", 88)
        );
        list.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + " " + score);
        });
        for(Student e : list) {
            String name = e.getName();
            int score = e.getScore();
            System.out.println(name + ":" + score);
        }
        list.parallelStream().forEach(s -> {            // parallelStream() : 병렬 처리. 여러 개의 코어를 동시에 가동.
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + ":" + score);
        });
    }
}
class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
