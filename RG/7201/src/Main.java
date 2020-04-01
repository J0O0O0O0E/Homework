/*題目內容:

定义一个 point类，该类具有两个构造方法。

按顺序实现下属操作：

1.定义一个point类的对象A，用参数（x,y）初始化。（x,y从键盘输入）

2.定义一个point类的对象B，用A初始化B。

3.输出B.GetX()。

4.调用fun1()，对象B作为fun1的实参。

5.执行 B=fun2()。

6.输出 B.GetX()。
输入输出说明:

输入：
4 5
输出：
4
4
1

*/ 
import java.util.Scanner; 
 class Point {
    
	private  int x;
	private  int y;
	
	public Point(int xx,int yy)	//构造方法
	{
		this.x=xx;
		this.y=yy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
   //write your code
	public static void fun1(Point p)
	{
		System.out.println(p.getX());
	}
	
	public static Point fun2()
	{
		Point A =new Point(1,2);
		return A;
	}

}
 public class Main{
    public static void main(String[] args) {
      //write your code
    	Scanner in=new Scanner(System.in);
    	Point A=new Point(in.nextInt(),in.nextInt());
    	Point B=A;
    	System.out.println(B.getX());
    	Point.fun1(B);
    	B=Point.fun2();
    	System.out.println(B.getX());
	}

}