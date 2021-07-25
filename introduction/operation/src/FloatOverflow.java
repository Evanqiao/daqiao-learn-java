/**
 * @author qiaoyihan
 * @date 2021/7/25
 */
public class FloatOverflow {
  public static void main(String[] args) {
    // NaN
    double d = 0.0 / 0;
    // Infinity
    double e = 10.0 / 0;
    // -Infinity
    double f = -10.0 / 0;

    System.out.println(e);

    System.out.println(Double.isNaN(d));
    System.out.println(Double.isFinite(e));
    System.out.println(Double.isInfinite(f));
  }
}
