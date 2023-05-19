package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student() → 일꾼 : 생성자함수 or 생성자 메서드 , s1이라는 주소값 반환
        // s1 → 참조변수
        s1.id=1000;
        s1.name="학생1";
        s1.subject="과목1";
        s1.showInfo();
        System.out.println("s1 = " + System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id=1001;
        s2.name="학생2";
        s2.subject="과목2";
        s2.showInfo();
        System.out.println("s2 = " + System.identityHashCode(s2));

        Student s3 = s2; // s3이 s2의 주소값이 대입
        s3.id=1002;
        s3.name="학생3";
        s3.subject="과목3";
        s3.showInfo();
        s2.showInfo();
        System.out.println("s3 = " + System.identityHashCode(s3));


        System.out.println(s1); // exam02.Student@10f87f48
        System.out.println(s1.hashCode()); // 284720968
        System.out.println(System.identityHashCode(s1)); // 284720968

        System.out.println(s2); // exam02.Student@378fd1ac
        System.out.println(s2.hashCode()); // 932172204
        System.out.println(System.identityHashCode(s2)); // 932172204

        /*
        s1.id = 1000;
        s1.name = "학생";
        s1.subject = "과목";
        */
    }
}
