/**
 * @author qiaoyihan
 * @date 2021/8/1
 */
public class FormatOutput {
  public static void main(String[] args) {
    double d = 56233.456789;
    System.out.printf("%.3f\n", d);
    System.out.printf("%e\n", d);
    System.out.printf("原数据是:%f, 保留两位小数的数据是:%.2f\n", d, d);

    int a = 89;
    System.out.printf("%H", a);
  }
}
