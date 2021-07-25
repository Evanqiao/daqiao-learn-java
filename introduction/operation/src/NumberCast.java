/**
 * @author qiaoyihan
 * @date 2021/7/25
 */
public class NumberCast {
  public static void main(String[] args) {
    double f = 89.98;
    // a = 89
    int a = (int) f;

    long b = 900L;
    a = (int) b;

    // 向上转换，不需要强制转换
    long c = a;
  }
}
