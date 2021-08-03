import java.util.Scanner;

/**
 * @author qiaoyihan
 * @date 2021/8/1
 */
public class Input {
  public static void main(String[] args) {
    // 创建Scanner对象
    Scanner scanner = new Scanner(System.in);
    System.out.print("你的称呼: ");
    String name = scanner.nextLine();
    System.out.print("你的电话号码: ");
    String tel = scanner.next();
    System.out.print("你的代号: ");
    int no = scanner.nextInt();
    System.out.printf("%s, 代号:%d，电话:%s%n", name, no, tel);
  }
}
