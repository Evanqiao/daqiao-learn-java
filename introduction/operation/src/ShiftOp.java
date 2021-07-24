/**
 * @author qiaoyihan
 * @date 2021/7/24
 */
public class ShiftOp {
  public static void main(String[] args) {
    // 989 = 0000 0000 0000 0000 0000 0011 1101 1101
    int base = 989;
    System.out.println(Integer.toBinaryString(base));

    // 61 = 0000 0000 0000 0000 0000 0000 0011 1101
    int a = base >> 4;
    // 1978 = 0000 0000 0000 0000 0000 0111 1011 1010
    int b = base << 1;
    // -146800640 = 1111 0111 0100 0000 0000 0000 0000 0000
    int c = base << 22;

    // 2074083328 = 0111 1011 1010 0000 0000 0000 0000 0000
    int d = c >>> 1;
  }
}
