
/*題目內容:

从键盘输入一个整数，在给定数组中查找该数，如果找到该数，输出其位置，否则输出“不在数组中”，给定数组int a[]={-2,1,4,5,8,12,17,23,45,56,90,100};

输入输出说明:

请输：8
输出：8是数组中的第4个元素
请输：22
输出：22不在数组中

*/
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a[] = { -2, 1, 4, 5, 8, 12, 17, 23, 45, 56, 90, 100 };
		int x = input.nextInt(), flag = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.println(x + "是数组中的第" + i + "个元素");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(x + "不在数组中");
		}
		input.close();
	}
}
