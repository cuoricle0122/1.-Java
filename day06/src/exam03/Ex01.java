package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "학생1";
        s1.subject = "과목1";
        s1.showInfo();
        System.out.println(System.identityHashCode(s1)); // 1199823423

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "학생2";
        s2.subject = "과목2";
        s2.showInfo();
        System.out.println(System.identityHashCode(s2)); // 932172204
        
        Student s3 = s2;
        System.out.println(System.identityHashCode(s3)); // 932172204 주소값 동일
        s3.id = 1002;
        s3.name = "학생3";
        s3.subject = "과목3";
        s3.showInfo();

        System.out.println("s3 == s2 :" + (s3 == s2)); // true
        System.out.println("s1 == s2 :" + (s1 == s2)); // false

    }
}
