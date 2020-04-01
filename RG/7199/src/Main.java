
/*題目內容:
題目內容:

定义Prime类中的静态方法prime。此方法功能判断输入参数是否是素数。如何是素数返回true，否则返回false

再main方法中调用prime静态方法，然后根据返回结果进行输出，如果返回true，则输出YES，否则输出NO

（提示：。一个大于1的自然数，除了1和它本身外，不能被其他自然数整除（除0以外）的数称之为素数（质数）；否则称为合数）


输入输出说明:

输入：
4
输出:
NO


*/
import java.util.Scanner;

class Prime {
	// Write your own code
	public static boolean prime(int a) {
	    if (a <= 3) {
	        return a > 1;
	    }
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}

public class Main {
	public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
             // Write your own code
            if(Prime.prime(n)==true) {
            	System.out.println("YES");
            }else {
            	System.out.println("NO");
            }
    }
}