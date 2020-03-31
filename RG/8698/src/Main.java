/**/
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