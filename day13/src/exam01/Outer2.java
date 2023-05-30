package exam01;

public class Outer2 {
    public Calculator cal = new Calculator() {
        public int add(int num1, int num2){
            return num1 + num2;
        }
    };
    public Calculator method(){
        // Calculator cal → 생성된 객체의 주소
        // Calculator 객체 → 힙에 생성이 되어 있다
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            }
        };

        return cal; // 생성된 Calculator 주소값

        // int result = cal.add(10, 20);
        // System.out.println(result);
        
        // 연산 종료 - cal - 스택에서 제거
    }
}

