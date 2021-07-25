/**
 * @author qiaoyihan
 * @date 2021/7/25
 */
public class NumOverflow {
  public static void main(String[] args) {
    int intMin = Integer.MIN_VALUE;
    int intMax = Integer.MAX_VALUE;

    int a = intMax + 10;
    int b = intMin - 10;

    System.out.println(a);
    System.out.println(b);

    System.out.println(Integer.toBinaryString(a));
  }
}
