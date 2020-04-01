/*題目內容:

创建一个类，为该类定义三个构造函数，从键盘输入两个int值，三个double值，两个字符串，分别执行下列操作：
1、传递两个整数值并找出其中较大的一个值
2、传递三个double值并求出其乘积
3、传递两个字符串值并检查其是否相同
4、在main方法中测试构造函数的调用

 
输入输出说明:

输入：
9 15
3.3 4.4 5.5
ab
ab
输出：
Larger value: 15
a*b*c = 79.86
Are equal: true 

*/
class Check {
   //write your code here
	public int Check(int a,int b) {
		if(a>b) {
		return a;
		}else {
			return b;
		}
	}
public double Check(double a,double b,double c) {
		return a*b*c;
	}
public String Check(String a,String b) {
	if(a.equals(b)) {
		
	}
	return ;
}
}

public class Main {
	public static void main(String args[]) {
        //write your code here
	
	}
}