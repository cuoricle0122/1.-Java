package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // Company c1 = new Company();
        // Company c2 = new Company();

        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();
        Company c3 = Company.getInstance();
        System.out.println(c1); // exam01.Company@10f87f48
        System.out.println(c2); // exam01.Company@10f87f48
        System.out.println(c3); // exam01.Company@10f87f48
    }
}
