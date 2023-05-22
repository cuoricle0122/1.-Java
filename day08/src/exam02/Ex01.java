package exam02;

public class Ex01 {
    public static void main(String[] args){
        Student s1 = new Student(); // 생성자 메서드인 Student()는 주소값을 반환
        s1.id = 1000;
        s1.name = "학생1";
        s1.subject = "과목1";
        s1.showInfo(); // id=1000, name=학생1, subject=과목1

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "학생2";
        s2.subject = "과목2";
        s2.showInfo(); // id=1001, name=학생2, subject=과목2
        s1.showInfo(); // id=1001, name=학생2, subject=과목2
    }
}
