package 스트림4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx4 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("민지", 97),
                new Student("해린", 72),
                new Student("다니엘", 95),
                new Student("하니", 76),
                new Student("혜인", 89)
        );
        double average = list.stream()
                .mapToInt(Student::getScore)    // reduce나 sum은 마지막 값이 1개만 남고, filter는 조건에 맞는 값만 남는다면 map은 입력받은 값의 개수와 동일하게 남는다고 생각하면 됨.
                .average()                      // 중간 연산은 여러 개가 들어가도 된다.
                .getAsDouble();                 // 최종 연산.
        System.out.println("뉴진스 멤버들의 평균 점수 : " + average);
        System.out.println();

        IntStream stream = IntStream.rangeClosed(1, 100);       // 정수 1부터 100까지로 구성된 스트림 생성.
        int sum = stream.sum();
        System.out.println("1부터 100까지의 합계 : " + sum);
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