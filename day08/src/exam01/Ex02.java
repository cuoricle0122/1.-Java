package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Schedule2 s1 = new Schedule2(2023, 5, 22);

        s1.showInfo(); // year=2023, month=5, day=22
        // s1.setYear(2023);
        // s1.setMonth(5);
        // s1.setDay(22);

        s1.printThis(); // this → exam01.Schedule2@10f87f48 → 객체의 주소값
        System.out.println(s1); // exam01.Schedule2@10f87f48

        Schedule2 s2 = new Schedule2();
        s2.showInfo(); // year=2023, month=5, day=23
    }
}
