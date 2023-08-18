package 회원정보예제;
// 이름 : 문자열
// 나이 : 정수, 나이는 1 ~ 199를 정상 입력으로 간주. 이외의 값이 오면 재입력 요구.
// 성별 : 문자 'M', 'F' 입력받고 "남성", "여성"으로 출력.
// 직업 : 정수로 입력받고 문자열로 출력. (1 - 학생, 2 - 회사원, 3 - 주부, 4 - 무직), 1 ~ 4 이외의 값이 오면 재입력 요구.
// 결과는 한 번에 출력.

import java.util.Scanner;

public class MemberInfo {
    String name;                                // not 지역변수, 인스턴스 필드라고 함. name이 블럭 밖에서 선언되어서 전체에 영향을 미치기 때문. (instance : 객체 소속의 변수)
    int age;                                    // age가 뭘로 주어질 지는 모르니까 객체지향으로 구현. 근데 사용자에 따라 age가 주어지면 그걸 저장해야되는데 그 저장소가 instance field.
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName() {                                     // 결과값을 반환할 게 없고 수행문만 하면 끝나는 경우 void 사용.
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
    }

    public void setAge() {
        while(true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if(age > 0 && age < 200) break;                     // break대신 return을 쓸 수도 있음. return 썼을 때 여기까지 왔다가 되돌아 감. 여기서 void를 써서 반환값이 없으므로 return도 가능한거임.
            System.out.println("나이를 잘못 입력하였습니다.");      // else 안 넣어도 이미 앞전에 break로 빠져나오니까 else 안 넣어도 됨.
        }
    }                                                           // <- break가 여기까지 왔다가 되돌아감.

    public void setGender() {
        while(true) {
            System.out.print("성별을 입력하세요 : ");
            gender = sc.next().charAt(0);                       // 문자열에서 맨 앞 문자 추출.
            switch (gender) {
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    return;
                default:
                    System.out.println("성별을 잘못 입력하였습니다.");
                    // continue;
            }
        // break return 자리에 쓰고 여기에 한 번 더 쓰면 만약 디폴트 됐을 때 switch문은 빠져나가지만 while문은 계속 못 빠져나오게 됨.
        }
    // 수행해야할 게 있을 땐 continue 쓴다.
    }

    public void setJobs() {
        while(true) {
            System.out.print("직업을 입력하세요 : ");
            jobs = sc.nextInt();
            if (jobs > 0 && jobs < 5) break;
            System.out.println("직업을 잘못 입력하였습니다.");
        }
    }

    public int getGenderType() {
        if (gender == 'M' || gender == 'm') return 1;               // 결과 값을 int로 반환. -> if 'M' -> getGenderType(1) -> genderStr[getGenderType()];
        else return 2;
    }


    public void getInfo() {
        String[] genderStr = {"", "남성", "여성"};                  // 중괄호 속 공백은 인덱스 0 위치.
        String[] jobsStr = {"", "학생", "회사원", "주부", "무직"};        // 공백 없애면 인덱스 번호와 문제에서 직업별로 할당된 번호가 1 차이나게 됨.
        System.out.println("=".repeat(5) + "회원 정보" + "=".repeat(5));
        System.out.println("이 름 : " + name);
        System.out.println("나 이 : " + age);
        System.out.println("성 별 : " + genderStr[getGenderType()]);
        System.out.println("직 업 : " + jobsStr[jobs]);
    }
}