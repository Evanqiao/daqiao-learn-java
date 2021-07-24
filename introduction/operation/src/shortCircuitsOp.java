/**
 * @author qiaoyihan
 * @date 2021/7/24
 */
public class shortCircuitsOp {
  public static void main(String[] args) {
    boolean b = (7 > 3) && (2 / 0 > 9);
    System.out.println(b);
  }
}
