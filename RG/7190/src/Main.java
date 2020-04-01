import java.util.Scanner;

/*題目內容:

编写一个类Add，该类静态方法完成计算等差数列和的功能，在主类中，通过键盘输入差数列的首项、项数和公差，使用该方法，求该等差数列的和。

输入输出说明:

输入：1 10 1
输出内容 和=55

*/
class Add{
	public static int sum(int a,int n,int x) {
		return n*a+n*(n-1)*x/2;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("和="+Add.sum(input.nextInt(),input.nextInt(),input.nextInt()));
	}
}
