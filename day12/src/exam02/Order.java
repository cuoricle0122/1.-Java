package exam02;

public class Order implements Buy, Sell{
    public void buy(){
        System.out.println("구매!!");
    }

    public void sell(){
        System.out.println("판매!!");
    }

    @Override
    public void order() {
        // Buy.super.order(); → 2개 중 택1, 교통정리
        // Sell.super.order(); → 2개 중 택1, 교통정리
        System.out.println("주문"); // 본인 스스로 재정의
    }
}
