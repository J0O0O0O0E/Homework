
/*�}Ŀ����:

���뻪���¶�f�����㲢�����Ӧ�������¶�c��c=5*(f-50)/9+10.
�������˵��:

����:
17.2
�����
The temprature is -8.22

*/
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double f = input.nextDouble();
		System.out.printf("The temprature is %.2f", (5 * (f - 50) / 9 + 10));
		input.close();
	}

}
