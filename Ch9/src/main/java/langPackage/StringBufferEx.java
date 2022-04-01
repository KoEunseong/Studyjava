package langPackage;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append("23"); //같은 객체를 가르킨다.
        System.out.println(sb);
        sb.append('4').append("56");
        System.out.println(sb2);
        System.out.println(sb);

    }
}
