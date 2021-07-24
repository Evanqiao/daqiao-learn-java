/**
 * @author qiaoyihan
 * @date 2021/7/19
 */
public class Increment {
  public static void main(String[] args) {
    int a = 9;
    a++;
    // a = 10
    System.out.println("a = " + a);

    int b = ++a;
    // b = 11
    System.out.println("b = " + b);

    int c = a++;
    // a = 12
    System.out.println("a = " + a);
    // c = 11
    System.out.println("c = " + c);

  }
}
