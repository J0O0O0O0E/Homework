
/*�}Ŀ����:
�}Ŀ����:

����Prime���еľ�̬����prime���˷��������ж���������Ƿ����������������������true�����򷵻�false

��main�����е���prime��̬������Ȼ����ݷ��ؽ������������������true�������YES���������NO

����ʾ����һ������1����Ȼ��������1���������⣬���ܱ�������Ȼ����������0���⣩������֮Ϊ�������������������Ϊ������


�������˵��:

���룺
4
���:
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