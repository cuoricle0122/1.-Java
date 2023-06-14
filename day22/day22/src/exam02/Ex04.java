package exam02;

import static exam02.Transportation.*;

public class Ex04 {
    public static void main(String[] args) {
        int busFare = /*Transportation*/BUS.getTotal(10);
        System.out.printf("busFare=%d%n", busFare); // busFare=12500

        int taxiFare = /*Transportation*/TAXI.getTotal(2);
        System.out.printf("taxiFare=%d%n", taxiFare); // taxiFare=8000

        System.out.println(BUS.getName()); // 버스
        System.out.println(SUBWAY.getName()); // 지하철
        System.out.println(TAXI.getName()); // 택시


    }
}
