package exam01;

public class Student {
    int id;
    String name;
    String subject;

    public Student(){
        id = 1000;
        name = "학생1";
        subject = "과목";
    }

    public Student(String name){
        name = name;
    }

    public Student(int id2, String name2, String subject2){
        id=id2;
        name=name2;
        subject=subject2;
    }

    void showInfo(){
        System.out.printf("id=%d, name=%s, subject=%s", id, name, subject);
    }
}
