/**
 * @author: qiaoyihan
 * @date: 2021/7/19
 */
public class ArithmeticOperation {
  public static void main(String[] args) {
    int a = 45;
    int b = 160;

    int c = a + b;
    System.out.println("45 + 160 = " + c);
    c = a - b;
    System.out.println("45 - 160 = " + c);

    a = 9;
    b = 3;
    c = a / b;
    System.out.println("9 / 3 = " + c);

    a = 5;
    b = 2;
    c = a / b;
    System.out.println("5 / 2 = " + c);

    c = a % b;
    System.out.println("5 % 2 = " + c);

    float s = 9.8f;
    System.out.println(s % 3);
  }
}
