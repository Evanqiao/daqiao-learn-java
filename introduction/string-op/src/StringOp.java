/**
 * @author qiaoyihan
 * @date 2021/7/26
 */
public class StringOp {
  public static void main(String[] args) {
    String s = "Hello";
    String t = s + " world.";
    System.out.println(t);

    String h = s + 123;
    System.out.println(h);

    String sub1 = t.substring(1);
    String sub2 = t.substring(2, 5);
    System.out.println("sub1 = " + sub1);
    System.out.println("sub2 = " + sub2);

    String ss = "Hello, Java!";
    ss = ss.substring(0, 7) + "Spring!";
    System.out.println(ss);

    String str1 = "hello";
    String str2 = "hello";
    System.out.println(str1 == str2);
  }
}
