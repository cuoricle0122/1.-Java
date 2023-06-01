package exam01;

public class Ex05 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "학생1", "과목1");
        Student s2 = new Student(1000, "학생1", "과목1");
        System.out.println(s1 == s2); // false // == → 동일한 객체인지, 동일한 주소인지 // 동일성비교
        System.out.println("s1.hashCode() = " + s1.hashCode()); // 284720968
        System.out.println("s2.hashCode() = " + s2.hashCode()); // 1534030866
        System.out.println(s1.equals(s2)); // false


        int num1 = 10;
        int num2 = 10;
        System.out.println(num1 == num2); // true
    }
}
