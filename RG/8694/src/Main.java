/*題目內容:

编写接口Muitiplication，定义mult方法，参数是两个double类型，
编写此接口的两种实现，一种是参数相乘后输出，一种是相连后输出，
并编写测试代码对所有方法进行测试。


输入输出说明:

输入：
5
输出：
25.0
10.0

*/
import java.util.Scanner;
interface Muitiplication{
      //write code here
	double mult(double a, double b);
	}
//write code here
class MuitiplicationImpl implements Muitiplication{
	public MuitiplicationImpl() {
	}

	@Override
	public  double mult(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}
}
class MuitiplicationImpls implements Muitiplication{
	public MuitiplicationImpls() {
	}

	@Override
	public double mult(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}

public class Main {
    public static void main(String[] args) {
    	Scanner sca = new Scanner(System.in);
    	double i = sca.nextDouble();
    	MuitiplicationImpl m = new MuitiplicationImpl();
    	System.out.println(m.mult(i,i));
    	MuitiplicationImpls ms = new MuitiplicationImpls();
    	System.out.println(ms.mult(i,i));
	}
}