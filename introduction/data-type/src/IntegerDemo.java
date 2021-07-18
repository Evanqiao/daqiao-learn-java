/**
 * @author: qiaoyihan
 * @date: 2021/7/18
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // byte类型
        byte aByte = 1;
        short b = 2;
        int c = 3368;
        // long型的结尾要加L
        long d = 67890L;

        System.out.println(aByte);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int f = -2147483648;
        // 加下划线更容易识别
        int gg = 2_000_000_000;
        // 十六进制
        int h = 0xff0000;
        // 二进制
        int bin = 0b1000000000;
    }
}
