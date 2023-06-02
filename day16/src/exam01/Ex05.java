package exam01;

public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("sb = " + System.identityHashCode(sb)); // sb = 1915910607

        sb.append("ABC");
        System.out.println("sb = " + System.identityHashCode(sb)); // sb = 1915910607

        sb.append("DEF");
        System.out.println("sb = " + System.identityHashCode(sb)); // sb = 1915910607

        sb.append("GHI");
        System.out.println("sb = " + System.identityHashCode(sb)); // sb = 1915910607

        System.out.println(sb); // ABCDEFGHI
        System.out.println("sb = " + System.identityHashCode(sb)); // sb = 1915910607

        String str = sb.toString();
        System.out.println(str); // ABCDEFGHI
        System.out.println("str = " + System.identityHashCode(str)); // str = 1389133897

        // StringBuffer → 진행중에는 변경되지 않으나 마지막에 주소 변경
    }
}
