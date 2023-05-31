package shortage;

import java.util.Scanner;

public class N3_Scanner {
    public static void main(String[] args) {
        // 스캐너

        // nextInt(): 정수 값을 입력받습니다
        // nextDouble(): 실수 값을 입력받습니다
        // nextLine(): 문자열을 입력받습니다
        // nextBoolean(): 불리언 값을 입력받습니다

        // 1. Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 2. 정수 입력 받기
        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();
        System.out.println("입력한 정수: " + num);

        // 3. 문자열 입력 받기
        System.out.print("이름을 입력하세요: ");
        scanner.nextLine();  // 이전에 입력받은 엔터(\n)를 소비하기 위해 추가
        String name = scanner.nextLine();
        System.out.println("입력한 이름: " + name);

        // 4. 실수 입력 받기
        System.out.print("실수를 입력하세요: ");
        double decimal = scanner.nextDouble();
        System.out.println("입력한 실수: " + decimal);

        // 5. 불리언 입력 받기
        System.out.print("참 또는 거짓을 입력하세요: ");
        boolean bool = scanner.nextBoolean();
        System.out.println("입력한 값: " + bool);

        // 6. 스캐너 닫기
        scanner.close();
    }
}
