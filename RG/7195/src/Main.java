
/*�}Ŀ����:
����1����λ����������ܺ������

�����ǽ�����ÿһλ�ϵ����ּ�9��

Ȼ�����10ȡ�࣬��Ϊ��λ�ϵ������֣�

��󽫵�1λ�͵�3λ�ϵ����ֻ�������2λ�͵�4λ�ϵ����ֻ�������ɼ��ܺ��������

�������˵��:
���룺
3245
�����
The encrypted number is 3421*/
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int number, digit1, digit2, digit3, digit4, newnum;
		int temp;
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		// WRITE CODE HERE
		int[] tmp = new int[5];
		for (int i = 1; i <= 4; i++) {
			tmp[i] = (number % 10 + 9) % 10;
			number /= 10;
		}
		tmp[0] = tmp[1];
		tmp[1] = tmp[2];
		tmp[2] = tmp[0];
		tmp[0] = tmp[3];
		tmp[3] = tmp[4];
		tmp[4] = tmp[0];
		int j = 1;
		newnum = 0;
		for (int i = 3; i >= 0; i--) {
			newnum += tmp[j] * Math.pow(10, i);
			j++;
		}
		scanner.close();
		System.out.println("The encrypted number is " + newnum);
	}
//��ʮ��ǧ
//ʮ��ǧ��
}
