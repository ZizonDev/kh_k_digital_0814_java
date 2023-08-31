package 학생성적정렬하기;
// 5명의 학생에 대해 이름, 성적을 미리 입력한다.
// 성적이 높은 사람 순으로 정렬하고, 성적이 같으면 이름 순으로 정렬한다.

import java.util.TreeSet;

public class StudentSort {
    public static void main(String[] args) {
        TreeSet<StudentInfo> set = new TreeSet<>();
        set.add(new StudentInfo("김채원", 97));
        set.add(new StudentInfo("허윤진", 100));
        set.add(new StudentInfo("사쿠라", 64));
        set.add(new StudentInfo("카즈하", 77));
        set.add(new StudentInfo("홍은채", 64));
        System.out.println("=".repeat(5) + "성적 순 발표" + "=".repeat(5));
        for (StudentInfo e : set) {
            System.out.println(e.name + " : " + e.score + "점");
        }
    }
}
