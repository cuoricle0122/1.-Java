package exam01;

public class Ex04 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("str = " + System.identityHashCode(str)); // str = 1915910607

        str += "DEF";
        //str = str + "DEF";
        System.out.println("str = " + System.identityHashCode(str)); // str = 1534030866

        str += "GHI";
        //str = str + "GHI";
        System.out.println("str = " + System.identityHashCode(str)); // str = 664223387

        // 위와 같이 하면 매번 주소가 생성되고 GC가 삭제하는 등 성능저하의 문제가 발생
    }
}
