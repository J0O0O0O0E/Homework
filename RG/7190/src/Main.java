import java.util.Scanner;

/*�}Ŀ����:

��дһ����Add�����ྲ̬������ɼ���Ȳ����к͵Ĺ��ܣ��������У�ͨ��������������е���������͹��ʹ�ø÷�������õȲ����еĺ͡�

�������˵��:

���룺1 10 1
������� ��=55

*/
class Add{
	public static int sum(int a,int n,int x) {
		return n*a+n*(n-1)*x/2;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��="+Add.sum(input.nextInt(),input.nextInt(),input.nextInt()));
	}
}
