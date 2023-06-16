package exam02;

public class Student {
    private int ban; // 반
    private String name; // 학생명
    private Character gender; // F, M

    public Student(int ban, String name, Character gender) {
        this.ban = ban;
        this.name = name;
        this.gender = gender;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
}
